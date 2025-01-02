package org.taskmngr.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.taskmngr.service.KafkaSenderService;

@RestController
@RequiredArgsConstructor
public class KafkaController {
    private final KafkaSenderService kafka;

    @PreAuthorize(value = "")
    @PostMapping("/post/{massage}")
    public void send(@PathVariable String massage){
        kafka.sendToTopic(massage);
    }
}
