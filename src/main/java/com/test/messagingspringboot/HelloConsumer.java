package com.test.messagingspringboot;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HelloConsumer {
    @KafkaListener(topics= "hello-topic", groupId= "group-1")// recebimento automático, quais tópicos que esse método escuta e o grupid desse consumidor para identificar um grupo de consumidores
    public void receiveMessage(String message){
        // Process the received message
        System.out.println("Consumer Message: " + message);
    }
}
