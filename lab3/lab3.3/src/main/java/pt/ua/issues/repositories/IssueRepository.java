package pt.ua.issues.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pt.ua.issues.entities.IssueReport;

public interface IssueRepository extends JpaRepository<IssueReport, Long>{

    @Query(value = "SELECT i FROM IssueReport i WHERE markedAsPrivate = false")
    List<IssueReport> findAllButPrivate();

    List<IssueReport> findAllByEmail(String email);
}
