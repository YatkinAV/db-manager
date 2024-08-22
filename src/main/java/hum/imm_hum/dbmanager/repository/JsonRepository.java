package hum.imm_hum.dbmanager.repository;

import hum.imm_hum.dbmanager.domain.Json;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JsonRepository extends JpaRepository<Json, Long> {
}
