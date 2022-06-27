package Broze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1085 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int minx,miny;
		
		if(x<=w/2) {			
			minx = x;
		}
		else {
			minx = w-x;
		}
		
		if(y<=h/2) {
			miny = y;
		}
		else {
			miny = h-y;
		}
		
		if(minx<=miny) {
			System.out.println(minx);
		}
		else {
			System.out.println(miny);
		}
	}

}

//ó�� ������ �߸������Ͽ� x,y���� w,h���� ���� �Ÿ��� ���ϴ� �پ˰� �߸� Ǯ����
//x,y�� ���� ���簢���� ������ �ǹǷ� x�� �ּڰ�,y�� �ּڰ� ���ѵ�
//���� ũ�⸦ ���ϰ� ���� ���� ���
