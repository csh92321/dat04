package day04if_if;

import java.util.Scanner;

public class Qiuz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String home = null, company = null;
		while(true)
		{	System.out.println("1.�츮�� ���");
			System.out.println("2.ȸ�� ���");
			System.out.println("3.��� ����");
			int num = input.nextInt();
			if (num == 1) {
				System.out.println("�� �ּҸ� �Է��ϼ��� : ");
				home = input.next();
		} else if (num == 2) {
			System.out.println("ȸ�� �ּҸ� �Է��ϼ��� : ");
			company = input.next();
		} else if (num==3) {
			System.out.println("�츮�� : " + home);
			System.out.println("ȸ�� : " + company); break;
		}
	}
	}

}
