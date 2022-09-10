package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "collage")
public class collage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="clg_id")
	private int collageId;
	
	@Column(name = "clg_name")
	private String collageName;
	
	@Column(name ="clg_addr")
	private String collageAddress;
	
	@OneToMany(mappedBy = "clg", cascade = CascadeType.ALL)
	private Set<student> stu = new HashSet<>();

	
	
	
	
	public collage() {
		super();
	}





	public collage(int collageId, String collageName, String collageAddress, Set<student> stu) {
		super();
		this.collageId = collageId;
		this.collageName = collageName;
		this.collageAddress = collageAddress;
		this.stu = stu;
	}





	public int getCollageId() {
		return collageId;
	}





	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}





	public String getCollageName() {
		return collageName;
	}





	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}





	public String getCollageAddress() {
		return collageAddress;
	}





	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}





	public Set<student> getStu() {
		return stu;
	}





	public void setStu(Set<student> stu) {
		this.stu = stu;
	}





	@Override
	public String toString() {
		return "collage [collageId=" + collageId + ", collageName=" + collageName + ", collageAddress=" + collageAddress
				+ ", stu=" + stu + "]";
	}
	
	
	
	
	
}
