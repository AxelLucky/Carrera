/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class Gato extends Animales{
    private final boolean maulla;

    public Gato(boolean maulla, String nombre, int Velocidad) {
        super(nombre, Velocidad);
        this.maulla = maulla;
    }

    public void maulla(){
        if (this.maulla)
            System.out.println("El gato maulla");
        else
            System.out.println("El gato no maulla");
    }

    @Override
    public String toString() {
        return "Gato{" + "maulla=" + maulla + '}';
    }
}