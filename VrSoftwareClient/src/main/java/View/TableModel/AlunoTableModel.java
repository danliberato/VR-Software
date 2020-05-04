/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.TableModel;

import br.com.vrsoftware.model.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daan
 */
public class AlunoTableModel extends AbstractTableModel{
    
    private List<Aluno> rows;
    private final String[] columns;

    public AlunoTableModel() {
        this.columns = new String[]{"Código", "Matrícula", "Nome", "RG", "CPF"};
        this.rows = new ArrayList<Aluno>();
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
    public String getColumnName(int idx) {
        return this.columns[idx];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
    
    @Override
    public Aluno getValueAt(int rowIndex, int columnIndex) {
        return rows.get(rowIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    
    
}
