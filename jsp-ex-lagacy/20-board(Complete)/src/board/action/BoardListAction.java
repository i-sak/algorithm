package board.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.bean.BoardBean;
import board.bean.PageInfo;
import board.controller.Action;
import board.dao.BoardDAO;

public class BoardListAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<BoardBean> list = null;
		int  page = 1;
		int limit = 10;	// ����� ����
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		int endNum = page * limit;				// 1*10 = 10
		int startNum = endNum - (limit - 1);	// 10 - (10-1) = 1
		
		BoardDAO boardDAO = new BoardDAO();
		list = boardDAO.selectArticleList(startNum, endNum);
		//�� ����Ʈ ���� �޾ƿ�.
		int listCount = boardDAO.selectListCount();
		//�� ������ ��.
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
		request.setAttribute("req_page", "board/boardList.jsp");
		return "index.jsp";		
	}	
}









