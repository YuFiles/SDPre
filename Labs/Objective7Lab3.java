public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    /*
      Your solution goes here
    */
		while(counter<=20){
			if(counter % 2 ==  0){
				System.out.println(counter + " is even");
			}
			else{
				System.out.println(counter + " is odd");
			}
			counter+=1;
		}

  }
}