package day04if_if;

import java.util.Scanner;

public class Qiuz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String home = null, company = null;
		while(true)
		{	System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			int num = input.nextInt();
			if (num == 1) {
				System.out.println("집 주소를 입력하세요 : ");
				home = input.next();
		} else if (num == 2) {
			System.out.println("회사 주소를 입력하세요 : ");
			company = input.next();
		} else if (num==3) {
			System.out.println("우리집 : " + home);
			System.out.println("회사 : " + company); break;
		}
	}
	}

}
