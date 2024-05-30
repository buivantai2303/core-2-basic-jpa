package videoExample.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import videoExample.demo.models.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer> {

}
