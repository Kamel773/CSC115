import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = x + y;
		System.out.print(x + "," + y);
		for (int i = 1 ; i <= 10 ; i++){
			System.out.print("," + z);
			z = z + y;
			y = z - y;

		}
		System.out.println();

}
}
