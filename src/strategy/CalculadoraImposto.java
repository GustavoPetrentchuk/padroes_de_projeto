package strategy;

public class CalculadoraImposto {
     public double calcularImposto(Imposto imposto, double valor){
          return imposto.calcular(valor);
     }
}
