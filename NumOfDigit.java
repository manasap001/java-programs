
public class NumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 456, count = 0;
		do {
			num /= 10;
			count++;
		} while (num != 0);
		{
			System.out.println("number of digits in the given number ia=" + count);
		}

	}

}
