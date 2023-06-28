package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domain.CheckRequest;
import com.service.CheckRequestService;
import com.mapper.CheckRequestMapper;
import org.springframework.stereotype.Service;

/**
* @author cwb
* @description 针对表【check_request】的数据库操作Service实现
* @createDate 2023-06-26 21:40:49
*/
@Service
public class CheckRequestServiceImpl extends ServiceImpl<CheckRequestMapper, CheckRequest>
    implements CheckRequestService{

}




