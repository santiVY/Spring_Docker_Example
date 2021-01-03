package co.com.jsierra.clientes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class Route {

    @Bean
    public RouterFunction<ServerResponse> routeClient(Handler handler){
        return route(
            GET("/v1/clients").and(accept(MediaType.APPLICATION_JSON)), handler::getClient
        );
    }

}
