package exam2.message;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MessageNullAction implements Action{
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		request.setAttribute("result", "���޵� ������ �����ϴ�.2");
		return "/messageView.jsp";
	}
}
