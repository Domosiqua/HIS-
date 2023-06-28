package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domain.InspectionRequest;
import com.service.InspectionRequestService;
import com.mapper.InspectionRequestMapper;
import org.springframework.stereotype.Service;

/**
* @author cwb
* @description 针对表【inspection_request】的数据库操作Service实现
* @createDate 2023-06-26 21:40:49
*/
@Service
public class InspectionRequestServiceImpl extends ServiceImpl<InspectionRequestMapper, InspectionRequest>
    implements InspectionRequestService{

}




