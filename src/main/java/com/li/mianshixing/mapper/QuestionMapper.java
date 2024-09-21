package com.li.mianshixing.mapper;

import com.li.mianshixing.model.entity.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
* @author dell
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2024-09-18 10:51:52
* @Entity generator.domain.Question
*/
public interface QuestionMapper extends BaseMapper<Question> {

    @Select("select * from question where updateTime >= #{minUpdateTime}")
    List<Question> listQuestionWithDelete(Date minUpdateTime);
}




