package com.domain.dto;

import com.domain.Department;
import com.domain.Employee;

import com.domain.RegistLevel;
import lombok.Data;

import java.util.List;

/**
 * @author CWB
 * @version 1.0
 */
@SuppressWarnings({"all"})
@Data
public class EmployeeDTO extends Employee {


    /**
     * 号别名称
     */
    private String registName;
    private String deptName;
    private List<RegistLevel> registlevellist;
    private List<Department> departmentlist;

}
