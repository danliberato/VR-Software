/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vrsoftware.model;

import br.com.vrsoftware.model.enums.DiaSemanaEnum;

/**
 *
 * @author Daan
 */
public class Disciplina {
    
    private long id;
    private String descricao;
    private String ementa;
    private int vagas;
    private Professor professor;
    private DiaSemanaEnum diaSemana;
    private int cargaHoraria;

    public Disciplina(long id, String descricao, String ementa, int vagas, Professor professor, DiaSemanaEnum diaSemana, int cargaHoraria) {
        this.id = id;
        this.descricao = descricao;
        this.ementa = ementa;
        this.vagas = vagas;
        this.professor = professor;
        this.diaSemana = diaSemana;
        this.cargaHoraria = cargaHoraria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public DiaSemanaEnum getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemanaEnum diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
    
}
