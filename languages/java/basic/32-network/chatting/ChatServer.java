package chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	ServerSocket serverSocket;
	Socket socket;
	List<Thread> list;

	public ChatServer() {
		list = new ArrayList<Thread>();
		System.out.println("������ ���۵Ǿ����ϴ�.");
	}
	
	public void giveAndTake() {
		try {
			serverSocket = new ServerSocket(5420);
			//ServerSocket port �ٷ� �ٽû��
			serverSocket.setReuseAddress(true);
			
			while(true) {
				socket = serverSocket.accept();
				ServerSocketThread sst = new ServerSocketThread(this, socket);
				// ����Ʈ ��ü�� ����
				addClient(sst);
				// ������ ����
				sst.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void addClient(Thread thread) {
		list.add(thread);
		System.out.println("Client 1�� ����, �� " + list.size() + "��");
	}
	
	public synchronized void removeClient(Thread thread) {
		list.remove(thread);
		System.out.println("Client 1�� ����, �� " + list.size() + "��");
	}
	
	public synchronized void broadCasting(String str) {
		for(int i=0; i<list.size(); i++) {
			ServerSocketThread sst = (ServerSocketThread) list.get(i);
			sst.sendMessage(str); 
		}
	}
}













