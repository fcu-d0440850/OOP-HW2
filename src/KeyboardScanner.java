import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int num1;
		float num2,num3;
		String name;
		System.out.println("Enter an integer :");
		num1=scanner.nextInt();
		System.out.println("Enter a float point number :");
		num2=scanner.nextFloat();
		System.out.println("Enter your name :");
		name=scanner.next();
		num3=num2*num1;
		System.out.printf("Hi %s,the multpiplication of %d and %f is %.2e",name,num1,num2,num3);

	}

}
