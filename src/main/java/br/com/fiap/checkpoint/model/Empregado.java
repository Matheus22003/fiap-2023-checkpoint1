package br.com.fiap.checkpoint.model;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "empregados")
@Data
public class Empregado {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long codigoEmpregado;
    private String nome;
    private String endereco;

}
