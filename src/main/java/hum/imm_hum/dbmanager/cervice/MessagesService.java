package hum.imm_hum.dbmanager.cervice;

import hum.imm_hum.dbmanager.domain.Message;
import hum.imm_hum.dbmanager.repository.MessagesRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessagesService {

    @NonNull private MessagesRepository messagesRepository;

    public List<Message> findAllByIds(List<Long> ids) {
        return messagesRepository.findAllByIds(ids);
    }

    public void saveAll(List<Message> messages) {
        messagesRepository.saveAll(messages);
    }
}
