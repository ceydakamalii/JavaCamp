package kodlamaio.hrmsJava.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="verifications")
@AllArgsConstructor
@NoArgsConstructor
public class Verification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="verification_id")
	private int verificationId;
	
	@Column(name="email_activation_code")
	private String emailActivationCode;
	
	@Column(name="email_confirmed_date")
	private Date emailConfirmedDate;
	
	@Column(name="email_expiration_date")
	private Date emailExpirationDate;
	
	@Column(name="email_is_date")
	private boolean emailIsConfirmed;

}
