import java.util.ArrayList;
import java.util.List;

public class Exam5 {

	public static void main(String[] args) {
		ObjectInOut objectInOut = new ObjectInOut();
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("ȫ�浿", 17, "����"));
		list.add(new Student("��浿", 27, "����"));
		list.add(new Student("��ö��", 20, "���"));
		list.add(new Student("�̿���", 19, "��ô"));
		
		objectInOut.write("student.txt", list);
		System.out.println("-------------------------------");
		objectInOut.read("student.txt");
		
	}

}





