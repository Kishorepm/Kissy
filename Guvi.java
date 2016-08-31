package test;
public class Guvi {
	public static void main(String[] args)
	{
		String o = "hi today is very bad day";

		char[] c = o.toCharArray();
		for(int i=0;i<o.length();i++)
		{
		if(o.charAt(i)=='e')
		{
			c[i]='a';
		}
		if(o.charAt(i)=='a')
		{
			c[i]='e';
		}
		}
		    String swappedString = new String(c);
	    	
	    	String source = swappedString;
	        StringBuffer res = new StringBuffer();

	        String[] strArr = source.split(" ");
	        for (String str : strArr) {
	            char[] stringArray = str.trim().toCharArray();
	            stringArray[0] = Character.toUpperCase(stringArray[0]);
	            str = new String(stringArray);

	            res.append(str).append(" ");
	        }

	        System.out.print(res.toString().trim());

		
  }

}
