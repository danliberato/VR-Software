/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.TableModel;

import br.com.vrsoftware.model.Professor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daan
 */
public class ProfessorTableModel extends AbstractTableModel{
    
    private List<Professor> rows;
    private final String[] columns;

    public ProfessorTableModel() {
        this.columns = new String[]{"Código", "RG", "CPF", "Título"};
        this.rows = new ArrayList<Professor>();
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
    public Professor getValueAt(int rowIndex, int columnIndex) {
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
