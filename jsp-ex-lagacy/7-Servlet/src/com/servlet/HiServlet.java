package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HiServlet")
public class HiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HiServlet() {
        super();
    }

	@Override
	public void destroy() {
		System.out.println("���� ����");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("���� ����");
	}

	/* ���� */
	// 1. Ŭ���̾�Ʈ���� �Ѿ�� dataó�� 
	// 2. Ŭ���̾�Ʈ�� �������� ������ ����
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request�� ��û, response�� ������ ���մϴ�.
		System.out.println("doGet() ����");
		// ���� ������ ���ڿ��� html������ �ν��� ���� ����մϴ�.
		response.setContentType("text/html; charset=UTF-8"); 
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Hello Servlet!!<br>");
		out.println("Hi ����!!<br>");
		out.println("�ȳ��ϼ��� ����!!<br>");	
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
