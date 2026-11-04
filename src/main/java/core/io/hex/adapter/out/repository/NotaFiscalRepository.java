package core.io.hex.adapter.out.repository;

import core.io.hex.adapter.out.repository.entity.NotaFiscalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaFiscalRepository extends JpaRepository<NotaFiscalEntity, Long> {
}
