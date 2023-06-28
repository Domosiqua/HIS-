package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domain.Register;
import com.service.RegisterService;
import com.mapper.RegisterMapper;
import org.springframework.stereotype.Service;

/**
* @author cwb
* @description 针对表【register】的数据库操作Service实现
* @createDate 2023-06-26 21:40:49
*/
@Service
public class RegisterServiceImpl extends ServiceImpl<RegisterMapper, Register>
    implements RegisterService{

}




