import java.util.*;
public class Main{

    public static void main(String[] args){

      Funcion funcion = new Funcion() {
          @Override
          public double evaluacion(double x) {
              //Funcion A Evaluar En Este Caso: (Sin X) * X
              return Math.sin(x)*x;
          }
      };

        Regla_Falsa regla_falsa = new Regla_Falsa();

        //Los Parametros Que Ingresamos Son Los Siguientes:
        /*

        funcion = (Sin X) * X previamente definida
        1 = X0
        4 = X1
        100 = Numero De iteraciones
        1e-6 = Margen De Error
        
        */
        double Raiz = regla_falsa.raiz(funcion, 1, 4, 100, 1e-6);
        System.out.println("Raiz: " + Raiz);
}

}
