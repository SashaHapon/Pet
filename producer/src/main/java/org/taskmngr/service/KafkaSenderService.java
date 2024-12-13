package org.taskmngr.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.taskmngr.dto.MassageDto;

@Service
@RequiredArgsConstructor
public class KafkaSenderService {

    @Value("${producer.kafka.topic.in}")
    private String topic;

    private final KafkaTemplate<Object, Object> template;

    public void sendToTopic(String letter) {
        MassageDto massageDto = new MassageDto();
        massageDto.setMassage(letter);
        template.send(topic, massageDto);
    }
}
