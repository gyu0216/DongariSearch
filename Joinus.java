package DongariSearch;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Joinus {
	Scanner input = new Scanner(System.in);

	// ȸ������
	public Joinus() {
		System.out.println("���� ȸ���̽ø� 1��, ȸ�� ������ 2���� �����ּ���.");
		BufferedWriter jointxt = null;
		String select = input.next();
		boolean writerappend;
		if (select.equals("1")) {
			return;
		}
		if (select.equals("2")) {
			try {
				if (jointxt == null) {
					jointxt = new BufferedWriter(new FileWriter(new File("C://Dongari//IDPW.txt"), true));
				}
				System.out.println("---ȸ������ ����---");
				System.out.print("����Ͻ� ID�� �Է����ּ��� :(��, ��û�ϽǺ��� ID�տ� a�� �ٿ��ֽð� �˻��ϽǺ��� s�� �ٿ��ּ���) ");
				String newID = input.next();
				jointxt.append(newID + " ");
				System.out.print("����Ͻ� PW�� �Է����ּ���: ");
				newID = input.next();
				jointxt.append(newID + " ");
				jointxt.newLine();
				System.out.println("ȸ�� ������ �Ϸ� �Ǿ����ϴ�!");
				jointxt.flush();
				jointxt.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
