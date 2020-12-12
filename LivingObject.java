
public class LivingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Living female=new Living();
		female.age=25;
		female.color="white";
		System.out.println("color of female is :"+female.color);
		System.out.println("age of the female is:"+female.age);
		female.color="black";
		System.out.println("changed color of female is:"+female.color);
		Living male=new Living();
		male.color="dusty";
		male.age=30;
		male.reproduction="absent";
		System.out.println("reproduction of male is:"+male.reproduction);

	}

}
