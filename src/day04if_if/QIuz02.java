package day04if_if;

import java.util.Scanner;

public class QIuz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int date ;
		System.out.print("��¥ �Է� : ");
		date = input.nextInt();
		switch(date%7) {
		case 0 : System.out.println("��"); break;
		case 1 : System.out.println("��"); break;
		case 2 : System.out.println("ȭ"); break;
		case 3 : System.out.println("��"); break;
		case 4 : System.out.println("��"); break;
		case 5 : System.out.println("��"); break;
		case 6 : System.out.println("��"); break;
		}
	}

}
