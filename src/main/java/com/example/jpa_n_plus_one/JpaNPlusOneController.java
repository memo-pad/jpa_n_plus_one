package com.example.jpa_n_plus_one;

import com.example.jpa_n_plus_one.repository.NeoParentRepository;
import com.example.jpa_n_plus_one.repository.ParentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class JpaNPlusOneController {

    private final ParentRepository parentRepository;
    private final NeoParentRepository neoParentRepository;

    @GetMapping("/findAll")
    void findAll() {
        log.info("findAll");
        parentRepository.findAll().forEach(v -> log.info(v.toString()));
    }

    @GetMapping("/findParentWithSingleJoin")
    void findParentWithSingleJoin() {
        log.info("findParentWithSingleJoin");
        parentRepository.findParentWithSingleJoin().forEach(v -> log.info(v.toString()));
    }

    @GetMapping("/findParentWithDoubleJoin")
    void findParentWithDoubleJoin() {
        log.info("findParentWithDoubleJoin");
        neoParentRepository.findParentWithDoubleJoin().forEach(v -> log.info(v.toString()));
    }
}
