package hum.imm_hum.dbmanager.controller;

import hum.imm_hum.dbmanager.cervice.JsonService;
import hum.imm_hum.dbmanager.domain.Json;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/json")
@RestController
public class JsonContentController {

    private final JsonService jsonService;

    @PutMapping("/save")
    public void save(@RequestBody Json jsonContent) {
        jsonService.save(jsonContent);
    }

}
