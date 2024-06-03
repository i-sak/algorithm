package score.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import score.bean.PageInfo;
import score.bean.ScoreDTO;
import score.controller.Action;
import score.dao.ScoreDAO;

public class ScoreListAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<ScoreDTO> list = null;
		int page = 1;
		int limit = 10;	// ����� ����
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		int endNum = page * limit;				// 1*10 = 10
		int startNum = endNum - (limit - 1);	// 10 - (10-1) = 1
		
		ScoreDAO scoreDAO = new ScoreDAO();
		list = scoreDAO.scoreList(startNum, endNum);
		// �� ����Ʈ ���� �޾ƿ�
		int listCount = scoreDAO.selectListCount();
		// �� ������ ��.
		int maxPage = (listCount + limit - 1) / limit;	// (�� ����Ʈ �� + 9) / 10
		//���� �������� ������ ���� ������ ��
		int startPage = (page - 1)/3*3 + 1;
		//���� �������� ������ ������ ������ ��
		int endPage = startPage + 2;
		if(endPage > maxPage) endPage = maxPage;
		
		PageInfo pageInfo = new PageInfo();
		pageInfo.setListCount(listCount);	//�� ����Ʈ ��
		pageInfo.setMaxPage(maxPage);		//�� ������ ��
		pageInfo.setPage(page);				//���� ������
		pageInfo.setStartPage(startPage);	//���� ������
		pageInfo.setEndPage(endPage);		//�� ������
		
		request.setAttribute("pageInfo", pageInfo);
		request.setAttribute("list", list);
		request.setAttribute("req_page", "score/scoreList.jsp");
	
		return "index.jsp";
	}

}
