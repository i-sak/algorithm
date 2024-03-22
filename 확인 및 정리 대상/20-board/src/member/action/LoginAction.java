package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.controller.Action;
import member.dao.MemberDAO;

public class LoginAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//������ �о����
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		// DB
		MemberDAO memberDAO = new MemberDAO();
		String name = memberDAO.login(id, pwd);
		
		if(name == null) { 	
			// ������ �̵�
			request.setAttribute("req_page", "member/loginFail.jsp");
		} else { 
			HttpSession session = request.getSession();	// Ŭ�������� ���� ������ request.response �� �۵��ϱ� ������ http request�� ������
			session.setAttribute("memName", name);
			session.setAttribute("memId", id);
			request.setAttribute("req_page", "member/loginOk.jsp");	
			//response.sendRedirect("/17-imageboard/main/index.jsp?req=");
		} 
		return "index.jsp";
	}
	
}
