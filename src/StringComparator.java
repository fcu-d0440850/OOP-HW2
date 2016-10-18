import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String name1,name2;
		System.out.println("Enter a string1 :");
		name1=scanner.next();
		System.out.println("Enter a string2 :");
		name2=scanner.next();
		
		int a;
		a=name1.compareTo(name2);
		if(a==0)
		System.out.println("The two strings are the same");
		else
		System.out.println("The two strings are not the same");
	}

}
