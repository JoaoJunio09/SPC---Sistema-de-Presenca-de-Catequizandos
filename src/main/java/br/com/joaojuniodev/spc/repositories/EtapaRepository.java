package br.com.joaojuniodev.spc.repositories;

import br.com.joaojuniodev.spc.models.Etapa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtapaRepository extends JpaRepository<Etapa, Long> {
}
