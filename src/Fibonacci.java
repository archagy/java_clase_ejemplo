
public class Fibonacci {
	
	public Fibonacci(int num){
		 int fibo1,fibo2,i;
	     do{
	    
	     }while(num<=1);
	        System.out.println("Los " + num + " primeros términos de la serie de Fibonacci son:"); 

	        fibo1=1;
	        fibo2=1; 

	        System.out.print(fibo1 + " ");
	        for(i=2;i<=num;i++){
	             System.out.print(fibo2 + " ");
	             fibo2 = fibo1 + fibo2;
	             fibo1 = fibo2 - fibo1;
	        }
	        System.out.println();
	}
}
	
	

