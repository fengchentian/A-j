package an;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a;
		int b=0;
		Scanner sc=new Scanner(System.in);
		 System.out.println("请输出一个正整数：");
		a=sc.nextInt();
		while(a!=0)
		{
			a=a/10;
			b++;
					 System.out.println(b);
		}

	}

}
