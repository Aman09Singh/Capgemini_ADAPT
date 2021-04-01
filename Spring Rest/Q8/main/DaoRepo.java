
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface DaoRepo extends MongoRepository<Products, String> {
}
