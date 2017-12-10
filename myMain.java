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
		

		while (true) { // �ڵ� ¥�� �κ�
			boolean exit = true;
			String quit = null;
			SignIn signin1 = new SignIn();
			usertype = signin1.SignIn(IDPW);

			if (usertype.equals("0")) {
				quit = "0";
				exit = false;
			} else if (usertype.equals("s")) { // �˻��� (searcher)
				System.out.println("�˻��ڷ� �α���.");
				sleep(1000);
				Searcher searcher = new Searcher();
			} else if (usertype.equals("a")) { // ��û�� (applier)
				System.out.println("��û�ڷ� �α���.");
				sleep(1000);
				Applier applier = new Applier();
//				applier.askjob();
			} else if (usertype.equals("m")) { // ������ (manager)
				System.out.println("�����ڷ� �α���.");
				sleep(1000);
				Manager manager = new Manager();
//				manager.askjob();
			}

			// ���� �� �ٸ� �۾� ��� �� �� �ְ�

			while (exit) {
//				clearScreen();
				System.out.println("��� �Ϸ��� 1, �����Ϸ��� 0�� �Է��Ͻÿ�.");
				quit = input.next();
				if (quit.equals("0") || quit.equals("1"))
					break;
			}
			if (quit.equals("0")) {
				System.out.println("����Ǿ����ϴ�.");
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

