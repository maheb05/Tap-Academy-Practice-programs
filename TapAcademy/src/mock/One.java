package mock;

import java.util.Scanner;

public class One {
			public static void main(String args[])
			{
				Scanner scan=new Scanner(System.in);
				String s=scan.nextLine();
				char[] ch=s.toCharArray();
				String result="";
				String t="";
				int count=0;
				for(char c:ch)
				{
					if(!(c==' '))
						
					{
						t+=c;
						count++;
					}
					else
					{
						char[] tA=t.toCharArray();
						
						for(int i=count-1;i>=0;i--)
						{
							result+=tA[i];
						}
						t="";
						count=0;
						result+=" ";
					}
				}
				char[] tA=t.toCharArray();
				
				for(int i=count-1;i>=0;i--)
				{
					result+=tA[i];
				}
				t="";
				count=0;
				result+=" ";
			
				
				System.out.println(result);
				
			}
		}