package com.greatlearning.driver;

import com.greatlearning.admindepart.AdminDepartment;
import com.greatlearning.hrdepart.HrDepartment;
import com.greatlearning.techdepart.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment ad=new AdminDepartment();
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayHoliday());

		HrDepartment hd=new HrDepartment();
		System.out.println(hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayHoliday());

		TechDepartment td=new TechDepartment();
		System.out.println(td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayHoliday());

	}

}
