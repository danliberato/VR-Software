/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vrsoftware.model;
import br.com.vrsoftware.model.enums.TituloProfessorEnum;

/**
 *
 * @author Daan
 */
public class Professor {
    
    private long id;
    private String nome;
    private String RG;
    private String CPF;
    private TituloProfessorEnum titulo;

    public Professor(long id, String nome, String RG, String CPF, TituloProfessorEnum titulo) {
        this.id = id;
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.titulo = titulo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public TituloProfessorEnum getTitulo() {
        return titulo;
    }

    public void setTitulo(TituloProfessorEnum titulo) {
        this.titulo = titulo;
    }

    
    
}
