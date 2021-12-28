package vetsobrerodas.refs.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vetsobrerodas.refs.Entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}