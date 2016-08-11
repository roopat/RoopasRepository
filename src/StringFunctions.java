public class StringFunctions {
	
	public static void main(String args[])
	{
		String str="This is the new string";
		System.out.println("Length of the string "+str.length());
		System.out.println("Eight Character"+str.charAt(8));
		System.out.println(str.indexOf('t'));
		System.out.println(str.indexOf('t',9));		
		System.out.println(str);
	    System.out.println("_____________________");
		String temp[]=str.split("string");
		Integer length=str.length();
		for(int i=0;i<=length;i++)
		{
			System.out.println(temp[i]);
		}
	}
}
