package com.codev.registrationproxy.consumer;


import com.codev.registrationproxy.model.RegistrationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;

@Service
@Slf4j
/*This class is just for test purpose */
public class RegistrationRequestConsumer {

    @KafkaListener(topics = "${kafka.topic.name}")
    public void consumeMessage(@Payload final RegistrationRequest request,
                               @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) final String key,
                               @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
                               final Acknowledgment acknowledgment) {

            log.info("SUCCESS: Received Consumer Message for key:{} with payload:{} from topic:{}", key ,request.toString(), topic);
        acknowledgment.acknowledge();
    }
}
