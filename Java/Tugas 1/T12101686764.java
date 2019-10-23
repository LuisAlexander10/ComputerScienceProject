import java.util.Scanner;

public class kalkulatorProgram 
{
	public static void main(String[]	 args)
	{
		double total = 0.0;
		int option = 0;
		double num1 = 0;
		double num2 = 0;
		do {
			System.out.println("Caculator\n=============\nTotal = " + total);
			Scanner sc = new Scanner(System.in);
			
			//input number 1
			System.out.print("Input Number : ");
			num1 = sc.nextInt();
			
			//input option
			System.out.print("1. Addition\n"
					+ "2. Substraction\n"
					+ "3. Multiplication\n"
					+ "4. Division\n"
					+ "5. Modulo\n"
					+ "6. Clear Total\n"
					+ "7. Exit\n");
					do {
					System.out.print("Operator [1...7]: ");
			option = sc.nextInt();
			if(option == 1) {
				System.out.print("Input Number : ");
				num2 = sc.nextInt();
				total = num1+num2;
			}else if(option == 2) {
				System.out.print("Input Number : ");
				num2 = sc.nextInt();
				total = num1-num2;
			}else if(option == 3) {
				System.out.print("Input Number : ");
				num2 = sc.nextInt();
				total = num1*num2;
			}else if(option == 4) {
				System.out.print("Input Number : ");
				num2 = sc.nextInt();
				total = num1/num2;
			}else if(option == 5) {
				System.out.print("Input Number : ");
				num2 = sc.nextInt();
				total = num1%num2;
			}else if(option == 6) {
				System.out.print("Input Number : ");
				total = 0.0;
			}else if(option == 7) {
				
			}
					}while(option < 1 || option >7);
		}while(option !=7);
		
		

		
	}
}
			
