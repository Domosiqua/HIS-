package com.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.common.Result;
import com.domain.Scheduling;
import com.service.SchedulingService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author CWB
 * @version 1.0
 */
@SuppressWarnings({"all"})
@RestController
@RequestMapping("/scheduling")
public class SchedulingController {

    @Autowired
    private SchedulingService service;

    @GetMapping("/page")
    public Result<IPage<Scheduling>> page(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize, String ruleName){
        IPage page1=new Page(page,pageSize);
        LambdaQueryWrapper<Scheduling> queryWrapper =new LambdaQueryWrapper();
        queryWrapper.like(StringUtils.isNotEmpty(ruleName),Scheduling::getRuleName,ruleName);
        service.page(page1, queryWrapper);
        return Result.success(page1);
    }
    @PutMapping()
    public Result<Boolean> update(@RequestBody Scheduling scheduling){
        boolean b = service.updateById(scheduling);
        if(b)
            return Result.success(b);
        else
            return Result.error("修改失败");
    }
    @PostMapping
    public Result<Boolean> insert(@RequestBody Scheduling scheduling){
        boolean save = service.save(scheduling);
        if(save)
            return Result.success(save);
        else
            return Result.error("添加失败");
    }
    @DeleteMapping("/{id}")
    public Result<Boolean> deleteById(@PathVariable Integer id) {
        boolean result = service.removeById(id);
        if (result)
            return Result.success(result);
        else
            return Result.error("删除失败");
    }
    @GetMapping("/{id}")
    public Result<Scheduling> getById(@PathVariable Long id){
        Scheduling byId = service.getById(id);
        return Result.success(byId);
    }
}
