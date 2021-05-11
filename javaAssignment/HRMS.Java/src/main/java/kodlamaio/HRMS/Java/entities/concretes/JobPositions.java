package kodlamaio.HRMS.Java.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_positions")
public class JobPositions {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	
	@Column(name="positionName")
	private String positionName;
	
	
	public JobPositions() {
		super();
	}
	public JobPositions(int id, String positionName) {
		super();
		this.id = id;
		this.positionName = positionName;
	}

	
	
	
	

}
