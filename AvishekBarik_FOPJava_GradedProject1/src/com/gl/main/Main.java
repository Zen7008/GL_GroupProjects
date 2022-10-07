package com.gl.main;
import com.gl.departments.*;

public class Main {
	
	public static void main(String[] Args)
	{
		SuperDepartment sd= new SuperDepartment();		
		System.out.println("Welcome to "+ sd.departmentName());		
		System.out.println(sd.getTodaysWork());		
		System.out.println("Work deadline "+sd.getWorkDeadline());		
		System.out.println(sd.isTodayAHoliday()+"\n");
		
		
		AdminDepartment ad= new AdminDepartment();		
		System.out.println("Welcome to "+ ad.departmentName());		
		System.out.println(ad.getTodaysWork());		
		System.out.println(ad.getWorkDeadline());		
		System.out.println(ad.isTodayAHoliday()+"\n");
		
		HrDepartment hd= new HrDepartment();		
		System.out.println("Welcome to "+ hd.departmentName());
		System.out.println(hd.doActivity());		
		System.out.println(hd.getTodaysWork());		
		System.out.println(hd.getWorkDeadline());		
		System.out.println(hd.isTodayAHoliday()+"\n");
		
		
		TechDepartment td= new TechDepartment();		
		System.out.println("Welcome to "+ td.departmentName());		
		System.out.println(td.getTodaysWork());		
		System.out.println(td.getWorkDeadline());		
		System.out.println(td.isTodayAHoliday()+"\n");
		
		
	}

}
