package org.taskmngr.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.taskmngr.dto.MassageDto;

@Slf4j
@Service
public class KafkaService {

    @KafkaListener(id = "${consumer.kafka.id.topic}", topics = "${consumer.kafka.topic.in}")
    public void getMessageFromKafka(MassageDto massageDto){
        log.info("get message: ", massageDto);
    }
}
