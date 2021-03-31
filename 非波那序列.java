import java.util.Scanner;

public class 非波那序列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("你需要寻找第几项的该数列");
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
