package test;
public class Guvi {
	public static void main(String[] args)
	{
		String givenString= "hi today is very bad day";
		char[] a = givenString.toCharArray();
		for(int i=0;i<givenString.length();i++)
		{
		if(givenString.charAt(i)=='e')
		{
			a[i]='a';
		}
		if(givenString.charAt(i)=='a')
		{
			a[i]='e';
		}
		}
		String newString = new String(a);
	    	String source = newString;
	        StringBuffer result = new StringBuffer();
	        String[] strArr = source.split(" ");
	        for (String str : strArr) {
	            char[] stringArray = str.trim().toCharArray();
	            stringArray[0] = Character.toUpperCase(stringArray[0]);
	            str = new String(stringArray);

	            result.append(str).append(" ");
	        }
	        System.out.print(result.toString().trim());
  }

}
