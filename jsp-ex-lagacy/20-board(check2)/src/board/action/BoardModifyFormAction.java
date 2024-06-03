package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.bean.BoardBean;
import board.dao.BoardDAO;

public class BoardModifyFormAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// page�� board_num �б�
		String page = request.getParameter("page");
		int board_num = Integer.parseInt(request.getParameter("board_num"));
		
		BoardDAO boardDAO = new BoardDAO();
		BoardBean boardBean = boardDAO.selectArticle(board_num);	// ��� ������ ��ƿͼ�
		
		request.setAttribute("page", page);
		request.setAttribute("board_num", board_num);	// boardBean�� �� �־ ���� �Ⱥ����� �������� ����
		request.setAttribute("boardBean", boardBean);	// ��� ���� �ѱ�
		
		//return "/board/boardModify.jsp"; ����
		return "/index.jsp?req=boardModify";
		
		/*
		request.setAttribute("req_page", "board/boardModify.jsp");
		//return "index.jsp";
		*/
	}

}
