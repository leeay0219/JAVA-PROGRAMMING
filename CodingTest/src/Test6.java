import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean go=true;
		int c;
		int bal=0; 
		while(go) {
			System.out.println("------------------------------");
			System.out.println("1.����  2.���  3.�ܰ�  4.����");
			System.out.println("------------------------------");
			System.out.print("����> ");
			c=Integer.parseInt(sc.nextLine());
			if(c==1) {
				System.out.print("���ݾ�> ");
				c=Integer.parseInt(sc.nextLine());
				bal=bal+c;
			}
			else if(c==2) {
				System.out.print("��ݾ�> ");
				c=Integer.parseInt(sc.nextLine());
				bal=bal-c;
			}
			else if(c==3) {
				System.out.println("�ܰ�> "+bal);
				
			}
			else if(c==4) {
				System.out.print("���α׷� ����");
				go=false;
			}
		}
		sc.close();

	}

}
