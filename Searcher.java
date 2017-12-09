package DongariSearch;

import java.util.*;
import java.io.*;

public class Searcher {
	Scanner input = new Scanner(System.in);
	DongariList d = new DongariList();
	

	public Searcher() {yourwork();}
	
	private void yourwork() {
		String choosework;
		System.out.println("1. 검색 2. 모든 동아리 보기");
		choosework = input.next();
		if (choosework.equals("1") || choosework.equals("2"))
			if (choosework.equals("1"))
				Searching();
			else if (choosework.equals("2"))
				showAllDongari();
		else
			yourwork();
		
		System.out.println("계속하려면 1, 종료하려면 0을 입력하시오.");
		
		moreyourwork();
	}
	private void moreyourwork() {
		String moreurwork = input.next();
		if (moreurwork.equals("1") || moreurwork.equals("0"))
			if (moreurwork.equals("1"))
				yourwork();
			else if (moreurwork.equals("0")) {
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		else
			moreyourwork();
	}
	private void showAllDongari() {
		for(int i=0; i<3; i++) {
			System.out.print(i+". 동아리 명 : "+d.L[i].name+ "   동아리 태그 : ");
			for(int j=0; j<3; j++) {
				System.out.print(d.L[i].tag[j]+" ");
			} System.out.println();
		}
	}
	
	private void Searching() {
		int searchchoose;
		String howtosearch;
		System.out.println("검색할 방법을 고르시오");
		System.out.println("1. 이름으로 검색  2.위치로 검색");
		howtosearch = input.next();
		if (howtosearch.equals("1") || howtosearch.equals("2"))
			if (howtosearch.equals("1")) {
				System.out.println("이름으로 검색");
				String s = input.next();
				for (int i = 0; i < 3; i++) {
					if (s.equals(d.L[i].name))
						System.out.println(i);
				}
			}
			else if (howtosearch.equals("2")) {
				System.out.println("위치로 검색");
				String s = input.next();
				for (int i = 0; i < 3; i++) {
					if (s.equals(d.L[i].location))
						System.out.println(d.toString(i));
				}
			}
		else
			Searching();
	}

//	public String toString(int i) {
//		System.out.println(0000);
//		return d.L[i].name+" "+d.L[i].location+" "+d.L[i].specificlocation+" "+d.L[i].tag[0]+" "+d.L[i].tag[1]+" "+d.L[i].tag[2];
//	}
	
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