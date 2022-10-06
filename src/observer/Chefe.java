package observer;

import java.util.ArrayList;
import java.util.List;

public class Chefe implements Observable {
     private List<Observer> funcionarios;

     public Chefe() {
          this.funcionarios = new ArrayList<Observer>();
     }

     @Override
     public void addObserver(Observer observer) {
          this.funcionarios.add(observer);
     }

     @Override
     public void removeObserver(Observer observer) {
          this.funcionarios.remove(observer);
     }

     @Override
     public void notify(String message) {
          this.funcionarios.forEach(funcionario -> funcionario.notify(this, message));;
     }
}
