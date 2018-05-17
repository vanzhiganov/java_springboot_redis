package ru.a3.demo.rest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.a3.demo.models.Sessions;


@RestController
public class SessionsController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public Sessions greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        RedisConnectionFactory();
        //Jedis jedis = new Jedis("localhost");
        return new Sessions(
            counter.incrementAndGet(),
            String.format(template, name)
        );
    }
}
