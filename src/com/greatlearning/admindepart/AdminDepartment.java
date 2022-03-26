package com.greatlearning.admindepart;

import com.greatlearning.superdepart.SuperDepartment;

public class AdminDepartment extends SuperDepartment{


	public String departmentName() {
		return "Welcome to Admin Department";
	}
	public String getTodaysWork() {
		return "Complete your document submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}