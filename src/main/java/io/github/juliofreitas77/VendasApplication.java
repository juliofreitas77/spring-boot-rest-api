package io.github.juliofreitas77;

import io.github.juliofreitas77.domain.entity.Cliente;
import io.github.juliofreitas77.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes) {
        return args -> {
            clientes.save((new Cliente("Julio Cesar")));
            clientes.save(new Cliente("Juan"));

            List<Cliente> todosClientes = clientes.findAll();
            todosClientes.forEach(System.out::println);

            todosClientes.forEach(cliente -> {
                cliente.setNome(cliente.getNome() + " atualizado.");
                clientes.save(cliente);
            });

            System.out.println("Buscando por nome");
            clientes.findByNomeLike("Jul%").forEach(System.out::println);

            System.out.println("deletando os clientes!");
            clientes.findAll().forEach(cliente -> {
                clientes.delete(cliente);
            });
            
            todosClientes = clientes.findAll();
            if (todosClientes.isEmpty()) {
                System.out.println("Nenhum cliente encontrado!");
            }else{
                todosClientes.forEach(System.out::println);
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
