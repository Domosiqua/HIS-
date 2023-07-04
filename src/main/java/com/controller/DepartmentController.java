package com.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.common.Result;
import com.domain.Department;
import com.domain.Employee;
import com.service.DepartmentService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author CWB
 * @version 1.0
 */
@SuppressWarnings({"all"})
@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService service;

    @GetMapping("/page")
    public Result<IPage<Department>> page(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize, String deptName){
        IPage page1=new Page(page,pageSize);
        LambdaQueryWrapper<Department> queryWrapper =new LambdaQueryWrapper();
        queryWrapper.like(StringUtils.isNotEmpty(deptName), Department::getDeptName,deptName);
        service.page(page1, queryWrapper);
        return Result.success(page1);
    }
    @PostMapping()
    public Result<Boolean> save(@RequestBody Department department){
        boolean save = service.save(department);
        if(save)
            return Result.success(save);
        else
            return Result.error("保存失败");

    }
    @GetMapping("/{id}")
    public Result<Department> getById(@PathVariable Long id){
        Department byId = service.getById(id);
        return Result.success(byId);
    }
    @DeleteMapping("/{id}")
    public Result<Boolean> deleteById(@PathVariable Integer id) {
        boolean result = service.removeById(id);
        if (result)
            return Result.success(result);
        else
            return Result.error("更新失败");
    }
    @PutMapping()
    public Result<Boolean> update(@RequestBody Department department) {
        boolean b = service.updateById(department);
        if (b)
            return Result.success(b);
        else
            return Result.error("更新失败");


    }

}
