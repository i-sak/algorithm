package board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.action.Action;
import board.action.BoardListAction;
import board.action.BoardWriteProAction;

@WebServlet("*.do")	// annotation ���� �� Ŭ������ ���,
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardController() {
        super();
    }
    // 1. �������� ��û �ޱ� (get ���)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}	// 1. �������� ��û �ޱ�  (post ���)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 2. ��û ���� Ȯ��
		String command = request.getServletPath();
		// command = /boardWriteForm.do
		System.out.println("command = " + command);	// ���� ��� ã��
		// 3. ��û �۾� ó�� (���� ó��)
		String forward = null;
		/** ������ �κ� start */
		Action action = null; // board.action package�� �ִ� �츮�� ���� Action �� ������־�� �Ѵ�.
		/** ������ �κ� end */
		if(command.equals("/boardWriteForm.do")) {
			forward = "/board/boardWriteForm.jsp";
		
		/** ������ �κ� start */
		} else if (command.equals("/boardWritePro.do")) {	// �Խñ� �����ϱ�
			action = new BoardWriteProAction();	// �θ� �������� ���� ��, ������
			// forward = "/board/boardList.jsp"; ������ ���� § �ڵ�
		} else if (command.equals("/boardList.do")) {	// �������� § �ڵ�
			action = new BoardListAction();
		}
		
		/* �������� § �ڵ� */
		if (action != null) {
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		/** ������ �κ� end */
		
		// 4. ������ ���� view�� �����ϰ�, forward ó��
		if(forward != null) {	// �̹������ �ϸ� ���ȿ� �� �� ����, ��û�ϴ� ���ϰ� ���� �����ִ� ������ �ٸ��� ������.
			/** null �̸� �ƹ��� ���۵� ���� ���� */
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
			dispatcher.forward(request, response);
		}
	}
}
