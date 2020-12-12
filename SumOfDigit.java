
public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=125,sum=0;
		do {
			num/=10;
			sum+=num%10;
			sum++;
		
		}
		while(num!=0);
		{
			System.out.println("sum of the given digit="+sum);
		}

	}

}
