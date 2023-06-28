package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domain.Disease;
import com.service.DiseaseService;
import com.mapper.DiseaseMapper;
import org.springframework.stereotype.Service;

/**
* @author cwb
* @description 针对表【disease】的数据库操作Service实现
* @createDate 2023-06-26 21:40:49
*/
@Service
public class DiseaseServiceImpl extends ServiceImpl<DiseaseMapper, Disease>
    implements DiseaseService{

}




