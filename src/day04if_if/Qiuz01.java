package day04if_if;

import java.util.Scanner;

public class Qiuz01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

//��� ���
		System.out.println("������ �Է��ϼ��� : ");
		int score = input.nextInt();
		if (100>=score) {
			if (score>=0) {
				if (score >= 90) {
					System.out.println("A");
				} else if (score >= 80){
					System.out.println("B");
				} else if (score >= 70) {
					System.out.println("C");
				} else if (score >= 60) {
					System.out.println("D");
				} else {
					System.out.println("f");
				}
			}else {
				System.out.println("������ �߸� �Է��Ͽ����ϴ�.");
			}
		}else {
		System.out.println("������ �߸� �Է��Ͽ����ϴ�.");
	}


//¦��Ȧ��
		System.out.println("���� �Է��ϼ��� :");
		int num = input.nextInt();
		if (num%2==0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}


//����
		System.out.println("���� �Է��ϼ��� : ");
		int season = input.nextInt();
		if (13>season && 0<season) {
			if (3<= season && 5 >=season) {
				System.out.println("��");
			} else if (6<= season && 8>= season) {
				System.out.println("����");
			} else if (9<= season && 11>= season) {
				System.out.println("����");
			} else {
				System.out.println("�ܿ�");
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

//BMI
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height = input.nextDouble();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		double weight = input.nextDouble();
		
		double bmi = weight/(height*height/10000);
		
		if (bmi<18.5) {
			System.out.println("��ü��");
		}else if (bmi>=18.5 && bmi<=24.9) {
			System.out.println("����");
		}else {
			System.out.println("��");
		}
		
//����
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = input.nextInt();
		
		if (age<=8) {
			System.out.println("1000��");
		} else if (age <= 14) {
			System.out.println("1500��");
		} else if (age <= 17) {
			System.out.println("3000��");
		} else {
			System.out.println("5000��");
		}

	}

}
