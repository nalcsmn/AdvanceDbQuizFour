package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="details")
public class Details implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5302830493777198637L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userId")
	private int userId;

	@Column(name="lastName")
	private String lastName;

	@Column(name="firstName")
	private String firstName;

	@Column(name="middleName")
	private String middleName;

	@Column(name="edad")
	private int edad;

	public Details() {}

	public Details(int userId, String lastName, String firstName, 
			String middleName, int course) {
		this.userId = userId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.edad = edad;
	}




	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

}
