import java.util.*;

public class Regla_Falsa{

    //Creamos El Metodo Para Calcular La Raiz De La Ecuacion Oh Funcion

    public double raiz(Funcion F, double X0, double X1, int iteraciones, double error){

        //Variable De Retorno Cuando Se Encuentre La Raiz
        double Retorno = 0;
        //Variable Para Calcular La Interseccion De Eje X
        double X = X0;
        //Variable Para Calcular Ciclos
        int Ciclos = 0;

        //Empezamos A Desarrollar El Ciclo Para Cumplir Criterio
        while(Math.abs(F.evaluacion(X)) > error && Ciclos < iteraciones){

            //Aproximacion A La Raiz De X
            X = (X0 * F.evaluacion(X1) - X1 * F.evaluacion(X0)) / (F.evaluacion(X1) - F.evaluacion(X0));

        }

    }

}
