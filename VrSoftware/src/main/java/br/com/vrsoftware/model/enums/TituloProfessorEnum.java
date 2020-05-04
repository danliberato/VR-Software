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
public enum TituloProfessorEnum {
    MESTRE("Mestre"), DOUTOR("Doutor");
    
    private String description;

    TituloProfessorEnum(String desc) {
        this.description = desc;
    }

    @Override
    public String toString() {
        return description;
    }
    
}
