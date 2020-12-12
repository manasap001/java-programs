
public class ArithematicOperationsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("begin of the program");
		
		ArithematicOperation ref=new ArithematicOperation();
		int a=10,b=15;
		int result1=ref.addition(a, b);
		System.out.println(+result1);
		
		float c=9.2f,d=1.5f;
		float result2=ref.subtraction(c,d);
		System.out.println(+result2);
		
		double e=9.23d,f=4.44d;
		double result3=ref.multiplication(e,f);
		System.out.println(+result1);
		
		int g=20,h=2;
		int result4=ref.division(g,h);
		System.out.println(+result4);
		
		int i=10,j=15;
		int result5=ref.modulus(i, j);
		System.out.println(+result5);
		
		
		

	}

}
