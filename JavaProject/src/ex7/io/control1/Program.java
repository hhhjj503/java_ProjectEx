/*
 * 저작권 정보 :
 * 작성일: ..
 * */


package ex7.io.control1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int kor = 0;
		int j = 0;
		int i = 00;
		
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		float avg = total/3.0f;

	while(true)
		{ // ----------성적 입력 부분-----------------------------------
			System.out.println("┌──────────────────────────────┐"); // print() = wtite() + flush()
			System.out.println("│              \\  성적 입력       │");
			System.out.println("└──────────────────────────────┘");
			
			do {
			System.out.println("국어1 성적 : ");
			kor = scan.nextInt();
				if(kor < 0 || kor > 100) {
					System.out.println("0~100 범위만 입력하세요!");
				}
			}
			while (kor < 0 || kor > 100);
			
			System.out.println("국어2 성적 : ");
			j = scan.nextInt();
			System.out.println("국어3 성적 : ");
			i = scan.nextInt();
			total = kor + j + i;
			
			int re = 0 <= kor && kor <= 100 ? 1 : 0;
			System.out.println(re);
			
			// ----------성적 출력 부분-----------------------------------
			System.out.println("┌──────────────────────────────┐"); // print() = wtite() + flush()
			System.out.println("│              \\  성적 출력       │");
			System.out.println("└──────────────────────────────┘");
	
			// % n$ +(right),-(left) width precision(.00..) conversion(d,f,x,..)
			System.out.printf("%1$d %1$d %1$d\n", 1);
	
			System.out.printf("국어1 : %3d\n", kor);
			System.out.printf("국어2 : %3d\n", j);
			System.out.printf("국어3 : %3d\n", i);
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %.2f\n", avg);
	
			System.out.printf("%d\n", 80);
			System.out.printf("%d\n", 20);
	
			System.out.printf("%d-%d-%d-%s\n", 2013, 12, 22, "a");
			System.out.printf("%1$5.2f", 2.222);
		}
		//System.out.write(80);
		//System.out.flush(); % 1$ +,- width precision conversion
		
		//논리연산자 : value && value, value || value, !(value || value) 
		//비트 논리 연산자 :value & value, value | value, value ^ value, value ~ value
	}

}