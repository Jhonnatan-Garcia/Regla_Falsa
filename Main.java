import java.util.*;
public class Main{

    public static void main(String[] args){

      Funcion funcion = new Funcion() {
          @Override
          public double evaluacion(double x) {
              return Math.sin(x)*x;
          }
      };

        Regla_Falsa regla_falsa = new Regla_Falsa();

        double Raiz = regla_falsa.raiz(funcion, 1, 4, 100, 1e-6);
        System.out.println("Raiz: " + Raiz);
}

}
