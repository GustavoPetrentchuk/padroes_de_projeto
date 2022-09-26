package nullObject;

public class AlunoReal extends Aluno{

     public AlunoReal(String nome) {
          this.nome = nome;
     }

     @Override
     public String getNome() {
          return nome;
     }
}
