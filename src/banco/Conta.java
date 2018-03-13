/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 13.03349-2
 */
public class Conta {
    
    int numero;
    String titular;
    private double saldo;
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void deposita(double valor) {
        this.saldo += valor;
    }
    
    public boolean saca(double valor){
        if(this.saldo > valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    public void transferi(Conta destino,double valor){
        this.saldo-= valor;
        destino.saldo += valor;
        
    }
    public double rendimento(){
        return 0.1 * this.saldo;
    }
    
}
