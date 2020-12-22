package com.xworkz.inheritence;

public class EmpDtls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmpDtls emp=new ChildEmpDtls();
		emp.emp_id=100;
		emp.emp_name="manasa";
		emp.displayDetails();
		emp.working();
		emp.login=true;
		System.out.println("employee login");
		emp.attendingMeeting();
		
		
		ParentEmpDetails emp1=new ParentEmpDetails();
		emp1.emp_id=001;
		emp1.emp_name="asha";
		
		emp1.working();
		
		
		

	}

}
