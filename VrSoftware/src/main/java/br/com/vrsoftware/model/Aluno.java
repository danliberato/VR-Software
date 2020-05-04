/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vrsoftware.model;

/**
 *
 * @author Daan
 */
public class Aluno {
    
    private long id;
    private String matricula;
    private String nome;
    private String RG;
    private String CPF;

    public Aluno(long id, String matricula, String nome, String RG, String CPF) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    
}
