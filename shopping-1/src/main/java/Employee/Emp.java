package Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Emp 
{
	 private Integer e_id;
	  private String e_name;
	  private String e_email;
	  private String e_addr;
     private int e_phno;
     
	public Emp()
	{
		super();
	}

	public Emp(Integer e_id, String e_name, String e_email, String e_addr, int e_phno) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_email = e_email;
		this.e_addr = e_addr;
		this.e_phno = e_phno;
	}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getE_id() {
		return e_id;
	}

	public void setE_id(Integer e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getE_email() {
		return e_email;
	}

	public void setE_email(String e_email) {
		this.e_email = e_email;
	}

	public String getE_addr() {
		return e_addr;
	}

	public void setE_addr(String e_addr) {
		this.e_addr = e_addr;
	}

	public int getE_phno() {
		return e_phno;
	}

	public void setE_phno(int e_phno) {
		this.e_phno = e_phno;
	}
	@Override
	public String toString()
	{
		return "Emp[employeeid :"+e_id+" employeename :"+e_name+" employeeemail :"+e_email+" employeephone :"+e_phno+" employee_address:"+e_addr+"]";
	}
}
