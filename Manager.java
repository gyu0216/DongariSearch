package DongariSearch;

import java.util.*;
import java.io.*;

public class Manager {
	int appliedDongarisize = 0;
	DongariList d = new DongariList();
	Scanner input = new Scanner(System.in);

	public void askjob() {
		System.out.println("���� �۾��� �� ������ �Է��Ͻÿ�. (1. �˻� 2. ��û���� ���ο� ���Ƹ� �Է�)");
		String applierchoosejob = input.next();
		if (applierchoosejob.equals("1"))
			Searching();
		else if (applierchoosejob.equals("2"))
			insertNewDongari();
	}

	public void insertNewDongari() {
		readapplieDongarisize();
		try {
			BufferedReader toinsert = new BufferedReader(new FileReader(new File("C://Dongari//newApplyDongari.txt")));
			while (true) {
//				if (appliedDongarisize == 0)
				if(toinsert ==null) {
//					System.out.println("��û�� ���Ƹ��� �����ϴ�.");
					break;
				}
				else {
					for (int i = 0; i < appliedDongarisize; i++) {

					}
				}
			}
		} catch (IOException e) {
			System.out.println("��û�� ���Ƹ��� �����ϴ�.");
			e.printStackTrace();
		}
	}

	private void readapplieDongarisize() { // ��û�� ���Ƹ� ���� ����
		try {
			BufferedReader sizecheck = new BufferedReader(new FileReader(new File("C://Dongari//newApplyDongari.txt")));
			String s = sizecheck.readLine();
			s = sizecheck.readLine();
			if (s != null)
				appliedDongarisize++;
			while (s != null) {
				appliedDongarisize++;
				s = sizecheck.readLine();
			}
			System.out.println(appliedDongarisize);
			sizecheck.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void Searching() {
		int searchchoose;
		while (true) {
			System.out.println("�˻��� ����� ���ÿ�");
			System.out.println("1. �̸����� �˻�  2.��ġ�� �˻�");
			searchchoose = input.nextInt();
			if (searchchoose == 1 || searchchoose == 2)
				break;
		}
		if (searchchoose == 1) {
			System.out.println("�̸����� �˻�");
			String s = input.next();
			for (int i = 0; i < 3; i++) {
				if (s.equals(d.L[i].name))
					System.out.println(i);
			}
		}
	}

	private static void clearScreen() {
		for (int i = 0; i < 40; i++)
			System.out.println();
	}

	private void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}
}