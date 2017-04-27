
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
/**
 *
 * @author Propietario
 */
public class TestCarrera {
    private static final int limite=20;    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,suma1=0,suma2=0;
        Animales p=new Perro(true,"Firulais",3);
        Animales g=new Gato(true,"Garfield",4);
        Random r=new Random();
        
        while(!(suma1>=TestCarrera.limite ^ suma2>=TestCarrera.limite))
        { n=r.nextInt(2);
          if(n==1)
          { suma1=suma1+p.getVelocidad();
            if(suma1>=TestCarrera.limite)
                  System.out.println(p.getNombre()+" gano la carrera");
          }
          else
          { suma2=suma2+g.getVelocidad();
            if (suma2>=TestCarrera.limite)
                  System.out.println(g.getNombre()+" gano la carrera");
          }
        }
    }
}