import Models.BankAccount;
import Models.Empleado;
import Models.ItemVenta;
import Models.Libro;

import java.math.*;
import java.util.*;
public class Main {
    private static final Scanner menuScanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;


        do {
            menu();
            opcion = menuScanner.nextInt();
            switch (opcion){
                case 1:
                    ej01();
                    break;
                case 2:
                    ej02();
                    break;
                case 3:
                    ej03();
                    break;
            }
        }while(opcion!=0);

}
    private static void menu() {
        System.out.println("\n\t\t\t<<<<<<<<<<<< Menu de Opciones >>>>>>>>>>>>>\n");
        System.out.println("1 - Ej 1");
        System.out.println("2 - Ej 2");
        System.out.println("3 - Ej 3");
        System.out.println("4 - Ej 4");
        System.out.println("5 - Ej 5");
        System.out.println(" ");
        System.out.println("0 para Salir");
    }

    public static void ej01(){
        Empleado emp1 = new Empleado("Carlos","Gutiérrez", 23456345, 25000 );
        Empleado emp2 = new Empleado("Ana","Sánchez",34234123,27500);

        emp1.imprimir();
        emp2.imprimir();
        emp1.aumentoSalarioPorcentual(15);
        System.out.println("El salario anual de Carlos es " + emp1.salarioAnual());
        System.out.println("Salario " + emp1.riseSalary(15));
        emp1.imprimir();
    }

    public static void ej02(){
        BankAccount cuenta1 = new BankAccount("Carlos", 15000);

        System.out.println("Ingreso " + "2500 " + " balance=" + cuenta1.crédito(2500));
        System.out.println("Egreso " + "1500" + " balance=" + cuenta1.debito(1500));
        System.out.println("Egreso " + "30000" + " balance=" + cuenta1.debito(30000));
        System.out.println(cuenta1.toString());
    }
//    a. Inicializa un libro con el título "El Quijote", autor "Miguel de
//    Cervantes", precio 500, y 10 copias disponibles.
//    b. Inicializa otro libro con el título "Cien Años de Soledad", autor
//"Gabriel García Márquez", precio 700, y 5 copias disponibles.
//    c. Imprime los detalles de ambos libros.
//    d. Vende 3 copias del primer libro.
//    e. Imprime los detalles del primer libro.
//    f. Intenta vender 8 copias del segundo libro.
//    g. Incrementa en 5 la cantidad de copias disponibles del segundo libro.
//    h. Imprime los detalles del segundo libro.
    public static void ej03(){
        Libro libro1 = new Libro("El Quijote","Miguel de Cervantes", 500, 10);
        Libro libro2 = new Libro("Cien Años de Soledad" , "Gabriel Garía Marquez", 700, 5);
        libro1.imprimir();
        libro2.imprimir();
        libro1.venta(3);
        libro1.imprimir();
        libro2.venta(8);
        libro2.ingreso(5);
        libro2.imprimir();
    }

//    En el main, realiza las siguientes operaciones dentro de un switch:
//            1. Agregar ítem: Inicializa un objeto ItemVenta con valores proporcionados por
//    el usuario.
//            2. Imprime el objeto usando el método correspondiente.
//3. Permite al usuario ingresar una nueva cantidad y actualiza el atributo
//    cantidad del ítem de venta.
//4. Permite al usuario ingresar un nuevo precio unitario y actualiza el atributo
//    precioUnitario del ítem de venta.
//5. Imprime el precio total calculado por el método calcularPrecioTotal().
//            6. Sale del programa.
    public static void ej04(){
        System.out.println("Ingrese la opción");
        int eleccion;

        do {
            eleccion=menuScanner.nextInt();
            switch (eleccion){
                case 1:
                    ItemVenta item1 = new ItemVenta();
                    System.out.println("Ingrese id");
                    item1.setId(menuScanner.nextInt());
                    System.out.println("Ingrese descripcion");
                    item1.setDescripcion(menuScanner.next());
                    System.out.println("Ingrese cantidad");
                    item1.setCantidad(menuScanner.nextInt());
                    System.out.println("Ingrese precio");
                    item1.setPrecioUnitario(menuScanner.nextDouble());
                    break;
                case 2:
                    item1.imprimir();
                    break;
                case 3:
                    System.out.println("Ingrese nueva cantidad");
                    item1.setCantidad(menuScanner.nextInt());
                    break;
                case 4:
                    System.out.println("Ingrese nuevo precio");
                    item1.setPrecioUnitario(menuScanner.nextDouble());
                    break;
                case 5:
                    System.out.println("Precio calculado de 10 unidades = " + item1.calcularPrecioTotal(10));
                    break;
            }
        }while(eleccion!=0);
    }

}

