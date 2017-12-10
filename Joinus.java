package DongariSearch;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Joinus {
	Scanner input = new Scanner(System.in);

	// 회원가입
	public Joinus() {
		System.out.println("기존 회원이시면 1번, 회원 가입은 2번을 눌러주세요.");
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
				System.out.println("---회원가입 절차---");
				System.out.print("사용하실 ID를 입력해주세요 :(단, 신청하실분은 ID앞에 a를 붙여주시고 검색하실분은 s를 붙여주세요) ");
				String newID = input.next();
				jointxt.append(newID + " ");
				System.out.print("사용하실 PW를 입력해주세요: ");
				newID = input.next();
				jointxt.append(newID + " ");
				jointxt.newLine();
				System.out.println("회원 가입이 완료 되었습니다!");
				jointxt.flush();
				jointxt.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
