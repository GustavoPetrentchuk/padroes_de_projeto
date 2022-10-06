package observer;

public class Funcionario implements Observer {
      private String cargo;


     public Funcionario(String cargo) {
          super();
          this.cargo = cargo;
     }

     @Override
     public void notify(Observable observable, String message) {
          System.out.println("Começa a trabalhar no: " + message);
     }

     public String getCargo() {
          return cargo;
     }

     public void setCargo(String cargo) {
          this.cargo = cargo;
     }
}
