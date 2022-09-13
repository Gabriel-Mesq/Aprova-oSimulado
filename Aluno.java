import java.util.ArrayList;

public class Aluno extends Pessoa{
    
    private int matricula;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    Aluno (String nome, int matricula){
        
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplina (Disciplina d){
        disciplinas.add(d);
    }

    
    public double calculaMedia (){
        
        double nota = 0, peso = 0;

        for (int i = 0; i < disciplinas.size(); i++) {
            
            nota += disciplinas.get(i).getNota()*disciplinas.get(i).getPeso();
            peso += disciplinas.get(i).getPeso();
        }    

        return (nota/peso);
    }	

    public boolean aprovado (){
        
        if (calculaMedia() >= 6) {

            for (int i = 0; i < disciplinas.size(); i++) {
            
                if (disciplinas.get(i).getNota() < disciplinas.get(i).getLimite()){
                    return false;
                }
            }    
        
            return true;
        }

        return false;
    } 
}
