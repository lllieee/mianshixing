package com.li.mianshixing.esdao;

import com.li.mianshixing.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 题目 ES 操作
 *

 */
public interface QuestionEsDao extends ElasticsearchRepository<QuestionEsDTO, Long> {

}