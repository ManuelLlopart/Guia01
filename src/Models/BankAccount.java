package Models;

import java.util.UUID;

public class BankAccount {
    private String id;
    private String nombre;
    private double balance;

    public BankAccount(String nombre) {
        this.nombre = nombre;
        this.id = UUID.randomUUID().toString();
    }

    public BankAccount(String nombre, double balance) {
        this.nombre = nombre;
        this.balance = balance;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double crédito(double cantidad){
        this.balance += cantidad;
        return this.balance;
    }

    public double debito(double cantidad){
        if(this.balance > cantidad){
            this.balance -= cantidad;
        }else{
            System.out.println("Montos insuficientes");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
}
