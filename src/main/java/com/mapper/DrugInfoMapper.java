package com.mapper;

import com.domain.DrugInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author admin
* @description 针对表【drug_info】的数据库操作Mapper
* @createDate 2023-06-26 21:40:48
* @Entity com.domain.DrugInfo
*/
@Mapper
public interface DrugInfoMapper extends BaseMapper<DrugInfo> {

}




