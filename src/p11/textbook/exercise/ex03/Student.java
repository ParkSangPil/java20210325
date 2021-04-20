package p11.textbook.exercise.ex03;

import p11.textbook.s110302.Key;

public class Student {
	private String studentNum;

	public Student(String studentNum) {  // source 에서 generate 뭐시기 클릭
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	// 시작

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student compareKey = (Student) obj;
			if (this.studentNum == compareKey.studentNum) {
				return true;
			}
		}
		return false;
	}

}
