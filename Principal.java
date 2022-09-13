import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
     
        ArrayList <Aluno> alunos = new ArrayList<Aluno>();

        Aluno a1 = new Aluno("Gabriel Mesquita", 202105032);
        
        Disciplina a1_d1 = new Disciplina("POO", 2.0, 10.0, 3.0);
        Disciplina a1_d2 = new Disciplina("AED2", 1.0, 9.0, 3.0);
        Disciplina a1_d3 = new Disciplina("Calculo 2", 1.0, 8.0, 2.0);

        a1.setDisciplina(a1_d1);
        a1.setDisciplina(a1_d2);
        a1.setDisciplina(a1_d3);

        alunos.add(a1);

        Aluno a2 = new Aluno("Jonathan", 46092);
        
        Disciplina a2_d1 = new Disciplina("POO", 2.0, 8.0, 3.0);
        Disciplina a2_d2 = new Disciplina("Engenharia de Software", 1.0, 3.9, 4.0);
        Disciplina a2_d3 = new Disciplina("Calculo 2", 1.0, 6.0, 2.0);

        a2.setDisciplina(a2_d1);
        a2.setDisciplina(a2_d2);
        a2.setDisciplina(a2_d3);
        
        alunos.add(a2);

        Aluno a3 = new Aluno("Thales", 1234567890);
        
        Disciplina a3_d1 = new Disciplina("POO", 2.0, 5.0, 3.0);
        Disciplina a3_d2 = new Disciplina("AED1", 1.0, 6.0, 3.0);
        Disciplina a3_d3 = new Disciplina("Calculo 1", 1.0, 3.0, 2.0);

        a3.setDisciplina(a3_d1);
        a3.setDisciplina(a3_d2);
        a3.setDisciplina(a3_d3);
        
        alunos.add(a3);

        for (int i = 0; i < alunos.size(); i++) {
			
            System.out.println(
                "Nome: " + alunos.get(i).getNome() + "\n" +
                "Média: " + alunos.get(i).calculaMedia() + "\n" +
                "Aprovação: " + alunos.get(i).aprovado() + "\n"
            );
		}
    }
}
