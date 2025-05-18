package com.sdev.pokehome;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.ClientCodecConfigurer;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class BeenFactory {
    @Bean
    public WebClient webClient() {
        ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(configurer -> {
                    ClientCodecConfigurer.ClientDefaultCodecs codecs = configurer.defaultCodecs();
                    codecs.maxInMemorySize(1024 * 1024 * 10); // 2 MB
                })
                .build();

        return WebClient.builder()
                .exchangeStrategies(strategies)
                .build();
    }

    @Bean
    public Gson gson() {
        return new Gson();
    }
}
