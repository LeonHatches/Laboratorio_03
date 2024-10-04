import java.util.*;
public class DemoBatalla
{
    public static void main(String [] args)
    {
        Nave [] misNaves = new Nave[2];
        Scanner sc = new Scanner(System.in);
        
        String  nomb, col;
        int     fil, punt;
        boolean est;

        for (int i = 0; i < misNaves.length; i++)
        {
            System.out.println("\t| NAVE " + (i+1)+"|");
            System.out.print("Nombre: ");
            nomb = sc.next();
            System.out.print("Fila: ");
            fil = sc.nextInt();
            System.out.print("Columna: ");
            col = sc.next();
            System.out.print("Estado: ");
            est = sc.nextBoolean();
            System.out.print("Puntos: ");
            punt = sc.nextInt();
            
            System.out.println ();

            misNaves[i] = new Nave(); //Se crea un objeto Nave y se asigna su referencia a misNaves

            misNaves[i].setNombre(nomb);
            misNaves[i].setFila(fil);
            misNaves[i].setColumna(col);
            misNaves[i].setEstado(est);
            misNaves[i].setPuntos(punt);
        }

        System.out.println("\n\t| NAVES CREADAS |");
        mostrarNaves(misNaves);
        mostrarPorNombre(misNaves);
        mostrarPorPuntos(misNaves);
        System.out.println("\nNave con mayor numero de puntos:\n" + mostrarMayorPuntos(misNaves));
    }
    
    //Método para mostrar todas las naves
    public static void mostrarNaves(Nave [] flota)
    {
            for (int i = 0 ; i < flota.length ; i++)
            {
                System.out.println("\t| NAVE "+(i+1)+" |\n"+flota[i]+"\n");
            }
    }

    //Método para mostrar todas las naves de un nombre que se pide por teclado
    public static void mostrarPorNombre(Nave [] flota)
    {
        System.out.println ("| TODAS LAS NAVES POR NOMBRE |");
        
        for (int i = 0 ; i < flota.length ; i++)
        {
            System.out.println("| NAVE "+(i+1)+" | "+flota[i].getNombre());
        }
        System.out.println ();
    }

    //Método para mostrar todas las naves con un número de puntos inferior o igual
    //al número de puntos que se pide por teclado
    public static void mostrarPorPuntos(Nave [] flota)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println ("| TODAS LAS NAVES SEGUN PUNTOS |");
        System.out.print("Ingrese un maximo de puntos: ");
        int puntos = sc.nextInt();

        for (int i = 0 ; i < flota.length ; i++)
        {
            if (flota[i].getPuntos() <= puntos)
                System.out.println("\t| NAVE "+(i+1)+" |\n"+flota[i]+"\n");
        }
    }

    //Método que devuelve la Nave con mayor número de Puntos
    public static Nave mostrarMayorPuntos(Nave [] flota)
    {
        int index = 0;
        for (int i = 1 ; i < flota.length ; i++)
        {
            if (flota[index].getPuntos() < flota[i].getPuntos())
                index = i;
        }
        return flota[index];
    }
    //Crear un método que devuelva un nuevo arreglo de objetos con todos los objetos previamente ingresados
    //pero aleatoriamente desordenados
    
}
