import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
	@Autowired
	private DaoRepo dao;
		public void AddEmp(Employee employee) {
			dao.save(employee);
		}
		public Optional<Employee> getEmployeeByID(long id) {
			return dao.findById(id);
		}
		public void deleteEmpById(long id) {
			dao.deleteById(id);
		}
		public List<Employee> getAllEmployees(){
			List<Employee> employees= new ArrayList<>();
			dao.findAll().forEach(employees::add);
			return employees;
		}
		public void updateEmpById(long Id, Employee emp) {
			dao.save(emp);
		}
		public String checkAll() {
			return "service is ok";
		}
}
