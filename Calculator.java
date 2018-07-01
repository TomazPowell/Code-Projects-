import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc=  new Scanner (System.in);
		
		int choice= -1;
		do{
			System.out.println("Addition: 1");
			System.out.println("Subtaction:2");
			System.out.println("Multiplication:3");
			System.out.println("Division: 4");
			System.out.println("Exit: 0");
			
			choice= sc.nextInt();
			
			switch(choice){
			case 1:
				System.out.println("Enter two numbers");
				int a= sc.nextInt();
				int b= sc.nextInt();
				System.out.println(a+b);
				break;
			
			case 2:
				System.out.println("Enter two numbers");
				 a = sc.nextInt();
				 b= sc.nextInt();
				 System.out.println(a-b);
				 break;
				 
			case 3:
				System.out.println("Enter two numbers");
				 a= sc.nextInt();
				 b= sc.nextInt();
				 System.out.println(a*b);
				 break;
				 
			case 4:
				System.out.println("Enter two numbers");
				a= sc.nextInt();
				b= sc.nextInt();
				System.out.println(a/b);
				break;
			case 5:
				System.out.println("Exit");
				
			}
			
		}
           while (choice !=0);
	
	}

}


