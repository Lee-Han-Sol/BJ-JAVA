package Broze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1000 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b;
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		a=Integer.parseInt(st.nextToken()); 
		b=Integer.parseInt(st.nextToken());
		

		System.out.println(a+b);
		
	}

}


// �׻� scanner ����ٰ� BufferedReader�� ó���ӵ��� �������Ͽ�
// scanner ���� ��ôµ� �о���� �޼ҵ尡 read()�� ���ԵǸ�
// ascii������ ������ ���ϴ� ���� ���� �� �� ������.
// �׷��� 0�� �ش��ϴ� 48�� �Է¿��� ���༭ �ش� ascii���� 10���� ���·� ��� ������
// a=br.read()-'0'; or a = br.read()-48;
// ������ ���ٷ� �ٹ޾Ƽ� ����ϴ� ���ε� read()�� �ѹ��ڸ� �о�� 10�̻��� ���ڸ� ��������.
// read()���� readLine()���� �޼ҵ带 ����
// ������ ���鸶�� �Է°����� �޾ƹ���
// �����ڸ� ���� StringTokenizer Ŭ������ ���
// str�� ���� ��ü String���� �޾� " "�� �������� ��ū�� ����
// a�� ù ��ū �ο� b�� �ι�°�� �ο�

//���� �迭 splilt

		/*
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		*/