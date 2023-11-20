package com.example.questionnaire.vo;

import java.util.ArrayList;
import java.util.List;

import com.example.questionnaire.entity.Question;
import com.example.questionnaire.entity.Questionnaire;

public class QuizVo { //QuizVo�̭���@�Ӱݨ���ۤv���D��,�@��Vo�N���@�Ӱݨ���ݨ������D��

	private Questionnaire questionnaire = new Questionnaire(); //�@�i�ݨ�
	
	private List<Question> questionList = new ArrayList<>(); //�ݨ����U�h���D��

	public QuizVo() {
		super();
	}

	public QuizVo(Questionnaire questionnaire, List<Question> questionList) {
		super();
		this.questionnaire = questionnaire;
		this.questionList = questionList;
	}

	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}

	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}

	public List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}
	
	
}