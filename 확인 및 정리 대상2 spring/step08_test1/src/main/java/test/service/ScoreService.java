package test.service;

import java.util.List;

import test.bean.ScoreVO;

public interface ScoreService {
	// CRUD 기능의 메소드
	// 성적 등록
	int insertScore(ScoreVO vo);
	// 성적 수정
	int updateScore(ScoreVO vo);	
	// 성적 삭제
	int deleteScore(ScoreVO vo);
	// 성적 상세 조회
	ScoreVO getScore(ScoreVO vo);
	// 성적 목록 조회
	List<ScoreVO> getScoreList(ScoreVO vo);
}
