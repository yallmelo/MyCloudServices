package br.com.ymsystem.sales.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Sale {

    @Id
    @GeneratedValue
    private Long id;


    private Double value;


    private String description;

}
