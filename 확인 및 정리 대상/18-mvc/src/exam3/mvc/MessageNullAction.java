package exam3.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MessageNullAction implements Action{
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		request.setAttribute("message", "���޵� ������ �����ϴ�.");
		return "/exam3/messageView.jsp";
	}
}
