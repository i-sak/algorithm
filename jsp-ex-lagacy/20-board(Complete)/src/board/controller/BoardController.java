package board.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = {"*.do"},
		initParams = {
			@WebInitParam(name="propertyConfig", value="command.properties")
		}
	)
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// ��ɾ�� ��ɾ� ó�� Ŭ������ ������ ������ Map Ŭ����
    private Map<String, Object> commandMap = new HashMap<String, Object>();
    
    public BoardController() {
        super();
    }
    // ��ɾ�� ��ɾ� ó��Ŭ������ ���εǾ� �ִ� properties ������ �о 
    // Map Ŭ������ ����
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// initParams���� propertyConfig�� ���� �о��
    	String propertyConfig = config.getInitParameter("propertyConfig");
    	// "/property" ������ ���� ��θ� ����
    	String realFolder = config.getServletContext().getRealPath("/property");
    	String realPath = realFolder + "/" + propertyConfig;
    	// ��ɾ�� ó�� Ŭ������ ���������� ������ Properties ��ü ����
    	Properties properties = new Properties();
    	// ������ �о�� IO Ŭ����
    	FileInputStream fis = null;
    	try {
    		// command.properties ���� �о����
			fis = new FileInputStream(realPath);
			// command.properties ������ ������ Properties ��ü�� ����
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    	// Set ��ü�� iterator() �޼ҵ带 ����ؼ� Iterator ��ü�� ��
    	Iterator<?> iterator = properties.keySet().iterator();
    	// Iterator ��ü�� ����� ��ɾ�� ��ɾ� ó�� Ŭ������ Map ��ü�� ����
    	while(iterator.hasNext()) {
    		String command = (String) iterator.next();	
    		String className = properties.getProperty(command);
    		// command = "/boardWriteForm.do"    		
    		// className = "board.action.BoardWriteFormAction"
    		try {
				Class<?> commandClass = Class.forName(className);
				Object commandInstance = commandClass.newInstance();
				commandMap.put(command, commandInstance);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
    	}
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	// 1. ���������� ��û�� �м��ϰ�, �ش� ��û�� ó���� ������ model ����
	// 2. ó������� view�� ����
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result = null;	// jsp ������ �̸�
		Action action = null;
		// ��û����Ȯ��
		// command = /boardWriteForm.do
		String command = request.getServletPath();
		// ��û�۾�ó��
		action = (Action) commandMap.get(command);
		try {
			result = action.execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ������ ���� view�� �����ϰ�, forward ó��
		if(result != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(result);
			dispatcher.forward(request, response);
		}
	}
}








