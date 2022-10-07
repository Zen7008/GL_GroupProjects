package com.gl.departments;

public class AdminDepartment extends SuperDepartment{
	private String deptName="Admin Department",todaysWork="Complete your documents submission",
			deadline="Complete by EOD";
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
	public String isTodayAHoliday(SuperDepartment sd)
	{
		return sd.isTodayAHoliday();
	}

}
