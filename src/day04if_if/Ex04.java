package day04if_if;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int select;
		System.out.println("�� �Է�");
		select = input.nextInt();
		switch(select%2) {
		case 0 : System.out.println("�Է°��� ¦���Դϴ� ");
		case 1 : System.out.println("1.�Է°� : " + select); //break;
		case 2 : System.out.println("2.�Է°� : " + select); break;
		case 3 : System.out.println("3.�Է°� : " + select); break;
		default : System.out.println("1,2,3�� ������ �ٸ� �� �Է�");
		}
		/*
		 * if(select==1){
		 */
	}

}