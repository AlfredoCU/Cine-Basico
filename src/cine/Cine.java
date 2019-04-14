package cine;
import java.util.*;

public class Cine {
    // Instanciar Lista.
    static ArrayList<Cartelera> listaCartelera = new ArrayList<Cartelera>();
    // Atributos.
    static int id, cantA, cantM, cantN, totalP, totalB, asientos, vendido = 0;
    
    // Main.    
    public static void main(String[] args) {
        lista();
        menuPrincipal(); 
    }
    
    // Menu principal.
    public static void menuPrincipal() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        
        while (!salir) {
            System.out.println("\n*******CINE STARS*******\n");
            System.out.println("1.-Comprar boletos.");
            System.out.println("2.-Salir del sistema.\n");
            
            try {
                System.out.print("-La opción es: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        menuPelicula();
                        break;
                    case 2:
                        salir = true;
                        break;
                    default:
                        System.out.println("-¡La opción no es valida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("-¡Debes insertar un número!");
                sn.next();
            }
        }
    }
    
    // Menu Pelicula.
    public static void menuPelicula() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        
        while (!salir) {
            System.out.println("\n*******PELICULAS*******\n");
            System.out.println("1.-Shazam.");
            System.out.println("2.-Avengers End Game.");
            System.out.println("3.-Dumbo.");
            System.out.println("4.-Parque Magico.");
            System.out.println("5.-Captain Marvel.");
            System.out.println("6.-Cementerio de Animales.");
            System.out.println("7.-Hellboy.");
            System.out.println("8.-A dos Metros de Ti.");
            System.out.println("9.-After.");
            System.out.println("10.-Haunted Hospital.");
            System.out.println("11.-Regresar.\n");
            
            try {
                System.out.print("-La opción es: ");
                opcion = sn.nextInt();
                System.out.print("\n*******CARTELERA*******\n");
                switch (opcion) {
                    case 1:
                        mostrar("Shazam");
                        menuCartelera();
                        break;
                    case 2:
                        mostrar("Avengers End Game");
                        menuCartelera();
                        break;
                    case 3:
                        mostrar("Dumbo");
                        menuCartelera();
                        break;
                    case 4:
                        mostrar("Parque Magico");
                        menuCartelera();
                        break;
                    case 5:
                        mostrar("Captain Marvel");
                        menuCartelera();
                        break;
                    case 6:
                        mostrar("Cementerio de Animales");
                        menuCartelera();
                        break;
                    case 7:
                        mostrar("Hellboy");
                        break;
                    case 8:
                        mostrar("A dos Metros de Ti");
                        menuCartelera();
                        break;
                    case 9:
                        mostrar("After");
                        menuCartelera();
                        break;
                    case 10:
                        mostrar("Haunted Hospital");
                        menuCartelera();
                        break;
                    case 11:
                        salir = true;
                        break;
                    default:
                        System.out.println("-¡La ocpión no es valida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("-¡Debes insertar un número!");
                sn.next();
            }
        }
    }
    
    // Lista de Cartelera.
    public static void lista() {
       // ArrayList<Cartelera> listaCartelera = new ArrayList<Cartelera>();
        // listaCartelera.ensureCapacity(100); Usar cuando ya esten todos los elementos.
        listaCartelera.add(new Cartelera(1, 210, 0, "12:00", 1, 210, "2D", "Shazam", "Accion", "B", 120));
        listaCartelera.add(new Cartelera(2, 210, 0, "07:00", 2, 210, "3D", "Shazam", "Accion", "B", 120));
        listaCartelera.add(new Cartelera(3, 210, 0, "07:00", 3, 210, "IMAX", "Shazam", "Accion", "B", 120));
        
        listaCartelera.add(new Cartelera(4, 210, 0, "14:45", 4, 210, "2D", "Avengers End Game", "Accion", "B", 120));
        listaCartelera.add(new Cartelera(5, 210, 0, "12:00", 2, 210, "3D", "Avengers End Game", "Accion", "B", 120));
        listaCartelera.add(new Cartelera(6, 210, 0, "09:45", 3, 210, "IMAX", "Avengers End Game", "Accion", "B", 120));
         
        listaCartelera.add(new Cartelera(7, 210, 0, "12:00", 5, 210, "2D", "Dumbo", "Animada", "A", 90));
        listaCartelera.add(new Cartelera(8, 210, 0, "12:00", 2, 210, "3D", "Dumbo", "Animada", "A", 90));
        listaCartelera.add(new Cartelera(9, 210, 0, "12:00", 3, 210, "IMAX", "Dumbo", "Animada", "A", 90));
    }
    
    public static void mostrar(String titulo){
        for(Cartelera c: listaCartelera) {
           if(titulo == null ? c.getTitulo() == null : titulo.equals(c.getTitulo())){
               System.out.println(c.DatosCartelera());
           }
        }  
    }
    
    public static void menuCartelera(){
        Scanner sn = new Scanner(System.in);
        System.out.print("\n-Número de Cartelera: ");
        id = sn.nextInt();
        System.out.println("\n*******FUNCION*******");
        for(Cartelera c: listaCartelera) {
           if(id == c.getIdCartelera()){
               System.out.println(c.DatosCartelera());
               System.out.println("\n*******BOLETOS*******\n");
               if("2D" == c.getTipoSala()) {
                   System.out.println("-Adulto.......$50.00");
                   System.out.println("-Mayor........$20.00");
                   System.out.println("-Niño.........$25.00");
                   
                   System.out.print("\n-Cantidad de boletos para Adulto: ");
                   cantA = sn.nextInt();
                   System.out.print("\n-Cantidad de boletos para Mayor: ");
                   cantM = sn.nextInt();
                   System.out.print("\n-Cantidad de boletos para Niño: ");
                   cantN = sn.nextInt();
                   
                   System.out.println("\n*******COMPRA*******");
                   totalB = cantA + cantM + cantN;
                   System.out.print("\n-Cantidad de boletos: " + totalB);
                   totalP = (cantA * 50) + (cantM * 20) + (cantN * 25);
                   System.out.print("\n-Total a pagar: " + totalP + "\n");
                   
                   asientos = c.getAsientosDisponibles() - totalB;
                   c.setAsientosDisponibles(asientos);
                   vendido = vendido + totalB;
                   c.setAsientosOcupados(vendido);
                   menuPrincipal();
               }
               else if("3D" == c.getTipoSala()) {
                   System.out.println("-Adulto.......$70.00");
                   System.out.println("-Mayor........$30.00");
                   System.out.println("-Niño.........$35.00");
                   
                   System.out.print("\n-Cantidad de boletos para Adulto: ");
                   cantA = sn.nextInt();
                   System.out.print("\n-Cantidad de boletos para Mayor: ");
                   cantM = sn.nextInt();
                   System.out.print("\n-Cantidad de boletos para Niño: ");
                   cantN = sn.nextInt();
                   
                   System.out.println("\n*******COMPRA*******");
                   totalB = cantA + cantM + cantN;
                   System.out.print("\n-Cantidad de boletos: " + totalB);
                   totalP = (cantA * 70) + (cantM * 30) + (cantN * 35);
                   System.out.print("\n-Total a pagar: " + totalP + "\n");
                   
                   asientos = c.getAsientosDisponibles() - totalB;
                   c.setAsientosDisponibles(asientos);
                   vendido = vendido + totalB;
                   c.setAsientosOcupados(vendido);
                   menuPrincipal();
               }
               else if("IMAX" == c.getTipoSala()) {
                   System.out.println("-Adulto.......$80.00");
                   System.out.println("-Mayor........$40.00");
                   System.out.println("-Niño.........$45.00");
                   
                   System.out.print("\n-Cantidad de boletos para Adulto: ");
                   cantA = sn.nextInt();
                   System.out.print("\n-Cantidad de boletos para Mayor: ");
                   cantM = sn.nextInt();
                   System.out.print("\n-Cantidad de boletos para Niño: ");
                   cantN = sn.nextInt();
                   
                   System.out.println("\n*******COMPRA*******");
                   totalB = cantA + cantM + cantN;
                   System.out.print("\n-Cantidad de boletos: " + totalB);
                   totalP = (cantA * 80) + (cantM * 40) + (cantN * 45);
                   System.out.print("\n-Total a pagar: " + totalP + "\n");
                   
                   asientos = c.getAsientosDisponibles() - totalB;
                   c.setAsientosDisponibles(asientos);
                   vendido = vendido + totalB;
                   c.setAsientosOcupados(vendido);
                   menuPrincipal();
               }
           }
        } 
    }
}