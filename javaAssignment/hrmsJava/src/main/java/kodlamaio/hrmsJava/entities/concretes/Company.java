package kodlamaio.hrmsJava.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="companies")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="company_id")
@EqualsAndHashCode(callSuper = false)
public class Company extends User{
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="phone")
	private String phoneNumber;
	
	@Column(name="web_site")
	private String webAddress;
	
	@Column(name="is_active")
	private boolean isActive;
	@JsonIgnore
	@OneToMany(mappedBy = "company")
	private List<JobAdvertisement> jobAdvertisements; 

}
