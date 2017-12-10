package DongariSearch;

import java.util.*;
import java.io.*;

public class Applier {
	Scanner input = new Scanner(System.in);
	public Applier() throws IOException{
		int choosework;
		while (true) {
			System.out.println("\n0. 종료  1. 목록 확인  2. 수정 요청  3.추가 요청 ");
			choosework = input.nextInt();
			if (choosework == 1 || choosework == 2|| choosework == 0|| choosework == 3){
				if (choosework == 1)
					checklist();
				else if(choosework == 2)
					request();
				else if(choosework == 3)
					add();
				else if(choosework == 0){
					break;
				}
			}else{
				System.out.println("0,1,2 중에서 입력해주십시오");
			}
		}
		if (choosework == 1)
			request();
	}
	public void add() throws IOException{
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		try{
			inputStream = new BufferedReader(new FileReader("C://addrequest.txt"));
			outputStream = new PrintWriter(new FileWriter("addrequest.txt"));
			String l;
			while((l=inputStream.readLine())!=null){
				outputStream.println(l);
			}
			Scanner input2 = new Scanner(System.in);
			System.out.print("요청할 정보를 입력하시오: ");
			String a = input2.nextLine();
			outputStream.println(a);
		}finally{
			if(inputStream!=null){
				inputStream.close();
			}
			if(outputStream!=null){
				outputStream.close();
			}
		}
		
		inputStream = null;
		outputStream = null;
		try{
			inputStream = new BufferedReader(new FileReader("addrequest.txt"));
			outputStream = new PrintWriter(new FileWriter("C://addrequest.txt"));
			String l;
			while((l=inputStream.readLine())!=null){
				outputStream.println(l);
			}
		}finally{
			if(inputStream!=null){
				inputStream.close();
			}
			if(outputStream!=null){
				outputStream.close();
			}
		}
	}
	public void checklist(){
		try {
			BufferedReader Listtxt = new BufferedReader(new FileReader(new File("C://DongariList.txt")));
			String s = Listtxt.readLine();
			for (int i = 0; s != null; i++) {
				System.out.println(s);
				s = Listtxt.readLine();
			}
			Listtxt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void request() throws IOException{
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		try{
			inputStream = new BufferedReader(new FileReader("C://Dongarirequest.txt"));
			outputStream = new PrintWriter(new FileWriter("Dongarirequest.txt"));
			String l;
			while((l=inputStream.readLine())!=null){
				outputStream.println(l);
			}
			Scanner input2 = new Scanner(System.in);
			System.out.print("수정할 정보를 입력하시오: ");
			String a = input2.nextLine();
			outputStream.println(a);
			Scanner input3 = new Scanner(System.in);
			System.out.print("요청할 정보를 입력하시오: ");
			String b = input3.nextLine();
			outputStream.println(b);
			
		}finally{
			if(inputStream!=null){
				inputStream.close();
			}
			if(outputStream!=null){
				outputStream.close();
			}
		}
		
		inputStream = null;
		outputStream = null;
		try{
			inputStream = new BufferedReader(new FileReader("Dongarirequest.txt"));
			outputStream = new PrintWriter(new FileWriter("C://Dongarirequest.txt"));
			String l;
			while((l=inputStream.readLine())!=null){
				outputStream.println(l);
			}
		}finally{
			if(inputStream!=null){
				inputStream.close();
			}
			if(outputStream!=null){
				outputStream.close();
			}
		}
	}
	
	
	private static void clearScreen() {
		for (int i = 0; i < 40; i++)
			System.out.println();
	}
	private void sleep(int time){
	    try {
	      Thread.sleep(time);
	    } catch (InterruptedException e) { }
	}
}