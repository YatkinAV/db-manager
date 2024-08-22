package hum.imm_hum.dbmanager.controller;

import hum.imm_hum.dbmanager.cervice.MessagesService;
import hum.imm_hum.dbmanager.domain.Message;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/test")
@RequiredArgsConstructor
public class InputOutputController {

    @NonNull private MessagesService messagesService;

    @GetMapping(path = "/message")
    public List<Message> getMessagesByIds(@RequestBody List<Long> ids) {
        log.debug("getMessagesByIds() - start. Ids = {}", ids);
        return messagesService.findAllByIds(ids);
    }

    @PutMapping(path = "/message")
    public void saveMessages(@RequestBody List<Message> messages) {
        log.debug("saveMessages() - start. Messages = {}", messages);
        messagesService.saveAll(messages);
        log.debug("saveMessages() - end.");
    }

}
