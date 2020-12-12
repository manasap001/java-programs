
public class NonLivingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonLiving laptop=new NonLiving();
		laptop.processor="corei3";
		laptop.RAM="16gb";
		laptop.batterylife="7hours";
		System.out.println("laptop processor is:"+laptop.processor);
		System.out.println("laptop RAM is:"+laptop.RAM);
		System.out.println("laptop batterylife is:"+laptop.batterylife);
		laptop.processor="corei7";
		System.out.println("laptop processor is:"+laptop.processor);
		
		
		

	}

}
