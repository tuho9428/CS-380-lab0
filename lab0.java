package test;

public class lab0 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		String str= "12345", nstr="";
		char ch;
     
       
		for (int i=0; i<str.length(); i++)
		{
			ch= str.charAt(i); //extracts each character
			nstr= ch+nstr; //adds each character in front of the existing string
		}
		System.out.println("Reversed: "+ nstr);

	}

}
