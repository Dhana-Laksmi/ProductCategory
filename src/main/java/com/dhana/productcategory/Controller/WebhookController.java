package com.dhana.productcategory.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WebhookController {

    @PostMapping("/webhook")
    public ResponseEntity<String> handleWebhook( Map<String,Object> payload){
        System.out.println("Webhook received: " + payload);
        return ResponseEntity.ok("Webhook Received and processed");
    }
}
