import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static int menu;
	public static String nama;
	public static String password;
	public static String confirmpassword;
	public static String activeLogin = "no active user";
	public static int index = 0;
	public static Vector<String> vrNama = new Vector<String>();
	public static Vector<String> vrPassword = new Vector<String>();
	public static String getchar;

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Binus Banking System\n"
				+ "=======================\n"
				+ "1. Create User\n"
				+ "2. Login\n"
				+ "3. Logout\n"
				+ "4. Delete User\n"
				+ "5. Show User\n"
				+ "6. Exit\n");
		do {
			System.out.print("Menu: ");
			menu = sc.nextInt();
			System.out.println("");
		}while(menu < 1 || menu > 6);
		
		if(menu == 1) {
			create();
		}
		
		if(menu==2) {
			login();
		}
		
		if(menu==3) {
			menu();
		}
		
		if(menu==4) {
			delete();
		}
		
		if(menu==5) {
			show();
		}
	}
	
	public static void create() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Username: ");
		nama = sc.next();
		System.out.print("Password: ");
		password = sc.next();
		do {
		System.out.print("Confirm Password: ");
		confirmpassword= sc.next();
		}while(!confirmpassword.contains(password));
		
		vrNama.add(nama);
		vrPassword.add(password);

		System.out.println("");
		getchar = sc.nextLine();
		menu();
	}
	
	public static void login() {
		String userLogin;
		String userPassword;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Username: ");
			userLogin = sc.next();
		}while(!vrNama.contains(userLogin));
		
		do {
			System.out.print("Pass: ");
			userPassword = sc.next();
		}while(!vrPassword.contains(userPassword));
		
		activeLogin = vrNama.get(vrNama.indexOf(userLogin));
		System.out.print("\n\nActive : " + activeLogin + "\n\n");
		getchar = sc.nextLine();
		menu();
	}
	
	public static void delete() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Input username to be deleted: ");
			nama = sc.next();	
		}while(!vrNama.contains(nama));
		
		System.out.print(vrNama.get(vrNama.indexOf(nama)) + "'s Account has been deleted\n\n");
		
		vrPassword.removeElementAt(vrNama.indexOf(nama));
		vrNama.removeElement(nama);
//		
//		System.out.println("vector" + vrPassword);
//		System.out.println("vector" + vrNama);
		
		getchar = sc.nextLine();
		menu();
		
	}
	
	public static void show() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("List User\n"
				+ "=============\n");
		
		vrNama.forEach((n) -> System.out.println(n));

		getchar = sc.nextLine();
		menu();
		
	}
	
	public static void main(String[] args) {
		menu();
	}
	
}