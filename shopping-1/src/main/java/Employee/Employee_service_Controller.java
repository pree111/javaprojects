package Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class Employee_service_Controller
{
	@Autowired
	private Employee_Service service;
	@GetMapping("/Employeeservice")
	public java.util.List<Emp> list()
	{
		return service.listAll();
	}
	@GetMapping("/Employeeservice/{e_id}")
	public ResponseEntity<Emp> get(@PathVariable Integer e_id)
	{
		try
		{
		 Emp e=service.get(e_id);
			return new ResponseEntity<Emp>(e,HttpStatus.OK);
		}
		catch (NoResultException e)
		{
			return new ResponseEntity<Emp>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/Employeeservice")
	public void add(@RequestBody Emp e)
	{
		service.save(e);
	}
	@PutMapping("/Employeeservice/{e_id}")
	public ResponseEntity<?> update(@RequestBody Emp e, @PathVariable Integer e_id)
	{
		Emp existe=service.get(e_id);
		service.save(existe);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/Employeeservice/{e_id}")
	public void delete(@PathVariable Integer e_id)
	{
		service.delete(e_id);
	}
}
