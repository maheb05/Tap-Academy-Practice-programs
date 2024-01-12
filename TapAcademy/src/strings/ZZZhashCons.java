package strings;

import java.util.*;
public class ZZZhashCons {

		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<String> set=new HashSet<>();
		String s=sc.nextLine();
		int l=0;
		char c[] = s.toCharArray();
	    for (char c1 : c) 
	    {
	        l++;
	    }
	    
	    int c1=0;
		  for(int i=0;i<l;i++)
		  {
			  if((c[i]==' '))
			  {
				  c1++;
			  }
		  }
		  
	    String t = "";
	    String b[] = new String[c1+1];
	    int j=0;
	    for (int i = 0; i < l; i++)
	    {
	        if (!(c[i] == ' ')) 
	        {
	            t = t + c[i];
	        }
	        else if(t!=" ")
	        {
	        	b[j]=t;
	        	j++;
	        	t="";
	        }
	    }
	    b[j]=t;
		for(String i1:b)
		{
			set.add(i1);
			
		}
		for(String l1:set) {
			System.out.print(l1+" ");
		}

		}

}
