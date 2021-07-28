package day04if_if;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = null;
		int num=1;
		if(num==1) {
			name = "test";
		}
		System.out.println(name);
		while(true)
		{
			System.out.println("이름 입력 : ");
			name = input.next();
			System.out.println("당신의 이름은 " + name + " 이군요");
		}
	}

}
