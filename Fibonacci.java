
public class Fibonacci{



	public static int fibo(int n){

		int f[]=new int[n];
		f[0]=1;
		f[1]=1;

		for (int i=2;i<n;i++) {
			
			f[i]=f[i-1]+f[i-2];

		}

		return f[n-1];

	}

	public static void main(String[] args) {

		int firstArg=0;


		try{
			firstArg=Integer.parseInt(args[0]);
		}catch(NumberFormatException e){

			System.out.println("Argument " +args[0]+ "must be within boundaries");
			System.exit(1);
		}

		int result =fibo(firstArg	);
		System.out.println(result);

		// int test=fibo(8);
		// System.out.println(test);

	}

}