
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=5;
		Pyramid ref=new Pyramid();
		int pyramid=ref.pyramid(num1);
	}

	 int pyramid(int num1) {
		// TODO Auto-generated met228hod stub
		 int result=0;
		 for(int i=1;i<=num1;i++)
			{
				for(
						int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				
			System.out.println();
			}
			
		 
		 
		return result;
	}
		


	

}
