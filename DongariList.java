package DongariSearch;

import java.io.*;

public class DongariList {
	DList[] L; // txt 맨윗줄에 size 반환할 것 추가
	

	public DongariList() {
		try { // Dongari.txt
			BufferedReader Listtxt = new BufferedReader(new FileReader(new File("C://DongariList.txt")));
			String s = Listtxt.readLine();
			int dongsize = Integer.parseInt(s);
			L = new DList[dongsize];
			s= Listtxt.readLine();
			for (int i = 0; i<dongsize; i++) {
//			for (int i = 0; s != null; i++) {
				String[] result = s.split("/");
				L[i] = new DList(result[0], result[1], result[2], result[3], result[4], result[5]);
				s = Listtxt.readLine();
			}
			Listtxt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String toString(int i) {
		return L[i].name+" "+L[i].location+" "+L[i].specificlocation+" "+L[i].tag[0]+" "+L[i].tag[1]+" "+L[i].tag[2];
	}
}

class DList {
	String name;
	String location;
	String specificlocation;
	String[] tag = new String[3];

	public DList(String name, String location, String speloc, String tag1, String tag2, String tag3) {
		this.name = name;
		this.location = location;
		this.specificlocation = speloc;
		this.tag[0] = tag1;
		this.tag[1] = tag2;
		this.tag[2] = tag3;
	}
}