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
public enum PeriodoEnum {
    MATUTINO("Matutino"), VESPERTINO("Vespertino"), NOTURNO("Noturno"), INTEGRAL("Integral");
    
    private String description;

    PeriodoEnum(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
    
}
