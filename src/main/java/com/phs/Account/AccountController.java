package com.phs.Account;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class AccountController {
    private static final Logger logger = LogManager.getLogger(AccountController.class);

    @GetMapping("/account")
    public Mono<String> getAccount(ServerHttpRequest request, ServerHttpResponse response) {
        logger.info("Account MicroService Start>>>>>>>>");
        HttpHeaders headers = request.getHeaders();
        headers.forEach((k, v) -> {
            logger.info(k + " : " + v);
        });
        logger.info("Account MicroService End>>>>>>>>");

        return Mono.just("This is Account MicroService!!!!!");
    }
}
