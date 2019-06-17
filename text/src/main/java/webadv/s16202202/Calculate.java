package webadv.s16202202;

import java.util.Scanner;

public class Calculate {
 
	public static void main(String[] args) {
	kaishi();
	}
	public static int suijishu() //产生随机数
	{
		int x=(int)(Math.random ()*(100-1+1));
		return x;
	}
	 
	public static char suijifuhao()//随机符号
	{
		int x=(int)(Math.random ()*(3-1+1));
		if (x==1) return '+';
		if (x==2) return '-';
		if (x==3) return '*';
		else return '/';
	}
	public static int yunsuan()//产生运算式
	{
		int x=suijishu();
		int x1=suijishu();
		char y=suijifuhao();
		System.out.println("运算式："+x+y+x1);
			if(y=='+')return x+x1;
			if(y=='-')return x-x1;
			if(y=='*')return x*x1;
			else return Math.round (x/x1);
			}
	public static boolean jiancha()//检查是否正确
	{
		int sr,zq;zq=yunsuan();
		System.out.print("输入答案：");
		Scanner sc=new Scanner(System.in);
		sr=sc.nextInt();
		if(sr==zq){System.out.println("正确！");return true;}
		else System.out.println("错误！");return false;
	 
	}
	public static int chengji(int cishu)
	{
		int cj=0;
		for(int i = 0; i < cishu; i++)
		{
			if (jiancha()) cj+=1;
			else continue;
		}
		return cj;
	}
	public static void kaishi()
	{
		int x = 0;
		System.out.print("输入题目数量：");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("得分："+chengji(x));
	}
}
