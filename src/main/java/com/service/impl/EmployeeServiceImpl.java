package com.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domain.Employee;
import com.service.EmployeeService;
import com.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author cwb
* @description 针对表【employee】的数据库操作Service实现
* @createDate 2023-06-26 21:40:49
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{
    @Override
    public Employee isexistByUsername(String username) {
        LambdaQueryWrapper<Employee> Wrapper=new LambdaQueryWrapper();
        Wrapper.eq(Employee::getRealname,username);
        Employee one = this.getOne(Wrapper);

        return one;

    }

}




