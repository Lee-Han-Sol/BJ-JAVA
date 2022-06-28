package Broze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1550 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int a = Integer.parseInt(str,16);
		
		System.out.println(a);
	}

}

//16진수로 변환하는 법을 알기위해 찾아보니 Integer.parseInt(변환값,진수값)임을 암
