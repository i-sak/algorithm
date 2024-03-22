package test.service;

import java.util.List;

import test.bean.ScoreVO;

// Service를 따로 두는 이유는 다양한 테이블과 DAO를 통합 관리하기 위해서이다.
// 목차 역할
public interface ScoreService {
	// 점수등록 CRUD 기능의 메소드
	// 점수 등록
	int insertScore(ScoreVO vo);
	// 점수 수정
	int updateScore(ScoreVO vo);	
	// 점수 삭제
	int deleteScore(ScoreVO vo);
	// 점수 상세조회
	ScoreVO getScore(ScoreVO vo);
	// 점수 목록 조회
	List<ScoreVO> getScoreList(ScoreVO vo);
}
