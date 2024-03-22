package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.bean.BoardBean;
import board.dao.BoardDAO;

public class BoardReplyFormAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int page	 = Integer.parseInt(request.getParameter("page"));
		int board_num = Integer.parseInt(request.getParameter("board_num"));	// ���ۿ� ���� board_num
		// ���� ������ �о����
		BoardDAO boardDAO = new BoardDAO();
		BoardBean boardBean = boardDAO.selectArticle(board_num);
		
		request.setAttribute("boardBean", boardBean);
		request.setAttribute("page", page);
		
		// return "/board/boardReply.jsp"; ����
		return "/index.jsp?req=boardReply";
		
		/*
		request.setAttribute("req_page", "board/boardReply.jsp");
		//return "index.jsp";
		*/
	}
}
