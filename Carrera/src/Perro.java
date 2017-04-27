/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public class Perro extends Animales{
    private final boolean ladra;

    public Perro(boolean ladra, String nombre, int Velocidad) {
        super(nombre, Velocidad);
        this.ladra = ladra;
    }

    public void ladrar(){
        if(ladra)
            System.out.println("El perro ladra");    
        else
            System.out.println("El perro no ladra");
    }    

    @Override
    public String toString() {
        return "Perro{" + "ladra=" + ladra + '}';
    }
    
}