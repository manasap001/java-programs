
public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=123,count=0;
		NumberOfDigits ref=new NumberOfDigits();
		int res1=ref.numberOfDigits(num1,count);
		}

      int numberOfDigits(int num1,int count) {
		// TODO Auto-generated method stub
    	  int result=0;
    	  do
          {
          	num1=num1/10;
  			count++;
          	
          }
  		while(num1>0);
    	  System.out.println("no of digits:" +count);
		return result;
	}

}

