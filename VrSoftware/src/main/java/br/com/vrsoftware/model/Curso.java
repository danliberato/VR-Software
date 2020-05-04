/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vrsoftware.model;

import br.com.vrsoftware.model.enums.PeriodoEnum;
import java.util.List;

/**
 *
 * @author Daan
 */
public class Curso {
    
    private long id;
    private String descricao;
    private int duracao; //em semestres, ex: 8 (semestres)
    private int cargaHoraria; //em horas, ex? 200 (h)
    private PeriodoEnum periodo;
    private List<Aluno> alunoList;

    public Curso(long id, String descricao, int duracao, int cargaHoraria, PeriodoEnum periodo, List<Aluno> alunoList) {
        this.id = id;
        this.descricao = descricao;
        this.duracao = duracao;
        this.cargaHoraria = cargaHoraria;
        this.periodo = periodo;
        this.alunoList = alunoList;
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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public PeriodoEnum getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoEnum periodo) {
        this.periodo = periodo;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }
}
