package chatting2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer2 {
	// ����
	ServerSocket serverSocket;		// ä�ü��� �����
	Socket socket;					// ������ ������ �� �ִ� ����(��, ��Ʈ)�� ����� ��.
	List<Thread> list;				// ����Ʈ ���׸�>>> Ÿ���� Thread ��...	
	
	// ������
	public ChatServer2() {
		list = new ArrayList<Thread>();
		System.out.println("������ ���۵Ǿ����ϴ�.");
	}
	public void giveAndTake() {
		
		try {
			serverSocket = new ServerSocket(5420);		// ���� ��Ʈ ����
			// ServerSocket port �ٷ� �ٽ� ���
			serverSocket.setReuseAddress(true);//
			
			while(true) {
				socket = serverSocket.accept();		// ���Ͽ��ٰ� ����� ������ ��ٸ��ڴٴ� ��¾ �� accept();
				ServerSocketThread2 sst = new ServerSocketThread2(this, socket);
				// ����Ʈ ��ü�� ����<< �����带 ��� ���� ��ü : ServerSocketThread2�� addCLient>>
				addClient(sst);
				//������ ����
				sst.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public synchronized void addClient(Thread thread) {			// list�� ���� ������ ��ü�� ����ȭ ��Ŵ
		list.add(thread);
		System.out.println("Clinet 1�� ����, �� " + list.size() + "��");
	}
	public synchronized void removeClient(Thread thread) {
		list.remove(thread);
		System.out.println("Client 1�� ����, ��" + list.size() + "��");
	}
	public synchronized void broadCasting(String str) {
		for (int i = 0; i<list.size(); i++) {
			ServerSocketThread2 sst2 = (ServerSocketThread2) list.get(i);
			sst2.sendMessage(str);
		}
	}

	
}
