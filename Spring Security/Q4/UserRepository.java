import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //Jpa repo for transactions
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username);
	//optional is used in order to return a value only if it is present there

}