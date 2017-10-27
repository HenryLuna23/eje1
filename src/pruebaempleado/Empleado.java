package pruebaempleado;
/**
 *
 * @author Luna
 */
public class Empleado {
    private double salario=150.99;
    private void metodoPrivado(){
        System.out.println("metodo privado");
    }
    public void metodoPublico(){
        System.out.println("metodo publico");
        System.out.println("imprimiendo atributos " + salario);
        metodoPrivado();
    }
}
