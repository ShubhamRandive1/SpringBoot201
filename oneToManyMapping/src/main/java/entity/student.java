package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stu_id")
	private int studentRoll;
	
	@Column(name = "stu_name")
	private String studentName;
	
	@Column(name ="stu_num")
	private int mobileNumber;
	
	@Column(name = "stu_email")
	private String studentEmail;
	
	@ManyToOne
	private collage clg;

	
	
	
	
	public student() {
		super();
	}





	public student(int studentRoll, String studentName, int mobileNumber, String studentEmail, collage clg) {
		super();
		this.studentRoll = studentRoll;
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
		this.studentEmail = studentEmail;
		this.clg = clg;
	}





	public int getStudentRoll() {
		return studentRoll;
	}





	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}





	public String getStudentName() {
		return studentName;
	}





	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}





	public int getMobileNumber() {
		return mobileNumber;
	}





	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}





	public String getStudentEmail() {
		return studentEmail;
	}





	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}





	public collage getClg() {
		return clg;
	}





	public void setClg(collage clg) {
		this.clg = clg;
	}





	@Override
	public String toString() {
		return "student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", mobileNumber=" + mobileNumber
				+ ", studentEmail=" + studentEmail + ", clg=" + clg + "]";
	}
	
	
	

}
