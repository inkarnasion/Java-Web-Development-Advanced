package softuni.exodiaapp.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.exodiaapp.web.domain.entities.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, String> {
}
