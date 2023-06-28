package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domain.Department;
import com.service.DepartmentService;
import com.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
* @author cwb
* @description 针对表【department】的数据库操作Service实现
* @createDate 2023-06-26 21:40:49
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService{

}




