package hum.imm_hum.dbmanager.cervice;

import hum.imm_hum.dbmanager.domain.Json;
import hum.imm_hum.dbmanager.repository.JsonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JsonService {

    private final JsonRepository repository;

    public void save(Json json) {
        repository.save(json);
    }
}
