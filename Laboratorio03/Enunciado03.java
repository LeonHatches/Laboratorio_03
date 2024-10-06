
	import java.util.Random;
	public class Enunciado03
	{
	    public static void main (String [] args)
	    {
	    	Soldado [] soldadosA = new Soldado [Random ()];
	    	Soldado [] soldadosB = new Soldado [Random ()];
	        
	        System.out.println("SOLDADOS EN GUERRA\n");
	        
	        // Metodos
	        InicializarSoldados (soldadosA);
	        InicializarSoldados (soldadosB);
	        
	        // Mostrar
	        System.out.println("\t\tEJERCITO A");
	        MostrarEjercito (soldadosA);
	        
	        System.out.println("\t\tEJERCITO B");
	        MostrarEjercito (soldadosB);
	        
	        // Ganador
	        MostrarEjercitoGanador (soldadosA, soldadosB);
	    }
	
	    public static int Random ()
	    {
	        Random ran = new Random ();
	        return ran.nextInt(5)+1;
	    }
	    
	    public static void InicializarSoldados (Soldado [] soldados)
	    {
	        for (int i = 0 ; i < soldados.length ; i++)
	        {
	        	soldados[i] = new Soldado ();
	            soldados[i].setName("Soldado"+i);
	        }
	    }
	    
	    public static void MostrarEjercito (Soldado [] soldados)
	    {
	        System.out.println("El nombre de sus soldados son:");
	        
	        for (Soldado soldado : soldados)
	            System.out.println( "- " + soldado.getName() );           
	    }
	    
	    public static void MostrarEjercitoGanador (Soldado [] soldadosA, Soldado [] soldadosB)
	    {
	        if (soldadosA.length == soldadosB.length)
	            System.out.println ("\n\t\tEMPATE DE EJERCITOS");
	        else
	        {
	            if (soldadosA.length > soldadosB.length)
	            {
	                System.out.println ("\n\tGANADOR: EJERCITO A");
	                MostrarEjercito (soldadosA);
	            }
	            else
	            {
	                System.out.println ("\n\tGANADOR: EJERCITO B");
	                MostrarEjercito (soldadosB);
	            }
	        }
	    }
	}
