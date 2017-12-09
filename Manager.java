package DongariSearch;

import java.util.*;
import java.io.*;

public class Manager {
	int appliedDongarisize = 0;
	DongariList d = new DongariList();
	Scanner input = new Scanner(System.in);

	public void askjob() {
		System.out.println("무슨 작업을 할 것인지 입력하시오. (1. 검색 2. 신청받은 새로운 동아리 입력)");
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
//					System.out.println("신청된 동아리가 없습니다.");
					break;
				}
				else {
					for (int i = 0; i < appliedDongarisize; i++) {

					}
				}
			}
		} catch (IOException e) {
			System.out.println("신청된 동아리가 없습니다.");
			e.printStackTrace();
		}
	}

	private void readapplieDongarisize() { // 신청된 동아리 갯수 세기
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