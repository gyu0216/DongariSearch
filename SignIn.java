package DongariSearch;

import java.util.*;
import java.io.*;

public class SignIn {
	Scanner input = new Scanner(System.in);

	public SignIn() {
	}

	public String SignIn(String[][] IDPW) {
		boolean Signin = true;
		String SAM = null;

		System.out.println("���Ƹ��� ã���࿡ ���Ű� ȯ���մϴ�.\n");
		while (Signin) {
			System.out.println("ID�� PW�� �Է��Ͻÿ�. (���� : 0)");
			System.out.print("ID (ex. m12345) : ");
			String ID = input.next();

			if (ID.equals("0"))
				return "0";

			System.out.print("PW : ");
			String PW = input.next();

			for (int i = 0; i < 8; i++) {
				if (IDPW[i][0].equals(ID)) {
					if (IDPW[i][0].equals(ID)) {
						SAM = Character.toString(ID.charAt(0));
						Signin = false;
						break;
					}
				}
			}
			if (Signin == true) {
				System.out.println("�α��� ����.");
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