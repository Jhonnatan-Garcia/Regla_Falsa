import java.util.*;
public class Main{

    public static void main(String[] args){

        Funcion function = new Funcion(){

            @Override
            public double Funcion(double x){

                return Math.sin(x)*x;

            }

        };

        Regla_Falsa regla_falsa = new Regla_Falsa();

        double Raiz = regla_falsa.raiz(function, 1, 4, 100, 1e-6);
        System.out.println("Raiz: " + Raiz);
}

}
