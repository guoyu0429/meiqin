package com.websystique.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WEB_TRAINEE")
public class Web_trainee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int traineeID;
	
	@Column(name = "TRAINEETRUENAME")
	private String traineeTrueName;
	
	@Column(name = "TRAINEESEX")
	private String traineeSex;
	
	@Column(name = "TRAINEEAGE")
	private int traineeAge;
	
	@Column(name = "TRAINEEPHONE")
	private String traineePhone;
	
	@Column(name = "TRAINEEADS")
	private String traineeAds;
	
	@Column(name = "TRAINEESTUDYTYPE")
	private String traineeStudytype;
	
	@Column(name = "TRAINEECERTIFICATE")
	private String traineeCertificate;
	
	@Column(name = "TRAINEEEDUCATION")
	private String traineeEducation;
	
	@Column(name = "TRAINEEIDNUMBER")
	private String traineeIDNumber;
	
	public int getTraineeID() {
		return traineeID;
	}
	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}
	public String getTraineeTrueName() {
		return traineeTrueName;
	}
	public void setTraineeTrueName(String traineeTrueName) {
		this.traineeTrueName = traineeTrueName;
	}
	public String getTraineeSex() {
		return traineeSex;
	}
	public void setTraineeSex(String traineeSex) {
		this.traineeSex = traineeSex;
	}
	public int getTraineeAge() {
		return traineeAge;
	}
	public void setTraineeAge(int traineeAge) {
		this.traineeAge = traineeAge;
	}
	public String getTraineePhone() {
		return traineePhone;
	}
	public void setTraineePhone(String traineePhone) {
		this.traineePhone = traineePhone;
	}
	public String getTraineeAds() {
		return traineeAds;
	}
	public void setTraineeAds(String traineeAds) {
		this.traineeAds = traineeAds;
	}
	public String getTraineeStudytype() {
		return traineeStudytype;
	}
	public void setTraineeStudytype(String traineeStudytype) {
		this.traineeStudytype = traineeStudytype;
	}
	public String getTraineeCertificate() {
		return traineeCertificate;
	}
	public void setTraineeCertificate(String traineeCertificate) {
		this.traineeCertificate = traineeCertificate;
	}
	public String getTraineeEducation() {
		return traineeEducation;
	}
	public void setTraineeEducation(String traineeEducation) {
		this.traineeEducation = traineeEducation;
	}
	public String getTraineeIDNumber() {
		return traineeIDNumber;
	}
	public void setTraineeIDNumber(String traineeIDNumber) {
		this.traineeIDNumber = traineeIDNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((traineeAds == null) ? 0 : traineeAds.hashCode());
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
		Web_trainee other = (Web_trainee) obj;
		if (traineeAds == null) {
			if (other.traineeAds != null)
				return false;
		} else if (!traineeAds.equals(other.traineeAds))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Web_trainee [traineeID=" + traineeID + ", traineeTrueName=" + traineeTrueName + ", traineeSex="
				+ traineeSex + ", traineeAge=" + traineeAge + ", traineePhone=" + traineePhone + ", traineeAds="
				+ traineeAds + ", traineeStudytype=" + traineeStudytype + ", traineeCertificate=" + traineeCertificate
				+ ", traineeEducation=" + traineeEducation + ", traineeIDNumber=" + traineeIDNumber + "]";
	}
}
