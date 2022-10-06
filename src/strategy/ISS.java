package strategy;

public class ISS implements Imposto {
     double aliquota;

     public ISS() {
          this.aliquota = 0.13;
     }

     @Override
     public double calcular(double valor) {
          return valor * this.aliquota;
     }
}
