package Set1;

import java.util.Scanner;

public class VegNonVegAmount {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int quantity,distance,bill=0,item=0;
		char ch = sc.next().charAt(0);
		quantity=sc.nextInt();
		distance=sc.nextInt();
		if(distance<0||quantity<1||(ch!='N'&&ch!='V'))
			System.out.println(-1);
		else
		{
			if(ch=='N')
				item=15;
			else if(ch=='V')
				item=12;
			bill=quantity*item;
			if(distance>3 && distance <7)
				bill+=distance-3;
			else if(distance>6)
				bill+=(distance-6)*2+3;
			System.out.println(bill);
		}
		sc.close();		
	}
}
