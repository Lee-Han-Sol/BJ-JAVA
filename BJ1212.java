package Broze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1212 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] eight0 = {"1","10","11","100","101","110","111"};
		String[] eight = {"000","001","010","011","100","101","110","111"};

		if (str.equals("0")) {
			System.out.println(0);
		}

		else {

			for(int i=49; i<eight0.length+49; i++) {
				if((int)str.charAt(0)==i) {
					System.out.print(eight0[i-49]);
				}
			}

			for(int i=1;i<str.length();i++) {
				for(int j=48; j<eight.length+48;j++) {
					if((int)str.charAt(i)==j) {
						System.out.print(eight[j-48]);
					}

				}

			}

		}

	}

}


//https://dundung.tistory.com/26
//처음 접근은 입력값을 10진수로 받아서 8진으로 변환한뒤
//8진수를 10진수로 다시 바꿔 2진수로 변환시켜보려고 했음.
//이행위는 생각해보면 그냥 10진수를 2진수로 바꾸는거나 다름이 없었음
//입력값 8진수를 String 으로 받아서 문자 하나하나를 바로 2진수로 나타내는걸로 접근변경
//첫 배열은 eight만 가지고 하려니 만약 맨 앞 문자가 1 ~ 3일시 2진수로 표현할떄
//0이 없어져야 함을 인식하였음
//맨 앞 문자의 배열만 따로 만들어주고 순서대로 출력함
//문자를 비교해야함으로 char를 ascii코드와 비교하여 2진으로 표현