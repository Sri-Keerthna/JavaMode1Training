package com.hcl.project;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	static List<Student> lststudent=null;
	static {
		lststudent=new ArrayList<Student>();
	}
	
	public String addStudentDAO(Student s) {
		lststudent.add(s);
		return "student created successfully";
	}
	
	public Student searchStudentDAO(int sno) {
		Student objStudent = null;
		for(Student s:lststudent) {
			if(s.getSno()==sno) {
				objStudent=s;
			}
		}
		return objStudent;
	}
	public List<Student> showStudentDAO() {
		return lststudent;
	}
	
	public String updateStudentDAO(Student obj) {
		Student s=searchStudentDAO(obj.getSno());
		if(s!=null){
			for (Student s1 : lststudent) {
				if(s1.getSno()==obj.getSno()){
					s1.setName(obj.getCity());
					s1.setCity(obj.getCity());
					s1.setCgp(obj.getCgp());
				}
			}
			return "records update";
		} else {
			return "student no not found";
		}
	}
	
	public String deleteStudentDAO(int sno){
		Student student=searchStudentDAO(sno);
		if(student!=null) {
			lststudent.remove(student);
			return "student remove";
		} else {
			return "student no not found";
		}
	}
}			
						
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
