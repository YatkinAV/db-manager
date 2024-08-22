package hum.imm_hum.dbmanager.repository;

import hum.imm_hum.dbmanager.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessagesRepository extends JpaRepository<Message, Long> {

    List<Message> findAllByIds(List<Long> ids);
}
