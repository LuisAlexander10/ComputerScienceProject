import java.util.Scanner;

public class main {

	public static int checking(int a) throws Exception {
		if(a > 100) {
			throw new IllegalArgumentException("n must be less than 100");
		}
		return a;

	}

	public static void main(String[] args) {
		try {
			checking(0+1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.print("udalah gapapa");
		}
	}

}
