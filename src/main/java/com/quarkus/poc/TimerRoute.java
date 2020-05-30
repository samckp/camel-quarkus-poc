package com.quarkus.poc;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TimerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("{{route}}")
                .log("this is Quarkus Route !!");
    }
}
