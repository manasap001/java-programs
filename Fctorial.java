
public class Fctorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5,i=1,fact=1;
		Fctorial ref=new Fctorial();
	    int res =ref.fctorial(num,i,fact);
	    //System.out.println(+res);

	}

	int fctorial(int num,int i,int fact) {
		// TODO Auto-generated method stub
		int result=0;
		do {
			fact=fact*i;
			i++;
		}
		while(i<=num);

		{
			System.out.println("the factorial of a given number ="+fact);
		}
		
		return result;
	}
}

