package strings;

import java.util.Scanner;

class zrever{	
	static String reverse(String s,String s1,String s2)
	{
		
		String t="";
		
		int j=0;
	    char[] ar=s.toCharArray();
	    char[] scr=s1.toCharArray();
	    
	    for(int i=0;i<ar.length-scr.length+1;i++)
	    {
	    	for(j=0;j<scr.length;j++)
	    	{
	    		if(scr[j]!=ar[i+j])
	    		{
	    			break;
	    		}
	    	}
	    	
	    	if(j==scr.length)
	    	{
	    		t=t+s2;
	    		i=i+scr.length-1;
	    		
	    	}
	    	else
	    	{
	    		t=t+ar[i];
	    	}
	    		
	    	
	    }
	    if(j!=scr.length)
	    {
	    	for(int i=ar.length-scr.length+1;i<ar.length;i++)
	    	{
	    		t=t+ar[i];
	    	}
	    } 
	    return t;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		String res=reverse(s,s1,s2);
		System.out.println(res);
		
		
	}

}
