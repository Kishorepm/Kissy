
import java.util.*;
import java.lang.*;
import java.io.*;

public class Isomorphic
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1,s2;
		// your code goes here
		
		Scanner s=new Scanner(System.in);
		s1=s.nextLine();
		System.out.println("Enter the String2");
		Scanner b=new Scanner(System.in);
		s1=b.nextLine();
		if(isomorphic(s1,s2)==true)
		{
	    System.out.println("strings are Isomorphic");
		}else
		{
			System.out.println("strings are not Isomorphic");
		}
	}
	public boolean isomorphic(String s1,String s2)
		{
			if(s1==NULL || s2==NULL)
			{
				return false;
			}
			if(s1.length()!=s2.length())
			{
				return false;
			}
			HashMap<Character, Character >Map = new Hashmap<Character, Character>();
			for(int i=0;i<s1.length;i++)
			{
				char c1=s1.charAt(i);
				char c2=s2.charAt(i);
				if(map.containsKey(c1))
				{
					if(map.get(c1)!=(c2))
					return false;
				}else
				{
					if(map.containsKey(c2))
					return false;
					map.put(c1, c2);
				}
			}
			return true;
		}
		
}
