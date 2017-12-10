package DongariSearch;

import java.util.*;
import java.io.*;

public class Manager {
	Scanner input = new Scanner(System.in);
	DongariList d = new DongariList();
	String tempt[]=new String[2];
	String tempt2[][]=new String[2][6];
	public Manager() throws IOException {
		int choosework;
		//System.out.println("0. ���� 1. ��ûȮ��  2. ���� ");
		while (true) {
			System.out.println("\n0. ����  1. ������ûȮ��  2. ����  3. �߰���ûȮ��   4. �߰�");
			choosework = input.nextInt();
			if (choosework == 1 || choosework == 2|| choosework == 0||choosework == 3||choosework == 4){
				if (choosework == 1)
					checkmodify();
				else if(choosework == 2)
					modify();
				else if(choosework == 3)
					checkadd();
				else if(choosework == 4)
					add();
				else if(choosework == 0){
					break;
				}
			}else{
				System.out.println("0,1,2 �߿��� �Է����ֽʽÿ�");
			}
		}
	}
	public void add() throws IOException{
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		try{
			inputStream = new BufferedReader(new FileReader("C://DongariList.txt"));
			outputStream = new PrintWriter(new FileWriter("DongariList.txt"));
			String l;
			while((l=inputStream.readLine())!=null){
				outputStream.println(l);
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("�߰��� ������ �Է��Ͻÿ�: ");
			String a = sc.nextLine();
			outputStream.write(a);
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
			inputStream = new BufferedReader(new FileReader("DongariList.txt"));
			outputStream = new PrintWriter(new FileWriter("C://DongariList.txt"));
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
		clearadd();
	}
	public void checkadd(){
		int i=0;
		try { // Dongari.txt
			BufferedReader Listtxt = new BufferedReader(new FileReader(new File("C://addrequest.txt")));
			String s = Listtxt.readLine();
			for (i=0; s != null; i++) {
				s=Listtxt.readLine();
			}
			Listtxt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(i==0){
			System.out.println("������û�� �����ϴ�.");
		}else{
			System.out.println(i+"���� ��û�� �ֽ��ϴ�.");
		}
		try { // Dongari.txt
			BufferedReader Listtxt = new BufferedReader(new FileReader(new File("C://addrequest.txt")));
			String s = Listtxt.readLine();
			for (i=0; s != null; i++) {
				String array[]=s.split("/");
				System.out.println("�߰���û");
				System.out.println("���Ƹ��̸� : "+array[0]);
				System.out.println("���Ƹ� ��ġ : "+array[1]);
				System.out.println("���Ƹ� ���� ��ġ : "+array[2]);
				System.out.println("�±�1 : "+array[3]);
				System.out.println("�±�2 : "+array[4]);
				System.out.println("�±�3 : "+array[5]);
				s=Listtxt.readLine();
			}
			Listtxt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void clearadd() throws IOException{
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		try{
			inputStream = new BufferedReader(new FileReader("C://addrequest.txt"));
			outputStream = new PrintWriter(new FileWriter("C://addrequest.txt"));
		}finally{
			if(inputStream!=null){
				inputStream.close();
			}
			if(outputStream!=null){
				outputStream.close();
			}
		}
	}
	public void checkmodify(){
		int i=0;
		try { // Dongari.txt
			BufferedReader Listtxt = new BufferedReader(new FileReader(new File("C://Dongarirequest.txt")));
			String s = Listtxt.readLine();
			for (i=0; s != null; i++) {
				s=Listtxt.readLine();
				s=Listtxt.readLine();
			}
			Listtxt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(i==0){
			System.out.println("������û�� �����ϴ�.");
		}else{
			System.out.println(i+"���� ��û�� �ֽ��ϴ�.");
		}
		try { // Dongari.txt
			BufferedReader Listtxt = new BufferedReader(new FileReader(new File("C://Dongarirequest.txt")));
			String s = Listtxt.readLine();
			for (i = 0; s != null; i++) {
				tempt[0] = s;
				tempt2[0]=s.split("/");
				s = Listtxt.readLine();
				tempt[1] = s;
				tempt2[1]=s.split("/");
				s=Listtxt.readLine();
				System.out.println(i+1+".");
				if(!(tempt2[0][0].equals(tempt2[1][0]))){
					System.out.println("���Ƹ� �̸� : "+tempt2[0][0]+" -> "+tempt2[1][0]);
				}else{
					System.out.println("���Ƹ� �̸� : "+tempt2[1][0]);
				}
				if(!(tempt2[0][1].equals(tempt2[1][1]))){
					System.out.println("���Ƹ� ��ġ : "+tempt2[0][1]+" -> "+tempt2[1][1]);
				}else{
					System.out.println("���Ƹ� ��ġ : "+tempt2[1][1]);
				}
				if(!(tempt2[0][2].equals(tempt2[1][2]))){
					System.out.println("���Ƹ� ������ġ : "+tempt2[0][2]+" -> "+tempt2[1][2]);
				}else{
					System.out.println("���Ƹ� ������ġ : "+tempt2[1][2]);
				}
				if(!(tempt2[0][3].equals(tempt2[1][3]))){
					System.out.println("�±�1 : "+tempt2[0][3]+" -> "+tempt2[1][3]);
				}else{
					System.out.println("�±�1 : "+tempt2[1][3]);
				}
				if(!(tempt2[0][4].equals(tempt2[1][4]))){
					System.out.println("�±�2 : "+tempt2[0][4]+" -> "+tempt2[1][4]);
				}else{
					System.out.println("�±�2 : "+tempt2[1][4]);
				}
				if(!(tempt2[0][5].equals(tempt2[1][5]))){
					System.out.println("�±�3 : "+tempt2[0][5]+" -> "+tempt2[1][5]);
				}else{
					System.out.println("�±�3 : "+tempt2[1][5]);
				}
				System.out.println("");
			}
			Listtxt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void modify() throws IOException{
		try { // Dongari.txt
			BufferedReader Listtxt = new BufferedReader(new FileReader(new File("C://Dongarirequest.txt")));
			String s = Listtxt.readLine();
			for (int i = 0; s != null; i++) {
				s=Listtxt.readLine();
				s=Listtxt.readLine();
				Scanner input2 = new Scanner(System.in);
				System.out.print("������ ������ �Է��Ͻÿ�: ");
				String a = input2.nextLine();
				Scanner input3 = new Scanner(System.in);
				System.out.print("�Է��� ������ �Է��Ͻÿ�: ");
				String b = input3.nextLine();
				check(a,b);
				System.out.println("�����Ǿ����ϴ�.\n");
			}
			Listtxt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		clearmodify();
	}
	public void clearmodify() throws IOException{
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		try{
			inputStream = new BufferedReader(new FileReader("C://Dongarirequest.txt"));
			outputStream = new PrintWriter(new FileWriter("C://Dongarirequest.txt"));
		}finally{
			if(inputStream!=null){
				inputStream.close();
			}
			if(outputStream!=null){
				outputStream.close();
			}
		}
	}
	public void check(String a, String b) throws IOException{
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		try{
			inputStream = new BufferedReader(new FileReader("C://DongariList.txt"));
			outputStream = new PrintWriter(new FileWriter("DongariList.txt"));
			String l;
			while((l=inputStream.readLine())!=null){
				if(l.equals(a)){
					outputStream.println(b);
				}else{
					outputStream.println(l);
				}
			}
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
			inputStream = new BufferedReader(new FileReader("DongariList.txt"));
			outputStream = new PrintWriter(new FileWriter("C://DongariList.txt"));
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
	
	/*public void checkmodify(){
		try { // Dongari.txt
			BufferedReader Listtxt = new BufferedReader(new FileReader(new File("C://Dongarirequest.txt")));
			String s = Listtxt.readLine();
			for (int i = 0; s != null; i++) {
				tempt[0] = s;
				s = Listtxt.readLine();
				tempt[1] = s;
				modify(tempt[0],tempt[1]);
				s=Listtxt.readLine();
			}
			Listtxt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void modify(String a, String b) throws IOException{
		/*String oldString[]=a.split("/");
		String newString[]=a.split("/");
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C://DongariList.txt"),false));
			writer.readLine();
			*/
		/*BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		try{
			inputStream = new BufferedReader(new FileReader("C://DongariList.txt"));
			outputStream = new PrintWriter(new FileWriter("DongariList.txt"));
			String l;
			while((l=inputStream.readLine())!=null){
				if(l.equals(a)){
					outputStream.println(b);
				}else{
					outputStream.println(l);
				}
			}
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
			inputStream = new BufferedReader(new FileReader("DongariList.txt"));
			outputStream = new PrintWriter(new FileWriter("C://DongariList.txt"));
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
	*/
	private static void clearScreen() {
		for (int i = 0; i < 40; i++)
			System.out.println();
	}
	private void sleep(int time){
	    try {
	      Thread.sleep(time);
	    } catch (InterruptedException e) {}
	}
}