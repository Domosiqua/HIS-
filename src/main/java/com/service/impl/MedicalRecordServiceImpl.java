package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domain.MedicalRecord;
import com.service.MedicalRecordService;
import com.mapper.MedicalRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author cwb
* @description 针对表【medical_record】的数据库操作Service实现
* @createDate 2023-06-26 21:40:49
*/
@Service
public class MedicalRecordServiceImpl extends ServiceImpl<MedicalRecordMapper, MedicalRecord>
    implements MedicalRecordService{

}




