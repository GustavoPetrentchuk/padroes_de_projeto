package observer;

public class Funcionario implements Observer {
      private String cargo;


     public Funcionario(String cargo) {
          super();
          this.cargo = cargo;
     }

     @Override
     public void notify(Observable observable, String message) {
          System.out.println(this.cargo + " começa a trabalhar no: " + message);
     }
}
