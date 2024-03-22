package com.person;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// annotation ���� ����ϱ� ������� �ι�° ���
@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PersonServlet() {
        super();
    }
    // ��Ĺ������ doGet�� ȣ�� ��.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// 1. ������
		String name = request.getParameter("name");
		
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");

		String color = request.getParameter("color");
		String[] subject = request.getParameterValues("subject");
		
		// 2. ����
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		
		out.println("<style>");
		out.println("li { color: yellow; }");
		out.println("</style>");
		
		out.println("</head>");
		out.println("<body bgcolor="+ color + ">");
		out.println("<ul>");
		out.println("<li> �̸� : " + name + "</li>");
		out.println("<li> ���� : ");
		if(gender.equals("m")) out.println("����");
		else out.println("����");
		out.println("</li>");
		out.println("<li> ��� : ");
										// .length��� �迭�� ���� ���ϴ� ��� �Լ��� ���� ������ ���ܸ� ������ ��..
		if(hobby != null) {				// error �� 500�� servlet �ڵ忡�� �����߻� , 404�� ������ ����
			for(int i =0 ; i < hobby.length; i++) {
				out.println(hobby[i]);	
			}
		}
		out.println("</li>");
		out.println("<li> ���� : " + color + "</li>");
		out.println("<li> ���� : ");
		if(subject != null) {
			for(int i =0 ; i < subject.length; i++) {
				out.println(subject[i]);
			}
		}
		out.println("</li><br>");
		out.println("<a href='#' onclick=\"history.back(); return false;\">�ڷ�</a>");
		//out.println("<a href='javascript:history.go(-1)'>�ڷ�</a>");
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
