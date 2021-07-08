/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_braavos;

/**
 *
 * @author David
 */
public class Cuenta {
    //Atributos
    private int numeroCuenta;
    private int saldo_total;
    
    //Constructor
    public Cuenta(int numeroCuenta, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo_total = saldo;
    }
    
    //Metodos de encapsulamiento

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo_total;
    }

    public void setSaldo(int saldo) {
        this.saldo_total = saldo;
    }
    
    public void ingresar_saldo (int saldo){
        this.saldo_total += saldo;
    }  
    
    public void retirar_saldo (int saldo){
        this.saldo_total -= saldo;
    }
}
