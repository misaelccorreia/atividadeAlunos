package com.example.demo.models;

import com.example.demo.enums.AlunoEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tp_aluno")
public class AlunoModel {

    @Id
    private Long id;
    private String nome;
    private String email;
    private Integer idade;
    private AlunoEnum alunoEnum;


    public AlunoEnum getAlunoEnum() {
        return alunoEnum;
    }

    public void setAlunoEnum(AlunoEnum alunoEnum) {
        this.alunoEnum = alunoEnum;
    }

    public AlunoModel(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
