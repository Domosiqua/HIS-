package com.domain.dto;

import com.domain.Department;
import com.domain.Employee;

import com.domain.RegistLevel;
import com.domain.Scheduling;
import lombok.Data;

import java.util.List;

/**
 * @author CWB
 * @version 1.0
 */
@SuppressWarnings({"all"})
@Data
public class EmployeeDTO extends Employee {

    private String registName;
    private String deptName;
    private String ruleName;
    private List<RegistLevel> registlevellist;
    private List<Department> departmentlist;
    private List<Scheduling> schedulinglist;
    private List<Employee> employeelist;


}
