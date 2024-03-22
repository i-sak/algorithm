package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.controller.Action;

public class LogoutProAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// ���� ����ϱ� ���� ��ü ����
		HttpSession session = request.getSession();
		
		// ���� ����
		session.removeAttribute("memName");
		session.removeAttribute("memId");
		// ��ȿȭ : ��� �����
		session.invalidate();
		
		request.setAttribute("req_page", "member/logout.jsp");
		return "index.jsp";
	}

}
