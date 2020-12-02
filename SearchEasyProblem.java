
import java.util.Scanner;

public class SearchEasyProblem{

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		int number =scanner.nextInt();
		int array[]=new int[number];
		boolean flag=false;
		int counter=0;

		for (i=0; i<number;i++) {
			
			array[i]=number.nextInt();

			counter+=array[i];
		}

		if (counter==1) {
			System.out.println("HARD");
		}else {System.out.println("EASY");

	}

}
}