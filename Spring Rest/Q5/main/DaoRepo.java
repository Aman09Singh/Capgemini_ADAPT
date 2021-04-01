
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoRepo extends CrudRepository<Employee, Long>{
	
}
