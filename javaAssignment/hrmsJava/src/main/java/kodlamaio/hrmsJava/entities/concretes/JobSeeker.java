package kodlamaio.hrmsJava.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seekers")
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name="job_seeker_id")
@EqualsAndHashCode(callSuper = false)
public class JobSeeker extends User{
	@Column(name="day_of_birth")
	private String dayOfBirth;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="is_confirm")
	private boolean isConfirm;
	
	@Column(name="nationality_id")
	private String nationalityId;
}
