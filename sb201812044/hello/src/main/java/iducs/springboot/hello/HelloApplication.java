package iducs.springboot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {
    @GetMapping("/comso")
    public String comso(){
        return "<h1>Hello Comso Students!</h1>";
    }
    @GetMapping("/comso")
    public String home(){
        return "<h1>Hello Home Students!</h1>";
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

}
