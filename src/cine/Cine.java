package cine;
import java.util.*;

public class Cine {
    // Instanciar Lista.
    static ArrayList<Cartelera> listaCartelera = new ArrayList<>();
    
    // Atributos.
    static int id, cantA, cantM, cantN, totalP, totalB, asientos, vendido;

    // Lista de Cartelera.
    public static void lista() {
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
    
    // Mostar los elementos de la lista.
    public static void mostrar(String titulo) {
        listaCartelera.stream().filter((c) -> (titulo == null ? c.getTitulo() == null : titulo.equals(c.getTitulo()))).forEach((c) -> {
            System.out.println(c.DatosCartelera());
        });  
    }
    
    // Menú principal.
    public static void menuPrincipal() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opción del usuario
        
        while (!salir) {
            System.out.println("\n*******CINE STARS*******\n\n" 
                    + "1.-Comprar boletos.\n" 
                    + "2.-Salir del sistema.\n");
            
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
    
    // Menú Pélicula.
    public static void menuPelicula() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opción del usuario
        
        while (!salir) {
            System.out.println("\n*******PÉLICULAS*******\n\n"
                    + "1.-Shazam.\n"
                    + "2.-Avengers End Game.\n"
                    + "3.-Dumbo.\n"
                    + "4.-Parque Magico.\n"
                    + "5.-Captain Marvel.\n"
                    + "6.-Cementerio de Animales.\n"
                    + "7.-Hellboy.\n"
                    + "8.-A dos Metros de Ti.\n"
                    + "9.-After.\n"
                    + "10.-Haunted Hospital.\n"
                    + "11.-Regresar.\n");
            
            try {
                System.out.print("-La opción es: ");
                opcion = sn.nextInt();
                System.out.print("\n*******CARTELERA*******\n");
                switch (opcion) {
                    case 1:
                        mostrar("Shazam");
                        menuFinal();
                        break;
                    case 2:
                        mostrar("Avengers End Game");
                        menuFinal();
                        break;
                    case 3:
                        mostrar("Dumbo");
                        menuFinal();
                        break;
                    case 4:
                        mostrar("Parque Magico");
                        menuFinal();
                        break;
                    case 5:
                        mostrar("Captain Marvel");
                        menuFinal();
                        break;
                    case 6:
                        mostrar("Cementerio de Animales");
                        menuFinal();
                        break;
                    case 7:
                        mostrar("Hellboy");
                        break;
                    case 8:
                        mostrar("A dos Metros de Ti");
                        menuFinal();
                        break;
                    case 9:
                        mostrar("After");
                        menuFinal();
                        break;
                    case 10:
                        mostrar("Haunted Hospital");
                        menuFinal();
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
    
    // Menú Cartelera, Función, Boletos y Compra.
    public static void menuFinal() {
        Scanner sn = new Scanner(System.in);
        System.out.print("\n-Número de Cartelera: ");
        id = sn.nextInt();
        System.out.println("\n*******FUNCIÓN*******");
        for(Cartelera c: listaCartelera) {
           if(id == c.getIdCartelera()) {
               System.out.println(c.DatosCartelera());
               System.out.println("\n*******BOLETOS*******\n");
               if(null != c.getTipoSala()) switch (c.getTipoSala()) {
                   case "2D":
                       System.out.println("-Adulto.......$50.00\n"
                               + "-Mayor........$20.00\n"
                               + "-Niño.........$25.00\n");
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
                       vendido = c.getAsientosOcupados() + totalB;
                       c.setAsientosOcupados(vendido);
                       menuPrincipal();
                       break;
                   case "3D":
                       System.out.println("-Adulto.......$70.00\n"
                               + "-Mayor........$30.00\n"
                               + "-Niño.........$35.00\n");
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
                       vendido = c.getAsientosOcupados() + totalB;
                       c.setAsientosOcupados(vendido);
                       menuPrincipal();
                       break;
                   case "IMAX":
                       System.out.println("-Adulto.......$80.00\n"
                               + "-Mayor........$40.00\n"
                               + "-Niño.........$45.00\n");
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
                       vendido = c.getAsientosOcupados() + totalB;
                       c.setAsientosOcupados(vendido);
                       menuPrincipal();
                       break;
                   default:
                       break;
               }
           }
        } 
    }
    
    // Main.    
    public static void main(String[] args) {
        lista();
        menuPrincipal(); 
    } 
}