import java.util.Scanner;
import java.util.ArrayList;


public class Main {
	public static int input;
	public static String option;
	public static int quantity;
	public static int index = 0;
	public static ArrayList<String> arOption = new ArrayList<String>();
	public static ArrayList<Integer> arQuantity = new ArrayList<Integer>();
	public static String getchar;
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Binus Beverages Shop\n"
				+ "=============================\n"
				+ "1. Buy\n"
				+ "2. See History\n"
				+ "3. Exit\n");
		do {
		System.out.print("Input : ");
		input = sc.nextInt();
		}while(input < 1 || input > 3);
		
		if(input == 1) {
			do {
			System.out.print("Food/Drink : ");
			option = sc.next();
			
			}while(!option.equalsIgnoreCase("Food") && !option.equalsIgnoreCase("Drink"));	
			
			if(option.equalsIgnoreCase("Food")) {
				System.out.print("Quantity [0...5] : ");
				option = "Food";
				quantity = sc.nextInt();
			}
			
			else if(option.equalsIgnoreCase("Drink")) {
				System.out.print("Quantity [0...5] : ");
				option = "Drink";
				quantity = sc.nextInt();
			}
			arOption.add(option);
			arQuantity.add(quantity);;
			index++;
			menu();
		}
		
		else if(input == 2) {
			view();
			menu();
		}
		
	}
	
	public static void view() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("=================================\n"
				+ "|Category\t|Quantity\t|\n"
				+ "=================================\n");
		for(int i = 0; i<index;i++) {
			System.out.println("|\t" + arOption.get(i) + "\t|\t" + arQuantity.get(i) + "\t|");
		}
		System.out.println("=================================");
		getchar = sc.nextLine();
	}
	public static void main(String[] args) {
		menu();
	}

}
