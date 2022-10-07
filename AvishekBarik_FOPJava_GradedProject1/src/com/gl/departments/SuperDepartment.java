package com.gl.departments;

public class SuperDepartment {
	private String deptName="Super Department",todaysWork="No Work as of now",
			deadline="Nil";
	
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
	
	public String isTodayAHoliday()
	{
		return "Today is not a holiday";
	}

}
