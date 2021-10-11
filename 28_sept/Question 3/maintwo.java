package Assignment_28_Sept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class MainTwo {

	public static void main(String[] args) throws Exception
	{
		
		Manager manager = new Manager();
		manager.setManagerId(001);
		manager.setEmpId(1);
		manager.setEmpFirstName("Akshay");
        manager.setEmpLastName("Patil");
		manager.setEmpDOB("1996-08-12");
		manager.setEmpGender("Male");
		

		   FileOutputStream FOS = new FileOutputStream("manger.ser");
		   ObjectOutputStream OOS = new ObjectOutputStream(FOS);
		   OOS.writeObject(manager);
		   
		   FileInputStream FIS = new FileInputStream("manger.ser");
		   ObjectInputStream OIS = new ObjectInputStream(FIS);
		   
		   Manager M = (Manager)OIS.readObject();
		   System.out.println("ManagerID :"+" EmpID :"+" EmpFirstName :"+" EmplastName :"+" EmpDOB :"+" EmpGender");
		   System.out.println(M.getManagerId()+"         : "+M.getEmpId()+"     : "+M.getEmpFirstName()+"       : "+M.getEmpLastName()+"       : "+M.getEmpDOB()+"   : "+M.getEmpGender());
	
	}

}