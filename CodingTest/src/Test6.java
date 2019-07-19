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
			System.out.println("1.예금  2.출금  3.잔고  4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			c=Integer.parseInt(sc.nextLine());
			if(c==1) {
				System.out.print("예금액> ");
				c=Integer.parseInt(sc.nextLine());
				bal=bal+c;
			}
			else if(c==2) {
				System.out.print("출금액> ");
				c=Integer.parseInt(sc.nextLine());
				bal=bal-c;
			}
			else if(c==3) {
				System.out.println("잔고> "+bal);
				
			}
			else if(c==4) {
				System.out.print("프로그램 종료");
				go=false;
			}
		}
		sc.close();

	}

}
