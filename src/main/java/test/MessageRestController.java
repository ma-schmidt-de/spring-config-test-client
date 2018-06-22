package test;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.cloud.context.config.annotation.*;

@RefreshScope
@RestController
class MessageRestController {

    @Value("${message:Hello default}")
    private String message;

    @Value("${environment:default env}")
    private String environment;

    @RequestMapping("/message")
    String getMessage() {
        return this.message + " " + this.environment;
    }
}
