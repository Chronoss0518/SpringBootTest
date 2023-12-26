package springboot.server_test.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerTestApplicationController {

    @RequestMapping("/")  // ルートへこのメソッドをマップする
    public String test() {
        return "Hello World";
    }
}