package cz.lender.poc.messaging.artemisjmsdemo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueListener {

    @JmsListener(destination = "mojekju")
    public void processMessage(String content) {
        System.out.println("Message arrived: " + content);
    }
}
