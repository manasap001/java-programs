
public class EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=12;
		EvenOrNot ref=new EvenOrNot();
		int res=ref.evenOrNot(num1);
		//System.out.println("the given number "+res);


	}

	int evenOrNot(int num1) {
		// TODO Auto-generated method stub
		int result=0;
		if(num1%2==0)
		{
			System.out.println("the given number is even:"+num1);
		}
		else
		{
		System.out.println("the given number is odd:"+num1);
		}

		return result;
	}

}
