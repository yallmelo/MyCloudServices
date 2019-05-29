package br.com.ymsystem.apicustomer.Entities.Model;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity(name = "customer")
public class Customer {

    @Id
    private Long id;
    @NotNull
    private String name;
    @CPF
    private String cpf;
    @NotNull
    private Integer age;
    private String observation;
}
