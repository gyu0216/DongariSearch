package DongariSearch;

import java.util.*;
import java.io.*;

public class Applier {
	int appliedDongarisize=0;
	DongariList d = new DongariList();
	Scanner input = new Scanner(System.in);

	public void askjob() {
		System.out.println("���� �۾��� �� ������ �Է��Ͻÿ�. (1. �˻� 2. ���ο� ���Ƹ� �Է� ��û)");
		String applierchoosejob = input.next();
		if (applierchoosejob.equals("1"))
			Searching();
		else if (applierchoosejob.equals("2"))
			Applying();
	}

	private void readapplieDongarisize() { // ��û�� ���Ƹ� ���� ����
		try {
			BufferedReader sizecheck = new BufferedReader(new FileReader(new File("C://Dongari//newApplyDongari.txt")));
			String s = sizecheck.readLine();
			s= sizecheck.readLine();
			if(s!=null) appliedDongarisize++;
			while( s != null ) {
				appliedDongarisize++;
				s = sizecheck.readLine();
			}
			System.out.println(appliedDongarisize);
			sizecheck.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void Applying() { // ���Ƹ� ��û�ϱ�
		BufferedWriter applytxt = null;
		readapplieDongarisize();
		boolean writerappend;
		try {
			if(applytxt == null) {
				applytxt = new BufferedWriter(new FileWriter(new File("C://Dongari//newApplyDongari.txt"), true));
//				applytxt.write(String.valueOf(appliedDongarisize));
			}
//			for(int i=0; i<appliedDongarisize; i++)
			System.out.println("���ο� ���Ƹ� �Է��� ��û�մϴ�.");
			System.out.print("���ο� ���Ƹ��� �̸� : ");
			String newDongari = input.next();
			applytxt.append(newDongari+"/");
			System.out.print("���ο� ���Ƹ��� ��ġ : ");
			newDongari = input.next();
			applytxt.append(newDongari+"/");
			System.out.print("���ο� ���Ƹ��� ���� ��ġ : ");
			newDongari = input.next();
			applytxt.append(newDongari+"/");
			System.out.print("���ο� ���Ƹ��� �±�(1/3) : ");
			newDongari = input.next();
			applytxt.append(newDongari+"/");
			System.out.print("���ο� ���Ƹ��� �±�(2/3) : ");
			newDongari = input.next();
			applytxt.append(newDongari+"/");
			System.out.print("���ο� ���Ƹ��� �±�(3/3) : ");
			newDongari = input.next();
			applytxt.append(newDongari);
			applytxt.newLine();
			appliedDongarisize++;
			System.out.println(appliedDongarisize+"���Ƹ� ��û�� �Ϸ�Ǿ����ϴ�.");

			applytxt.flush();
			applytxt.close();
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