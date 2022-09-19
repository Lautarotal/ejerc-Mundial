import java.util.*;
public class Jugador {
    protected String nombre;
    protected String apellido;
    protected double masa;
    protected double inteligencia;
    protected double reflejos;

    public Jugador(String getNombre, String getApellido, double getMasa, double getInteligencia, double getReflejos) {
        this.nombre = getNombre;
        this.apellido = getApellido;
        this.masa = getMasa;
        this.inteligencia = getInteligencia;
        this.reflejos = getReflejos;
    }

    public double potencialOfensivo() {
        return inteligencia * reflejos + masa;
    }

    public double potencialDefensivo() {
        return masa * inteligencia + reflejos;
    }

    public double potencialTotal() {
        return potencialTotal;
    }

    public void display() {
        system.out.println(nombre);
        system.out.println(apellido);
        system.out.println(masa);
        system.out.println(inteligencia);
        system.out.println(reflejos);
        system.out.println(posicion());
        system.out.println(potencialOfensivo());
        system.out.println(potencialDefensivo());
        system.out.println(potencialTotal());
    }

    public static void main(String[] args) {

       /* Jugador defensor, delantero, mediocampista;
        defensor = new Defensor();
        delantero = new Delantero();
        mediocampista = new Mediocampista();

        Jugador[] todosLosJug = {defensor, delantero, mediocampista};
        for (Jugador Jugador : todosLosJug) {
            System.out.println();*/
        }
    }
}

