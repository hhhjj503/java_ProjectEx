package ex14.io.array;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//int kor = 0;
		int[] kors = new int[3];
		for(int i = 0 ; i <3;i++) {
			kors[i] = 1;
		}
		
		int j = 0;
		int t = 00;
		//int total = kor + j + t;

		quit : 
			while(true) {
		 // ----------성적 입력 부분-----------------------------------
			System.out.println("시작입니다!");
			System.out.println("┌──────────────────────────────┐"); // print() = wtite() + flush()
			System.out.println("│              \\  메인 메뉴       │");
			System.out.println("└──────────────────────────────┘");
			
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.println("\t번호입력>");
			int menu = scan.nextInt();
			
			switch(menu) {
			
			case 1 :
				 // ----------성적 입력 부분-----------------------------------
					System.out.println("┌──────────────────────────────┐"); // print() = wtite() + flush()
					System.out.println("│              \\  성적 입력       │");
					System.out.println("└──────────────────────────────┘");
					
					for(int i =0;i<3;i++)
					do {
						System.out.printf("국어%d 성적 : \n", i);
						kors[i] = scan.nextInt();
							if(kors[i] < 0 || kors[i] > 100) 
								System.out.println("0~100 범위만 입력하세요!");
					}while (t < 0 || t > 100);
					
					//total = kor + j + t;
			case 2 :
					// ----------성적 출력 부분-----------------------------------
					System.out.println("┌──────────────────────────────┐"); // print() = wtite() + flush()
					System.out.println("│              \\  성적 출력       │");
					System.out.println("└──────────────────────────────┘");
			
					for(int i = 0; i < 3;i++) {
						System.out.printf("\t국어성적%d : %d\n", i, kors[i]);
					}
					//System.out.printf("총점 : %3d\n", total2);
					//System.out.printf("평균 : %.2f\n", avg);
					break;
			case 3 : 
				//프로그램 강제종료 System.exit(0);
				System.out.println("Bye~~Bye~~");
				break quit;
			default : 
				System.out.println("입력오류!! 1~3 까지만 입력해주세요!");
			}//switch
		} //while
	} //main
} //class