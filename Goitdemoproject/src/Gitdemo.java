import java.util.HashSet;
import java.util.Set;

public class Gitdemo {

	public static void armstrong(int num)
	
	{
		int cube =0;
		int r;
		
		int t;
		t=num;
		while(num>0)
		{
			r=num%10;
			
			num=num/10;
			cube =cube+(r*r*r);
			
		}
		if(t==cube)
		{
			System.out.println("armstroing");
		}else
		{
			System.out.println("not armstrong");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		armstrong(15);
		System.out.println("adding to staging areaaaaaaaaa");
	

	}

	
	
	
}
