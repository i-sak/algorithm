package com.param;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ParamServlet() {
        super();
    }

    @Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	// ��Ĺ������ doGet�� ȣ�� ��.
    // ȣ���Ҷ� �����͸� �Ѿ�� ���� request ��ü�� ����
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// ���ϼ����� ���� request / response ��ü �����Ͽ� >> doGet�� ����
		// �Ѿ�� �����ʹ� request ��ü�� ����
				
		// 1. ������
		String name = request.getParameter("name");
		String str_age = request.getParameter("age");
		// ��� �����ʹ� ���ڿ� String Ÿ������ ������ �Ѿ� �´�.
		int age = Integer.parseInt(str_age);
		// 2. ����
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(name + "���� ���̴�" + age + "�� �̹Ƿ�, ");
		if(age>= 19) out.println("�����Դϴ�.");
		else out.println("û�ҳ��Դϴ�.");
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
