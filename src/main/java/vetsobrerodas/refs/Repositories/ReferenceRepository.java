package vetsobrerodas.refs.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vetsobrerodas.refs.Entities.Reference;

public interface ReferenceRepository extends JpaRepository<Reference, Long> {
}