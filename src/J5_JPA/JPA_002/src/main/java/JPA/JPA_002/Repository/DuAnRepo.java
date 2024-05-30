package JPA.JPA_002.Repository;
import JPA.JPA_002.Models.DuAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DuAnRepo extends JpaRepository<DuAn, Integer> {

}
