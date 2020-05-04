
import View.MainView;
import View.TableModel.*;
import java.util.ArrayList;
import java.util.List;
import br.com.vrsoftware.model.*;
import br.com.vrsoftware.model.enums.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author Daan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Curso> cursoList = new ArrayList<>();
        List<Disciplina> disciplinaList = new ArrayList<>();
        List<Professor> professorList = new ArrayList<>();
        List<Aluno> alunoList = new ArrayList<>();
        
        
        alunoList.add(new Aluno(1,"552127","Cleiton","123123123","321321321"));
        alunoList.add(new Aluno(2,"888877","Ana","999888777","111222333"));
        professorList.add(new Professor(1, "Adamastor", "123", "999", TituloProfessorEnum.DOUTOR));
        professorList.add(new Professor(2, "Osvair", "321", "888", TituloProfessorEnum.MESTRE));
        
        CursoTableModel cursoTableModel = new CursoTableModel();
        DisciplinaTableModel disciplinaTableModel = new DisciplinaTableModel();
        ProfessorTableModel professorTableModel = new ProfessorTableModel();
        AlunoTableModel alunoTableModel = new AlunoTableModel();
        
        MainView mainView = new MainView();
        
        mainView.getCursoTable().setModel(cursoTableModel);
        mainView.getDisciplinaTable().setModel(disciplinaTableModel);
        mainView.getAlunoTable().setModel(alunoTableModel);
        mainView.getProfessorTable().setModel(professorTableModel);
        mainView.setVisible(true);
        
    }
    
}
