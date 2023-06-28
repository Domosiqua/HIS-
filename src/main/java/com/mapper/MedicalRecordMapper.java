package com.mapper;

import com.domain.MedicalRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author admin
* @description 针对表【medical_record】的数据库操作Mapper
* @createDate 2023-06-26 21:40:49
* @Entity com.domain.MedicalRecord
*/
@Mapper
public interface MedicalRecordMapper extends BaseMapper<MedicalRecord> {

}




