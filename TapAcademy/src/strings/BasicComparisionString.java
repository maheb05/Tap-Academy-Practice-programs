package strings;

public class BasicComparisionString {
	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		
		if(s1 == s2) {
			System.out.println("Reference are equal");
		}
		else {
			System.out.println("Reference are not equal");
		}
		System.out.println();
		
		if(s1.equals(s2)) {
			System.out.println("Values are equal");
		}
		else {
			System.out.println("Values are not equal");
		}
		
		int res = s1.compareTo(s2);
		System.out.println(res);
		System.out.println();
		
		
		String s3 = new String("Name");
		String s4 = new String("Name");
		
		if(s3 == s4) {
			System.out.println("Reference are equal");
		}
		else {
			System.out.println("Reference are not equal");
		}
		System.out.println();
		
		
		if(s3.equals(s4)) {
			System.out.println("values are Equal");
		}
		else {
			System.out.println("values are not equal ");
		}
		System.out.println();
		
		
		if(s3.equalsIgnoreCase(s4)) {
			System.out.println("equal");
		}
		else {
			System.out.println("Not equal");
		}
		System.out.println();
		
		int rest = s3.compareTo(s4);
		System.out.println(rest);
	}

}
