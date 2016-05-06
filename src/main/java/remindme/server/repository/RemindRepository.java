package remindme.server.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import remindme.server.entity.Remind;

public interface RemindRepository extends JpaRepository<Remind, Long>{
}
