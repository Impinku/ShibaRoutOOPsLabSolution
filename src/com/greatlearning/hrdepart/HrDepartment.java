package com.greatlearning.hrdepart;

import com.greatlearning.superdepart.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		return "Welcome to Hr Department";
	}
	public String getTodaysWork() {
		return "Fill today's worksheet and mark your attendance";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "team lunch";
	}

}
