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

//16������ ��ȯ�ϴ� ���� �˱����� ã�ƺ��� Integer.parseInt(��ȯ��,������)���� ��
