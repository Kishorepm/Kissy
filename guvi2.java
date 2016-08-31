package test;

public class guvi2 {
	public static void main(String args[])
	{
		
		int count=0;
		int c=0;
		
			  for (int i=2000;i <=2010 ; i++)
			  {
			  if(i%2==0 ){
			 // System.out.print(i);
			  int a=i;
			  
			  while(c!=0)
			  {
			  int b=a%10;
			  if(b%2==0)
			  {
				  b=a/10;
				  if(b%2==0)
				  {
					  b=a/10;
					  if(b%2==0)
					  {
						  b=a/10;
						  if(b%2==0)
						  {
							  count++;
							  c=0;
						  }else
							  c=0;
					  }
					  else c=0;
				  }else c=0;
				  
			  }else c=0;
			  }
			  }
			  }
			  System.out.println(count);
	}
	

}


