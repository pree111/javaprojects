package Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
	@Transactional
	public class Employee_Service
	{
		@Autowired
	private Employee_service_Repo repo;
		public List<Emp> listAll()
		{
			return repo.findAll();
		}
		public void save(Emp e)
		{
			repo.save(e);
		}
		public Emp get(Integer e_id) 
		{
			return repo.findById(e_id).get();
		}
		public void delete(Integer e_id)
		{
			repo.deleteById(e_id);
		}
		
}
	

