public class WrongSubtraction{

	int n, k=0;

	public static int subtractedResult(int n,int k){

		for (int i=0; i<k; i++) {
			
			if (n % 10==0) {
				n=n/10;			
			}else{
				n--;
			}
		}

		return n;	
	}

	public static void main(String [] args) {

		int firstArg=0;
		int secondArg=0;

		try{
			firstArg=Integer.parseInt(args[0]);
		}catch(NumberFormatException e){
			System.out.println("Argument " +args[0]+ " must be an integer");
			System.exit(1);
		}

		try{
			secondArg=Integer.parseInt(args[1]);
		}catch(NumberFormatException e){
			System.out.println("Argument " +args[1]+ " must be an integer");
			System.exit(1);
		}

		int result=subtractedResult(firstArg,secondArg);
		System.out.println(result);

	}

}
