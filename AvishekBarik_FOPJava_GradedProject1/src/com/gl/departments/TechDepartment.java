package com.gl.departments;

public class TechDepartment extends SuperDepartment {
	
	private String deptName="Tech Department",todaysWork="Complete coding of module 1",
			deadline="Complete by EOD", techStack="core Java";
	
	public String departmentName()
	{
		return deptName;
	}
	public String getTodaysWork()
	{
		return todaysWork;
	}
	public String getWorkDeadline()
	{
		return deadline;
	}
	public String getTechStackInformation()
	{
		return techStack;
	}
	
	public String isTodayAHoliday(SuperDepartment sd)
	{
		return sd.isTodayAHoliday();
	}
	
	
}
