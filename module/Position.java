package module;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

//import javax.xml.bind.annotation.XmlTransient;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="Position")
@XmlRootElement
@JsonRootName(value = "Position")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Position {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PID")
	private long pID;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "REPOSIBILITY")
	private String responsibility;
	
	@Column(name = "OFFICE_LOCATION")
	private String officeLocation;
	
	@Column(name = "SALARY")
	private long salary;
	
	@Column(name = "STATUS")
	private String status;
	
	@ManyToMany
	private Set<JobSeeker> seekerSet;
	
	@ManyToMany
	private Set<JobSeeker> interestSet;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<JobSeeker> getSeekerSet() {
		return seekerSet;
	}

	public void setSeekerSet(Set<JobSeeker> seekerSet) {
		this.seekerSet = seekerSet;
	}
	
	
}
