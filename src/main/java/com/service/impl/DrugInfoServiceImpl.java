package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domain.DrugInfo;
import com.service.DrugInfoService;
import com.mapper.DrugInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author cwb
* @description 针对表【drug_info】的数据库操作Service实现
* @createDate 2023-06-26 21:40:49
*/
@Service
public class DrugInfoServiceImpl extends ServiceImpl<DrugInfoMapper, DrugInfo>
    implements DrugInfoService{

}




