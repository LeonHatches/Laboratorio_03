	
	import java.util.*;
	public class DemoBatalla
	{
		static Scanner sc = new Scanner (System.in);
	    public static void main (String [] args)
	    {
	        Nave [] misNaves = new Nave[10];
	        
	        String  nomb, col;
	        int     fil, punt;
	        boolean est;
	
	        // Entrada para las 10 naves y centro de metodos
	        for (int i = 0; i < misNaves.length; i++)
	        {
	        	// Entrada de datos
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
	
	            //Se crea un objeto Nave y se asigna su referencia a misNaves
	            misNaves[i] = new Nave();
	            	
	            // Asignacion de datos en el respectivo objeto
	            misNaves[i].setNombre(nomb);
	            misNaves[i].setFila(fil);
	            misNaves[i].setColumna(col);
	            misNaves[i].setEstado(est);
	            misNaves[i].setPuntos(punt);
	        }
	
	        // Mostrar
	        System.out.println("\n\t| NAVES CREADAS |");
	        mostrarNaves     (misNaves);
	        mostrarPorNombre (misNaves);
	        mostrarPorPuntos (misNaves);
	        
	        // Mayor nave segun puntos
	        System.out.println("\nNave con mayor numero de puntos:\n"
	        				   + mostrarMayorPuntos(misNaves) );
	        // Orden aleatorio
	        mostrarAleatorio (misNaves);
	    }
	    
	    // Método para mostrar todas las naves
	    public static void mostrarNaves (Nave [] flota)
	    {
	            for (int i = 0 ; i < flota.length ; i++)
	                System.out.println("\t| NAVE "+(i+1)+" |\n"+flota[i]+"\n");
	    }
	
	    // Método para mostrar todas las naves de un nombre que se pide por teclado
	    public static void mostrarPorNombre (Nave [] flota)
	    {
	        System.out.println ("| TODAS LAS NAVES POR NOMBRE INGRESADO |");
	        System.out.print ("Ingrese nombre: ");
	        String nombre = sc.next();
	        
	        for (int i = 0 ; i < flota.length ; i++)
	        {
	        	if ( flota[i].getNombre().equals( nombre ) )
	        		 System.out.println("| NAVE ENCONTRADA |\n"+flota[i]+"\n");
	        }
	        
	        System.out.println ();
	    }
	
	    // Método para mostrar todas las naves con un número de puntos inferior o igual
	    // al número de puntos que se pide por teclado
	    public static void mostrarPorPuntos (Nave [] flota)
	    {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println ("| TODAS LAS NAVES SEGUN PUNTOS |");
	        System.out.print ("Ingrese un maximo de puntos: ");
	        int puntos = sc.nextInt();
	
	        for (int i = 0 ; i < flota.length ; i++)
	        {
	            if (flota[i].getPuntos() <= puntos)
	                System.out.println("\t| NAVE "+(i+1)+" |\n"+flota[i]+"\n");
	        }
	    }
	
	    // Método que devuelve la Nave con mayor número de Puntos
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
	    
	    // Método que devuelva un nuevo arreglo de objetos con todos los objetos
	    // previamente ingresados pero aleatoriamente desordenados
	    public static void mostrarAleatorio (Nave [] flota)
	    {
	    	int contador = 0, aleatorio [] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	    	
	    	System.out.println("\n\t| NAVES AL AZAR |");
	    	
	    	while ( aleatorioFalta(aleatorio) )
	    	{
	    		int random = (int) (Math.random() * 10);
	    		
	    		if ( !ContieneIndex (aleatorio, random) )
	    		{
	    			aleatorio[contador] = random;
	    			contador++;
	    		}
	    	}
	    	
	    	for (int i = 0 ; i < flota.length ; i++)
	            System.out.println("\t| NAVE "+(i+1)+" |\n"+flota[ aleatorio[i] ]+"\n");
	    }
	    
	    // Metodo que revisa si el numero aleatorio ya esta en el arreglo
	    public static boolean ContieneIndex (int [] aleatorio, int numero)
	    {
	    	for (int azar : aleatorio)
	    		if (azar == numero) return true;
	    	
	    	return false;
	    }
	    
	    // Metodo que revisa si falta llenar algun numero aleatorio
	    public static boolean aleatorioFalta (int [] aleatorio)
	    {
	    	for (int i = 0 ; i < aleatorio.length ; i++)
	    	{
	    		if (aleatorio[i] == -1) return true;
	    	}
	    	return false;
	    }
	}
	
	