package strategy;

public class ICMS implements Imposto {
     double aliquota;

     public ICMS(double aliquota) {
          this.aliquota = aliquota;
     }

     @Override
     public double calcular(double valor) {
         return valor * this.aliquota;
     }
}
