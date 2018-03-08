package aeiou;
import java.util.Scanner;
public class fvowel {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any string");
		String text=scanner.nextLine();

		scanner.close();

		int length= text.length()-1;

		for(int i=0;i<=length;i++) {


			char c1=text.charAt(i);
			if(c1 =='a' || c1 =='e' ||c1 =='i' ||c1 =='o' ||c1 =='u') {
				System.out.println(c1);
				break;

			}
		}
	}
}
