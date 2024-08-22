package tcc.fundatec.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tcc.fundatec.org.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Métodos adicionais de consulta podem ser definidos aqui, se necessário
}
