package day04if_if;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 * if(���ǽ�) : ���ΰ�� ���ӹ��� ����
		 * else : if�� ������ �����̸� ������ ���ӹ��� ����
		 */
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("�� �Է�");
		num = input.nextInt();
		if(num % 3 == 0) {
			System.out.println(num+"�� 3�� ���");
		}else {
			System.out.println(num+"�� 3�� ��� �ƴ�");
		}
		System.out.println("���� ����� ����");
	}

}