package org.taskmngr.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.taskmngr.service.KafkaSenderService;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaSenderService kafka;

    @GetMapping("/post/{massage}")
    public void send(@PathVariable String massage) {
        kafka.sendToTopic(massage);
    }
}
