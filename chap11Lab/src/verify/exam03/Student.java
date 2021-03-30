package verify.exam03;

import sec03.exam02_hashcode.Key;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	// 작성 위치
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.studentNum)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	

}
