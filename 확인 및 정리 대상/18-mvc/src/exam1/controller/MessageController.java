package exam1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MessageController")
public class MessageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public MessageController() {
        super();
    }    
    // 1. �������� ��û �ޱ� (get ���)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	// 1. �������� ��û �ޱ� (post ���)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ����
		String message = null;
		Object result = null;
		// 2. ��û ���� Ȯ��
		message = request.getParameter("message");
		// 3. ��û �۾� ó�� (���� ó��) : data ó�� => java Ŭ�������� ó��
		if(message == null) {
			result = "���޵� ������ �����ϴ�.";
		} else if(message.equals("host")) {
			result = "��浿 �Դϴ�.";
		} else if(message.equals("guest")) {
			result = "ȫ�浿 �Դϴ�.";
		} else {
			result = "Ÿ���� ���� �ʽ��ϴ�.";
		}
		// 4. ��û ó�� ����� request ��ü�� ����
		request.setAttribute("result", result);
		// 5. ������ ���� view�� �����ϰ�, forward ó�� : View ó�� (HTML ���� �ۼ�)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/messageView.jsp");
		dispatcher.forward(request, response);
	}
}












