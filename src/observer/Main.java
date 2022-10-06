package observer;

public class Main {
     public static void main(String[] args) {
          Funcionario f1 = new Funcionario("Garçom");
          Funcionario f2 = new Funcionario("Ajudante");
          Chefe c1 = new Chefe();
          c1.addObserver(f1);
          c1.addObserver(f2);
          c1.notify("Iniciar trabalho");
          c1.removeObserver(f2);
     }
}
