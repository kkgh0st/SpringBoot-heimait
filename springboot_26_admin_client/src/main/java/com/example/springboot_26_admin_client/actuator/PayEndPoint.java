package com.example.springboot_26_admin_client.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="pay", enableByDefault = true)
public class PayEndPoint {
    @ReadOperation
    public Object getPay(){
        return "hello world!";
    }
}
