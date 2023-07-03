package com.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.common.Result;
import com.domain.Department;
import com.service.DepartmentService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public Result<IPage<Department>> page(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize, String name){
        IPage page1=new Page(page,pageSize);
        LambdaQueryWrapper<Department> queryWrapper =new LambdaQueryWrapper();
        queryWrapper.like(StringUtils.isNotEmpty(name),Department::getDeptName,name);
        service.page(page1, queryWrapper);
        return Result.success(page1);
    }
}
