package DongariSearch;

import java.io.*;
import java.util.*;

public class myMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String usertype = null;
		String[][] IDPW = new String[8][2];
//		String[][] DList = new String[50][4];
//		clearScreen();
		
		DongariList d = new DongariList();
//		System.out.println(d.L[0].name);

		try { // IDPW.txt
			BufferedReader IDPWtxt = new BufferedReader(new FileReader(new File("C://IDPW.txt")));
			String s = IDPWtxt.readLine();
			for (int i = 0; s != null; i++) {
				IDPW[i] = s.split(" ");
				s = IDPWtxt.readLine();
			}
			IDPWtxt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		while (true) { // 코드 짜는 부분
			boolean exit = true;
			String quit = null;
			SignIn signin1 = new SignIn();
			usertype = signin1.SignIn(IDPW);

			if (usertype.equals("0")) {
				quit = "0";
				exit = false;
			} else if (usertype.equals("s")) { // 검색자 (searcher)
				System.out.println("검색자로 로그인.");
				sleep(1000);
				Searcher searcher = new Searcher();
			} else if (usertype.equals("a")) { // 신청자 (applier)
				System.out.println("신청자로 로그인.");
				sleep(1000);
				Applier applier = new Applier();
//				applier.askjob();
			} else if (usertype.equals("m")) { // 관리자 (manager)
				System.out.println("관리자로 로그인.");
				sleep(1000);
				Manager manager = new Manager();
//				manager.askjob();
			}

			// 종료 및 다른 작업 계속 할 수 있게

			while (exit) {
//				clearScreen();
				System.out.println("계속 하려면 1, 종료하려면 0을 입력하시오.");
				quit = input.next();
				if (quit.equals("0") || quit.equals("1"))
					break;
			}
			if (quit.equals("0")) {
				System.out.println("종료되었습니다.");
				break;
			}
//			clearScreen();
		}

	}

	private static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}

	private static void clearScreen() {
		for (int i = 0; i < 40; i++)
			System.out.println();
	}
}

