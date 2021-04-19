public class UsingMethods{
	public static void main(String[] args){
		square();
		System.out.println("\n");
		rectangle();


	}

	public static void square(){
		for (int i = 0; i < 10; i++ ){
			System.out.println("XXXXXXXXXXXXXXXXXXXX");
		}
	}

	public static void rectangle(){
		square();
		square();
	}


}