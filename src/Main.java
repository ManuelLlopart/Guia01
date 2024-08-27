import Models.BankAccount;
import Models.Empleado;
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

}

