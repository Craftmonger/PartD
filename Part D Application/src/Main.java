import java.util.Scanner;
public class Main 
{
	public static Scanner scanner = new Scanner(System.in);	
	public static String name;
	public static String colour;
	public static String transportation;
	public static String day;
	
	public static void main(String[] args) 
	{
		System.out.println("Hi my name is________");
		name = scanner.nextLine(); 
		System.out.println("My favourite colour is________");
		colour = scanner.nextLine(); 
		System.out.println("My favourite mode of transportation is________");
		transportation = scanner.nextLine(); 
		System.out.println("The best day of the week is________");
		day = scanner.nextLine(); 
	}
}
