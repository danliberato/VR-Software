/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vrsoftware.model.enums;

/**
 *
 * @author Daan
 */
public enum DiaSemanaEnum {
    MONDAY("Segunda-feira"), TUESDAY("Terça-feira"), WEDNESDAY("Quarta-feira"), 
    THURSDAY("Quinta-feira"), FRIDAY("Sexta-feira");
    
    private String description;

    DiaSemanaEnum (String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
    
}
