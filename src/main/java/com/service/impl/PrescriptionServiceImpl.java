package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domain.Prescription;
import com.service.PrescriptionService;
import com.mapper.PrescriptionMapper;
import org.springframework.stereotype.Service;

/**
* @author cwb
* @description 针对表【prescription】的数据库操作Service实现
* @createDate 2023-06-26 21:40:49
*/
@Service
public class PrescriptionServiceImpl extends ServiceImpl<PrescriptionMapper, Prescription>
    implements PrescriptionService{

}




