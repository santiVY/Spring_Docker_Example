package co.com.jsierra.clientes;

import lombok.*;

@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private String document;
    private String name;
}
