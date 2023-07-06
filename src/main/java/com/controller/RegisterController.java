package com.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.common.Result;
import com.domain.Department;
import com.domain.Employee;
import com.domain.RegistLevel;
import com.domain.Register;
import com.domain.dto.EmployeeDTO;
import com.service.DepartmentService;
import com.service.EmployeeService;
import com.service.RegistLevelService;
import com.service.RegisterService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author CWB
 * @version 1.0
 */
@SuppressWarnings({"all"})

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private RegisterService registerService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private RegistLevelService registLevelService;
    @Autowired
    private DepartmentService departmentService;

    @GetMapping()
    public Result<EmployeeDTO> detail(@RequestParam String deptmentId,@RequestParam String registLevelId){
        EmployeeDTO dto =new EmployeeDTO();
        List<RegistLevel> list = registLevelService.list();
        dto.setRegistlevellist(list);
        List<Department> list1 = departmentService.list();
        dto.setDepartmentlist(list1);
        LambdaQueryWrapper<Employee> wrapper=new LambdaQueryWrapper<>();
        wrapper.eq(StringUtils.isNotEmpty(deptmentId),Employee::getDeptmentId,deptmentId);
        wrapper.eq(StringUtils.isNotEmpty(registLevelId),Employee::getRegistLevelId,registLevelId);
        List<Employee> list2 = employeeService.list(wrapper);
        dto.setEmployeelist(list2);
        return Result.success(dto);
    }
    @GetMapping("/page")
    public Result<IPage<Register>> page(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize, String realName){
        IPage page1=new Page(page,pageSize);
        LambdaQueryWrapper<Register> queryWrapper =new LambdaQueryWrapper();
        queryWrapper.like(StringUtils.isNotEmpty(realName),Register::getRealName,realName);
        registerService.page(page1, queryWrapper);
        return Result.success(page1);
    }
    @PostMapping
    public Result<Boolean> save(@RequestBody Register register){
        register.setAgeType("年");
        register.setVisitDate(LocalDateTime.now());
        register.setSettleCategoryId(1);
        LocalDate birthday = register.getBirthday();
        LocalDate currentDate = LocalDate.now();  // 获取当前日期
        Integer age = Period.between(birthday, currentDate).getYears();  // 计算年龄差异
        register.setAge(age);
        int hour=LocalDateTime.now().getHour();
        String amPm;
        if (hour >= 0 && hour < 12) {
            amPm = "上午";
        } else {
            amPm = "下午";
        }
        register.setNoon(amPm);
        register.setVisitState(1);
        Integer level = register.getRegistLevelId();
        int money=0;
        if (level==1)
            money=50;else if(level==2) money=8; else money=20;
        if(register.getIsBook().equals("是")){
            register.setCaseNumber(UUID.randomUUID().toString());
            money+=1;
        }

        register.setRegistMoney(new BigDecimal(money));
        boolean save = registerService.save(register);
        if(save)
            return Result.success(save);
        else
            return Result.error("添加失败");
    }
    @PutMapping()
    public Result<Boolean> changeState(@RequestBody Register register){
        Register byId = registerService.getById(register.getId());
        byId.setVisitState(register.getVisitState());
        boolean b = registerService.updateById(byId);
        if(b)
            return Result.success(b);
        else
            return Result.error("修改失败");
    }

}
