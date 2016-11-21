package com.websystique.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WEB_EXCELLENT_TRAINEE")
public class Web_excellent_trainee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int excellentID;
	
	@Column(name = "EXCELLENTTRUENAME")
	private String excellentTrueName;
	
	@Column(name = "EXCELLENTCOURSENAME")
	private String excellentCourseName;
	
	@Column(name = "EXCELLENTINTRODUCTIONTEXT")
	private String excellentIntroductionText;
	
	@Column(name = "EXCELLENTINTRODUCTIONIMAGE")
	private String excellentIntroductionImage;
	
	public int getExcellentID() {
		return excellentID;
	}
	public void setExcellentID(int excellentID) {
		this.excellentID = excellentID;
	}
	public String getExcellentTrueName() {
		return excellentTrueName;
	}
	public void setExcellentTrueName(String excellentTrueName) {
		this.excellentTrueName = excellentTrueName;
	}
	public String getExcellentCourseName() {
		return excellentCourseName;
	}
	public void setExcellentCourseName(String excellentCourseName) {
		this.excellentCourseName = excellentCourseName;
	}
	public String getExcellentIntroductionText() {
		return excellentIntroductionText;
	}
	public void setExcellentIntroductionText(String excellentIntroductionText) {
		this.excellentIntroductionText = excellentIntroductionText;
	}
	public String getExcellentIntroductionImage() {
		return excellentIntroductionImage;
	}
	public void setExcellentIntroductionImage(String excellentIntroductionImage) {
		this.excellentIntroductionImage = excellentIntroductionImage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + excellentID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Web_excellent_trainee other = (Web_excellent_trainee) obj;
		if (excellentID != other.excellentID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Web_excellent_trainee [excellentID=" + excellentID + ", excellentTrueName=" + excellentTrueName
				+ ", excellentCourseName=" + excellentCourseName + ", excellentIntroductionText="
				+ excellentIntroductionText + ", excellentIntroductionImage=" + excellentIntroductionImage + "]";
	}

}
