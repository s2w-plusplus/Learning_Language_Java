package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student 
{
	private String prn;
	private String name;
	private String email;
	private  String passwd;
	private Course elective;
	private double gpa;
	private Date dob;
	
	public static SimpleDateFormat sdf;
	static 
		{
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		}
	
	public Student(String prn, String name, String email, String passwd, Course elective, double gpa, Date dob)
		{
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.passwd = passwd;
		this.elective = elective;
		this.gpa = gpa;
		this.dob = dob;
		}
	public Student(String prn) 
		{
		this(prn, null, null, null, null,0.0,null);
		}
	
	public void setGpa(double gpa) 
		{
		this.gpa = gpa;
		}
	

	@Override
	public String toString() 
		{
		return "Student [PRN=" + prn + ", Name=" + name + ", Email=" + email + ", Password=" + passwd + ", Elective="
				+ elective + ", GPA=" + gpa + ", DateOfBirth=" + sdf.format(dob) + "]";
		}
	
	@Override
	public boolean equals(Object O)
		{
		if(O instanceof Student ) 
			return	(this.prn).equals( ((Student)O).prn );
		return false;	
		}
	
}
