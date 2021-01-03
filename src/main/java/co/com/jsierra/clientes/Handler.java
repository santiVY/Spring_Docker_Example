package co.com.jsierra.clientes;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Configuration
public class Handler {

    public Mono<ServerResponse> getClient(ServerRequest serverRequest){
        Client client = Client.builder().document("00000000").name("demo").build();
        return  ServerResponse
                .ok()
                .body(Mono.just(client), Client.class);
    }
}
