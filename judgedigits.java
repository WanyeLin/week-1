import java util.*;
public class Judge
{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		//get input 
		System.out.print("input the num you want to judge");
		int num = in.nextInt();

		//judge 
		int count = 0;

		if(num >0 && num <= 999)
		{	while(num%10 >= 0)
			{	
				num/=10;
				count++;
			}
			System.out.println("该数为"+count+"位数");
		}
		else System.out.println("输入错误");



	}
}