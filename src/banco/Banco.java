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
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta CaioConta = new Conta();
        
        CaioConta.numero = 123456789;
        CaioConta.titular = "Caio";
        CaioConta.deposita(100);
        
        
        System.out.println("Numero da conta: " + CaioConta.numero);
        System.out.println("Titular da conta: " + CaioConta.titular);
        System.out.println("Saldo da conta: " + CaioConta.getSaldo());
        
        Conta TiagoConta = new Conta();
        
        TiagoConta.numero = 1234;
        TiagoConta.titular = "Tiago";
        TiagoConta.deposita(1000);
        
        if(TiagoConta.saca(500)){
           System.out.println("Conseguiu sacar"); 
        }
        TiagoConta.transferi(CaioConta,100);
        System.out.println("Numero da conta: " + TiagoConta.numero);
        System.out.println("Titular da conta: " + TiagoConta.titular);
        System.out.println("Saldo da conta Tiago: " + TiagoConta.getSaldo());
        System.out.println("Saldo da conta Caio: " + CaioConta.getSaldo());
        System.out.println("Rendimento da conta: " + CaioConta.rendimento());
    }
    
}
