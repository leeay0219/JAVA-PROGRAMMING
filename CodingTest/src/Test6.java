import java.util.Scanner; 

public class Test6 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true; 
		int balance = 0; 
	
		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1. ���� 2. ��� 3. �ܰ� 4. ����"); 
			System.out.println("--------------------------------");
			System.out.println("����>");
			int choice = Integer.parseInt(sc.nextLine());
		
			if (choice==1) {
				System.out.println("���ݾ�> ");
				int input = Integer.parseInt(sc.nextLine());
				balance += input; 
			}
			if (choice==2) {
				System.out.println("��ݾ�> ");
				int output = Integer.parseInt(sc.nextLine());
				balance -= output; 	
			}
			if (choice==3) {
				System.out.println("�ܰ�> " + balance);
			}
			if (choice==4) {
				System.out.println("���α׷� ����");
				break; 
			}
		}
		sc.close();
	}
}