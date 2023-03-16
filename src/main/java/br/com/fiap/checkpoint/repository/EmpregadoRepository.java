package br.com.fiap.checkpoint.repository;

import br.com.fiap.checkpoint.model.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {
}
