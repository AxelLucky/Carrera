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
    
    private String sexo;

    public Gato(String nombre, int Velocidad) {
        super(nombre, Velocidad);
    }
    public Gato(String sexo, String nombre, int Velocidad) {
        super(nombre, Velocidad);
        this.sexo = sexo;
    }
    @Override
    public String toString() {
        return "Gato";
    }

    @Override
    public String getSexo() {
        return sexo;
    }
    @Override
    public void setSexo(String sexo) {
     this.sexo=sexo;   
    }
 
}