import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int num1;
		System.out.println("Enter an integer :");
		num1=scanner.nextInt();
		
		if(num1==1)
		System.out.println("The input integer is ¡§ONE¡¨");
		else if(num1==2)
		System.out.println("The input integer is ¡§TWO¡¨");
		else if(num1==3)
		System.out.println("The input integer is ¡§THREE¡¨");
		else if(num1==4)
		System.out.println("The input integer is ¡§FOUR¡¨");
		else if(num1==5)
		System.out.println("The input integer is ¡§FIVE¡¨");
		else if(num1==6)
		System.out.println("The input integer is ¡§SIX¡¨");
		else if(num1==7)
		System.out.println("The input integer is ¡§SEVEN¡¨");
		else if(num1==8)
		System.out.println("The input integer is ¡§EIGHT¡¨");
		else if(num1==9)
		System.out.println("The input integer is ¡§NINE¡¨");
		else
		System.out.println("The input integer is ¡§OTHER¡¨");
		

	}

}
