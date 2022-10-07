package com.gl.departments;

public class HrDepartment extends SuperDepartment{
	
	private String deptName="HR Department",todaysWork="Fill Today's timesheet and mark your attendance",
			deadline="Complete by EOD",activity="team Lunch";
	public String departmentName() {
		return deptName;
	}
	
	public String getTodaysWork() {
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		return deadline;
	}
	
	public String doActivity() {
		return activity;
	}
	
	public String isTodayAHoliday(SuperDepartment sd)
	{
		return sd.isTodayAHoliday();
	}
	
	
//	public void displayFunctinalities() {
//		String display;
//		display=this.departmentName();
//		System.out.println(display);
//		display=this.getTodaysWork();
//		System.out.println(display);
//		display=this.getWorkDeadline();
//		System.out.println(display);
//		display=this.doActivity();
//		System.out.println(display);
//		display=this.isTodayAHoliday();
//		System.out.println(display);
//		
//		
//	}
}