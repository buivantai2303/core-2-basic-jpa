package JPA.JPA_002.Repository;
import JPA.JPA_002.Models.PhanCong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhanCongRepo extends JpaRepository<PhanCong, Integer> {

}
