import java.util.Scanner;

public class �ǲ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����ҪѰ�ҵڼ���ĸ�����");
		int n,number;
		Scanner input =new Scanner(System.in);
		n=input.nextInt();
		number=fib(n);
		System.out.print(number);
	}
	static int fib(int n) {
		if(n==1||n==2) {return 1;}
		return fib(n-1)+fib(n-2);
	}
}
