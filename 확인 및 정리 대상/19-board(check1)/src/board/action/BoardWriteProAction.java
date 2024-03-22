package board.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import board.bean.BoardBean;
import board.dao.BoardDAO;

public class BoardWriteProAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String forward = null;
		BoardBean boardBean = null;
		String realFolder = "";
		String saveFolder = "/boardUpload";
		int fileSize = 5*1024*1024;	// 5MB�� ���� ����
		// ������ �����ų ���� �̸�
		realFolder = request.getServletContext().getRealPath(saveFolder);
		MultipartRequest multi =
				new MultipartRequest(request, realFolder, fileSize, "UTF-8", new DefaultFileRenamePolicy());
			// DefaultFileRenamePolicy ���� �ߺ� ���� ���
		// �� �� ������ ���� �����.
		
		// �Ѿ���� DATA�� ���� �󿡴ٰ� �����ϱ� 
		boardBean = new BoardBean();
		boardBean.setBoard_name(multi.getParameter("board_name"));
		boardBean.setBoard_pass(multi.getParameter("board_pass"));
		boardBean.setBoard_subject(multi.getParameter("board_subject"));
		boardBean.setBoard_content(multi.getParameter("board_content"));
		boardBean.setBoard_file(multi.getOriginalFileName("board_file"));
		
		BoardDAO boardDAO = new BoardDAO();
		int insertCount = boardDAO.insertArticle(boardBean);	// ����� �� ��� 1�� �ɴϴ�. �׷��� ������ 0
		if(insertCount > 0 ) {
			forward = "boardList.do";
		} else {
			response.setContentType("text/html; charset=UTF-8"); 
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('��Ͻ���')");
			out.println("history.back();");
			out.println("</script>");
		}
		
		return forward;
	}

}
