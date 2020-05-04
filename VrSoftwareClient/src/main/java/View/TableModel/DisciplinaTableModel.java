/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.TableModel;

import br.com.vrsoftware.model.Disciplina;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daan
 */
public class DisciplinaTableModel extends AbstractTableModel{
    
    private List<Disciplina> rows;
    private final String[] columns;

    public DisciplinaTableModel() {
        this.columns = new String[]{"Código", "Descrição", "Ementa", "Limite de  Vagas", "Professor", "Dia Semana", "Carga Horária"};
        this.rows = new ArrayList<Disciplina>();
    }
    
    @Override
    public int getRowCount() {
        return this.rows.size();
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Disciplina getValueAt(int rowIndex, int columnIndex) {
        return rows.get(rowIndex);
    }
    
    @Override
    public String getColumnName(int idx) {
        return this.columns[idx];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
    
}
