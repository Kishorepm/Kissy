package basicPrg;

import java.util.Scanner;

public class guviHard {
@SuppressWarnings("resource")
public static void main(String args[])
{
	String wrd;
	Scanner s=new Scanner(System.in);
	wrd=s.nextLine();
    String str[] = wrd.split(",");
    	int strl1=str[0].length();
    	String output  = Character.toLowerCase(str[1].charAt(0)) +
                (str[1].length() > 1 ? str[1].substring(1) : "");
    	String output1  = Character.toLowerCase(str[2].charAt(0)) +
                (str[2].length() > 1 ? str[2].substring(1) : "");
    	int strl2=output.length();
        if(str[0].charAt(strl1-1)==output.charAt(0) && str[1].charAt(strl2-1)==output1.charAt(0))
        {
        	System.out.println("door opened");
        }
        else
        {
        	System.out.println("door not opened");
        }
}
}

