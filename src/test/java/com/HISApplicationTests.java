package com;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.domain.Employee;
import com.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author CWB
 * @version 1.0
 */
@SuppressWarnings({"all"})
@SpringBootTest
@RunWith(SpringRunner.class)
public class HISApplicationTests {
    @Autowired
    EmployeeService service;
    @Test
    public void t(){
        LambdaQueryWrapper<Employee> Wrapper=new LambdaQueryWrapper();
        Wrapper.eq(Employee::getRealname,"bh");
        Employee one = service.getOne(Wrapper);
        System.out.println(one);
    }
}
