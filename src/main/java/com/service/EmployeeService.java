package com.service;

import com.domain.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author cwb
* @description 针对表【employee】的数据库操作Service
* @createDate 2023-06-26 21:40:49
*/
public interface EmployeeService extends IService<Employee> {
    Employee isexistByUsername(String username);
}
