package Aarays;

import java.util.Scanner;

public class Infini {
	
	public static int countStrings(char[] c)
	{
		int count=1;
		for(char x: c)
		{
			if(x==' ')
			{
				count++;
			}
			
		}
		return count;
	}
	
	public static String[] appendStringToArray(char[] c, int count)
	{
		String [] ar=new String[count];
		int num=0;
		String temp="";
		for(char x:c)
		{
			if(!(x==' '))
			{
				temp+=x;
			}
			else
			{
				ar[num++]=temp;
				temp="";
				
			}
		}
		ar[num]=temp;
		
		return ar;

	}
	
	public static void removeConsecutiveString(String[] ar , int count)
	{
		int i=0,j=1;
		System.out.print(ar[0]+" ");
		for( i=0;i<count-1;)
		{
			if(ar[i].equals(ar[j]))
			{
				i++;
				j++;
			}
			else
			{
				System.out.print(ar[j]+" ");
				i++;
				j++;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		char[] c = s.toCharArray();
		
		int count = countStrings(c);
		
		String[] ar = appendStringToArray(c, count);
		removeConsecutiveString(ar, count);
	}
}
