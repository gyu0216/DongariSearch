package DongariSearch;

import java.util.*;
import java.io.*;

public class SignIn {
	Scanner input = new Scanner(System.in);
	String idpw = null;
	int idnumbers=0;

	public SignIn() {
	}

	public String SignIn(String[][] IDPW) {
		boolean Signin = true;
		String SAM = null;
		Joinus joinus = new Joinus();
		System.out.println("동아리를 찾아줘에 오신걸 환영합니다.\n");
		while (Signin) {

			System.out.println("ID와 PW를 입력하시오. (종료 : 0)");
			System.out.print("ID (ex. m12345) : ");
			String ID = input.next();

			if (ID.equals("0"))
				return "0";

			System.out.print("PW : ");
			String PW = input.next();
			
			//아이디수 세주는 거
			try { 
				BufferedReader IDPWtxt = new BufferedReader(new FileReader(new File("C://Dongari//IDPW.txt")));
				String s = IDPWtxt.readLine();
				idnumbers++;
				for (int i = 0; s != null; i++) {
					s = IDPWtxt.readLine();
					idnumbers++;
				}
				IDPWtxt.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			for (int i = 0; i < idnumbers; i++) { 
				if (IDPW[i][0].equals(ID)) {
					if (IDPW[i][0].equals(ID)) {
						SAM = Character.toString(ID.charAt(0));
						Signin = false;
						break;
					}
				}
			}
			if (Signin == true) {
				System.out.println("로그인실패.");
				sleep(1000);
			}
		}

		return SAM;
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