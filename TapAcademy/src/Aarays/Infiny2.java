package Aarays;

import java.util.Scanner;

public class Infiny2 {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			String OriginalString =sc.nextLine();
			String SearchString=sc.next();
			String ReplacementString=sc.next();
			char[] ar=OriginalString.toCharArray();
			String temp="";
			String res="";
			for(char c:ar)
			{
				if(c!=' ')
				{
					temp+=c;
				}
				else 
				{
					if(temp.equals(SearchString))
					{
						System.out.print(ReplacementString+" ");
						temp="";
					}
					else
					{
						System.out.print(temp+" ");
						temp="";
					}
				}
				
			}
	        if (temp.equals(SearchString)) {
	            System.out.print(ReplacementString);
	        } 
	        else {
	            System.out.print(temp);
	        }

	}
}
