
public class PositiveOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-123;
		PositiveOrNeg ref=new PositiveOrNeg();
		int PositiveOrNeg=ref.PositiveOrNeg(num);
		

	}
	
	private int PositiveOrNeg(int num) {
		// TODO Auto-generated method stub
		int result=0;
	if(num>0)
	{
	System.out.println("the given number is positive:"+num);
	}
	else if(num<0)
	{
	System.out.println("the given number is negative:"+num);
	}
	else{
		System.out.println("number is zero");
	}
	return result;
	}
}
