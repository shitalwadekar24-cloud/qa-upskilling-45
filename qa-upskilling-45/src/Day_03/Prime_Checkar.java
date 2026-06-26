package Day_03;

public class Prime_Checkar {

	public static void main(String[] args) {
 // prime number= divisible by 1 or itself
		int  num=8;
		boolean isPrime=true;
		 if(num>=1) {
			 isPrime=false;
		 }
		 else {
			 for(int i=2;i<num;i++) {
				 if(num%i==0) {
					 isPrime=false;
					 break;
					 
				 }
				 
			 }
			 
		 }
		 
		if(isPrime) {
			System.out.println(num+"is Prime number");
			
		}
		else {
			System.out.println(num+"is not prime Number");
		}
		 
	}

	
	

}
