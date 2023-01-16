package in.training;
import java.util.Scanner; 
public class Factorial {
	static int number;
	static int i;
	static int sum=1;
	
public static void main(String []args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your number");
	number=sc.nextInt();
	{
	for(i=1;i<=number;i++){    
	    sum=sum*i;
	    
	}
	System.out.println("Factorial is" +sum);
}
}
}