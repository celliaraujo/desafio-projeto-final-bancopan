package dio.desafio.agenda.model;

import dio.desafio.agenda.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {


    List<Contato> findByNome(String nome);

}
