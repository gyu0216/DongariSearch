package DongariSearch;

import java.util.*;
import java.io.*;

public class Applier {
	int appliedDongarisize=0;
	DongariList d = new DongariList();
	Scanner input = new Scanner(System.in);

	public void askjob() {
		System.out.println("무슨 작업을 할 것인지 입력하시오. (1. 검색 2. 새로운 동아리 입력 신청)");
		String applierchoosejob = input.next();
		if (applierchoosejob.equals("1"))
			Searching();
		else if (applierchoosejob.equals("2"))
			Applying();
	}

	private void readapplieDongarisize() { // 신청된 동아리 갯수 세기
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
	
	private void Applying() { // 동아리 신청하기
		BufferedWriter applytxt = null;
		readapplieDongarisize();
		boolean writerappend;
		try {
			if(applytxt == null) {
				applytxt = new BufferedWriter(new FileWriter(new File("C://Dongari//newApplyDongari.txt"), true));
//				applytxt.write(String.valueOf(appliedDongarisize));
			}
//			for(int i=0; i<appliedDongarisize; i++)
			System.out.println("새로운 동아리 입력을 신청합니다.");
			System.out.print("새로운 동아리의 이름 : ");
			String newDongari = input.next();
			applytxt.append(newDongari+"/");
			System.out.print("새로운 동아리의 위치 : ");
			newDongari = input.next();
			applytxt.append(newDongari+"/");
			System.out.print("새로운 동아리의 세부 위치 : ");
			newDongari = input.next();
			applytxt.append(newDongari+"/");
			System.out.print("새로운 동아리의 태그(1/3) : ");
			newDongari = input.next();
			applytxt.append(newDongari+"/");
			System.out.print("새로운 동아리의 태그(2/3) : ");
			newDongari = input.next();
			applytxt.append(newDongari+"/");
			System.out.print("새로운 동아리의 태그(3/3) : ");
			newDongari = input.next();
			applytxt.append(newDongari);
			applytxt.newLine();
			appliedDongarisize++;
			System.out.println(appliedDongarisize+"동아리 신청이 완료되었습니다.");

			applytxt.flush();
			applytxt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void Searching() {
		int searchchoose;
		while (true) {
			System.out.println("검색할 방법을 고르시오");
			System.out.println("1. 이름으로 검색  2.위치로 검색");
			searchchoose = input.nextInt();
			if (searchchoose == 1 || searchchoose == 2)
				break;
		}
		if (searchchoose == 1) {
			System.out.println("이름으로 검색");
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