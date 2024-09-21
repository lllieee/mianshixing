package com.li.mianshixing.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.li.mianshixing.model.dto.questionBankQuestion.QuestionBankQuestionQueryRequest;
import com.li.mianshixing.model.entity.QuestionBankQuestion;
import com.li.mianshixing.model.entity.User;
import com.li.mianshixing.model.vo.QuestionBankQuestionVO;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 题库题目关联服务
 *

 */
public interface QuestionBankQuestionService extends IService<QuestionBankQuestion> {

    /**
     * 校验数据
     *
     * @param questionBankQuestion
     * @param add 对创建的数据进行校验
     */
    void validQuestionBankQuestion(QuestionBankQuestion questionBankQuestion, boolean add);

    /**
     * 获取查询条件
     *
     * @param questionBankQuestionQueryRequest
     * @return
     */
    QueryWrapper<QuestionBankQuestion> getQueryWrapper(QuestionBankQuestionQueryRequest questionBankQuestionQueryRequest);
    
    /**
     * 获取题库题目关联封装
     *
     * @param questionBankQuestion
     * @param request
     * @return
     */
    QuestionBankQuestionVO getQuestionBankQuestionVO(QuestionBankQuestion questionBankQuestion, HttpServletRequest request);

    /**
     * 分页获取题库题目关联封装
     *
     * @param questionBankQuestionPage
     * @param request
     * @return
     */
    Page<QuestionBankQuestionVO> getQuestionBankQuestionVOPage(Page<QuestionBankQuestion> questionBankQuestionPage, HttpServletRequest request);


    @Transactional(rollbackFor = Exception.class)
    void batchAddQuestionsToBankInner(List<QuestionBankQuestion> questionBankQuestions);

    /**
     * 批量添加题目到题库
     * @param questionIdList  题目列表
     * @param questionBankId  题库id
     * @param loginUser  操作者
     */
    void batchAddQuestionsToBank(List<Long> questionIdList, long questionBankId, User loginUser);



    /**
     * 批量移除题目从题库
     * @param questionIdList  题目列表
     * @param questionBankId  题库id
     */
    void batchRemoveQuestionsFromBank(List<Long> questionIdList, Long questionBankId);





}
