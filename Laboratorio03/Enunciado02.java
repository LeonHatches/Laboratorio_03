	
	import java.util.Scanner;
	import java.util.Random;
	
	public class Enunciado02
	{
	    public static void main (String [] args)
	    {
	    	Soldado [] soldados = new Soldado [5];
	        
	        // Programa
	        System.out.println("SOLDADOS EN GUERRA\n");
	        
	        // Metodos
	        IngresarNombres (soldados);
	        IngresarVida	(soldados);
	        Mostrar			(soldados);
	    }
	    
	    public static void IngresarNombres (Soldado [] soldados)
	    {
	        Scanner sc = new Scanner (System.in);
	        
	        for (int i = 0 ; i < soldados.length ; i++)
	        {
	        	soldados[i] = new Soldado ();
	        	
	            System.out.print ("Ingrese nombre del soldado: ");
	            String name = sc.next();
	            soldados[i].setName(name);
	        }
	    }
	    
	    public static void IngresarVida (Soldado [] soldados)
	    {
	        Random ran = new Random ();
	        
	        for (int i = 0 ; i < soldados.length ; i++)
	            soldados[i].setVida( ran.nextInt(5)+1 ); 
	    }
	    
	    public static void Mostrar (Soldado [] soldados)
	    {
	        System.out.println("\nEl nombre de sus soldados son:");
	        
	        for (int i = 0 ; i < soldados.length ; i++)
	            System.out.println
	            ("- " + soldados[i].getName() + " ----- Vida: " + soldados[i].getVida());          
	    }
	}
	
