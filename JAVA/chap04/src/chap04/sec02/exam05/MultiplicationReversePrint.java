package chap04.sec02.exam05;
import java.util.Scanner;

public class MultiplicationReversePrint {
	public static void main (String[] args) {
				for(int i=9; i>=2; i--){
					System.out.print("["+i+"단]\t"); // \t 칸 간격 벌림
				}
				System.out.println();
				
				for(int i=1; i<=9; i++){
					for(int j=9; j>=2; j--){
						System.out.print(j+"x"+i+"="+j*i+"\t");
					}	
					System.out.println();
				}
				
				int input;    
				Scanner sc = new Scanner(System.in);
				System.out.println("2~9사이의 숫자를 하나 입력 해 주세요");
				input=sc.nextInt();
				System.out.println();
				System.out.println("*** "+input+" 단***");
				    
				 
				for(int i=1;i<=9; i=i+1){
				      System.out.println(input+" * "+i+ " = "+(input*i)); 
				  }
				
				sc.close();
			}

	}

