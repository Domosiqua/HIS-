package com.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.common.Result;
import com.domain.*;
import com.domain.dto.EmployeeDTO;
import com.service.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author CWB
 * @version 1.0
 */
@SuppressWarnings({"all"})
@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private RegistLevelService registerLevelService;
    @Autowired
    private SchedulingService schedulingService;

    /**
     * 员工登录
     * @param request
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/login")
    public Result<Employee> login(HttpServletRequest request, @RequestBody Employee emp){

        Employee employee = employeeService.isexistByUsername(emp.getRealname());
//        String password = DigestUtils.md5DigestAsHex(emp.getPassword().getBytes());
        String password =emp.getPassword();
        System.out.println(emp);
        if (employeeService.isexistByUsername(emp.getRealname())==null)
            return Result.error("该用户不存在");

        if (!(employee.getPassword().equals(password)))
            return Result.error("账号或密码错误");

        if(employee.getDelmark()!=1)
            return Result.error("该账号已禁用");

        request.getSession().setAttribute("employee",employee.getId());
        return Result.success(employee);

    }

    /**
     * 员工登出
     * @param request
     * @return
     */
    @PostMapping("/logout")
    public Result<String> login(HttpServletRequest request){
        request.getSession().removeAttribute("employee");
        return Result.success("退出成功");
    }

    /**
     * 员工列表
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("/page")
    public Result<IPage<EmployeeDTO>> page(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize, String name){
        IPage page1=new Page(page,pageSize);
        LambdaQueryWrapper<Employee> queryWrapper =new LambdaQueryWrapper();
        queryWrapper.like(StringUtils.isNotEmpty(name),Employee::getRealname,name);
        employeeService.page(page1, queryWrapper);
        List<Employee> records1 = page1.getRecords();
        List<EmployeeDTO> records = new ArrayList<>();

        for(Employee employee : records1) {
            EmployeeDTO dto = new EmployeeDTO();
            BeanUtils.copyProperties(employee, dto);
            Department byId = departmentService.getById(employee.getDeptmentId());
            if(byId!=null)
                dto.setDeptName(byId.getDeptName());
            RegistLevel byId1 = registerLevelService.getById(employee.getRegistLevelId());
            if(byId1!=null)
                dto.setRegistName(byId1.getRegistName());
            Scheduling byId2 = schedulingService.getById(employee.getSchedulingId());
            if (byId2!=null)
                dto.setRuleName(byId2.getRuleName());
            records.add(dto);
        }
        page1.setRecords(records);
        return Result.success(page1);
    }

    /**
     * 添加员工
     * @param employee
     * @return
     */
    @PostMapping
    public Result<Boolean> insert(HttpServletRequest request,@RequestBody Employee employee){
        employee.setPassword("123456");
        employee.setDelmark(1);
        System.out.println(employee);
        boolean save = employeeService.save(employee);
        if (save)
            return Result.success(save);
        else
            return Result.error("数据异常");
    }

    /**
     * 编辑与修改状态
     * @param request
     * @param emp
     * @return
     */
    @PutMapping
    public Result<Boolean> ChangeStatus(@RequestBody Employee emp){
        boolean b = employeeService.updateById(emp);
        if(b)
            return Result.success(b);
        else{
            return Result.error("数据异常");
        }

    }

    /**
     * 根据id查找员工
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<EmployeeDTO> selectByid(@PathVariable Long id)
    {

        Employee emp = employeeService.getById(id);
        EmployeeDTO tmp=new EmployeeDTO();
        BeanUtils.copyProperties(emp, tmp);
        if(emp==null){
            return  Result.error("未知错误");
        }
        List<Department> list = departmentService.list();
        tmp.setDepartmentlist(list);
        List<RegistLevel> list1 = registerLevelService.list();
        tmp.setRegistlevellist(list1);
        List<Scheduling> list2 = schedulingService.list();
        tmp.setSchedulinglist(list2);
        Department byId = departmentService.getById(tmp.getDeptmentId());
        tmp.setDeptName(byId.getDeptName());
        RegistLevel byId1 = registerLevelService.getById(tmp.getRegistLevelId());
        tmp.setRegistName(byId1.getRegistName());
        Scheduling byId2 = schedulingService.getById(emp.getSchedulingId());
        tmp.setRuleName(byId2.getRuleName());

        return  Result.success(tmp);
    }
    @GetMapping()
    public Result<EmployeeDTO> getdetail()
    {
        EmployeeDTO tmp=new EmployeeDTO();
        List<Department> list = departmentService.list();
        tmp.setDepartmentlist(list);
        List<RegistLevel> list1 = registerLevelService.list();
        tmp.setRegistlevellist(list1);
        List<Scheduling> list2 = schedulingService.list();
        tmp.setSchedulinglist(list2);
        return  Result.success(tmp);
    }
}
