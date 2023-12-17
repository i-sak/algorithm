package chatting2;

import java.io.*;
import java.net.*;

public class ServerSocketThread2 extends Thread{
	Socket socket;		// �� ���� ��ü�� ������ ���� ��ü ���� �غ�
	ChatServer2 server;	// ���� ��ü
	PrintWriter out;	// ����
	BufferedReader in;	// �б�
	
	String name;
	String threadName= "Thread";
	
	// ������
	public ServerSocketThread2(ChatServer2 server, Socket socket) {
		this.socket = socket;
		this.server = server;
		threadName = getName();
		System.out.println(socket.getInetAddress()+ "���� �����Ͽ����ϴ�.");
		System.out.println("Thread Name : " + threadName);
	}
	public void sendMessage(String str) {
		out.println(str);
	}
	@Override
	public void run() {
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
			
			sendMessage("��ȭ�� �̸��� �������� : ");
			name = in.readLine();
			server.broadCasting("[" + name + "] ���� �����ϼ̽��ϴ�.");
			
			while(true) {
				String strin = in.readLine();
				server.broadCasting("[" + name +"]" + strin);
			}
		
		} catch(IOException e) {
			System.out.println(threadName + "�����߽��ϴ�.");
			server.removeClient(this);
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
