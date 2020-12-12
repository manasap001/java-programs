
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		GreatestNumber ref=new GreatestNumber();
		
		int res1=ref.greatestNumber(a,b,c);
		System.out.println(res1+"is the greatest number among a,b,c");
		}
	
	int greatestNumber(int a, int b, int c) {
		 int result=0;
		 if(a>b)
		 {
		  if(b>c)
			 {
				 result=a;
			 }
			 else
			 {
				 result=c;
			 }
		 }else
		 {
			  if(b>c) {
				  result=b;
			  }
			  else
			  {
				  result=c;
		  }
		 }
	 
		// TODO Auto-generated method stub
		return result;
	 }
}

