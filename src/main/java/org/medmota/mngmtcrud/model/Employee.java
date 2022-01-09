package org.medmota.mngmtcrud.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ELK_EMPLOYEES")
public class Employee implements Serializable {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private Long id;
	
	@Column(name = "Emp_No", length = 30, nullable = false)
	private String empNo;
	
	@Column(name = "Full_Name", length = 128, nullable = false)
	private String fullName;
	
	@Temporal(TemporalType.DATE)
    @Column(name = "Hire_Date", nullable = false)
	private Date hireDate;

	public Employee() {
		super();
	}

	public Employee(String empNo, String fullName, Date hireDate) {
		super();
		this.empNo = empNo;
		this.fullName = fullName;
		this.hireDate = hireDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", fullName=" + fullName + "]";
	}

}
