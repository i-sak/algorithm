package chatting;

public class ClientGuiMain {
	public static void main(String[] args) {
		// "127.0.0.1" : �ڱ� PC�� �⺻ ip �ּ�
		ClientGui clientGui = new ClientGui("127.0.0.1", 5420);
		clientGui.giveAndTake();
	}

}
