package exam3.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MessageAction implements Action {
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		request.setAttribute("message", "��ɾ ��û �Ķ���ͷ� ����");
		return "/exam3/messageView.jsp";
	}
}
