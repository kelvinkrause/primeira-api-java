package com.example.demo.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "product")
@EqualsAndHashCode(of = "id")
// Getters e Setter são criador em tempo de execução pela dependencia Lombok, dispensando criar no formato padrão
@Getter
@Setter
@AllArgsConstructor //Construtor que recebe e seta todos os parâmetos
@NoArgsConstructor //Contrutor que não recebe nenhuma param e não seta nada.
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price_in_cents;

    public Product(RequestProduct resquestProduct){
        this.name = resquestProduct.name();
        this.price_in_cents = resquestProduct.price_in_cents();
    }

}
