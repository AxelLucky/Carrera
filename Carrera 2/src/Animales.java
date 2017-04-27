/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Propietario
 */
public abstract class Animales {
    private final String nombre;
    private final int Velocidad;
 


    public Animales(String nombre, int Velocidad) {
        this.nombre = nombre;
        this.Velocidad = Velocidad;
    }
    public String getNombre() {
        return nombre;
    }

    public int getVelocidad() {
        return Velocidad;
    }
    public abstract void setSexo(String sexo);
    public abstract String getSexo();
    
    @Override
    public String toString() {
        return "Animales{" + "nombre=" + nombre + ", Velocidad=" + Velocidad + '}';
    }
}
