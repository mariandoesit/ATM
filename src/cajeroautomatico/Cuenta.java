package cajeroautomatico;

import javax.swing.JOptionPane;

public class Cuenta {

    public static void main(String[] args) {
        final int saldoInicial = 1000;
        int opcion;
        float ingreso, saldoActual, retiro;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenidx a su Cajero Automático\n"
                    + "1. Ingresar dinero a su cuenta\n"
                    + "2. Retirar dinero de su cuenta\n"
                    + "3. Salir\n"));
        
        switch(opcion){
                case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite el monto que desea ingresar"));
                        saldoActual = saldoInicial + ingreso;
                        JOptionPane.showMessageDialog(null,"Dinero en cuenta: "+ saldoActual);
                        break;
                case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite el monto que desea retirar"));
                        
                if (retiro > saldoInicial){
                    JOptionPane.showMessageDialog(null,"No cuenta con el saldo suficiente");
                } else{
                    saldoActual = saldoInicial - retiro;
                    JOptionPane.showMessageDialog(null,"Dinero en cuenta "+ saldoActual);
                }
                break;
                
                case 3: break;
                
                default: JOptionPane.showMessageDialog(null, "Opción de menú incorrecta");
        }
    }
    
}
