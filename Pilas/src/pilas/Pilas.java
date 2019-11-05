package pilas;
import javax.swing.JOptionPane;
/**
 *
 * @author ms324
 */
public class Pilas {


    public static void main(String[] args) {
        int pila[] = new int[10];
        int opc;
        pila objPilaEnteros = new pila(pila);
        objPilaEnteros.insertar(90);
        objPilaEnteros.insertar(56);
        objPilaEnteros.insertar(23);
        objPilaEnteros.insertar(12);
        String res = JOptionPane.showInputDialog("¿DESEA REALIZAR UNA PILA? \n ------SI O NO------");
        if (res.equalsIgnoreCase("SI")) {
            do {

                opc = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONA LA OPERCACIÓN A REALIZAR \n1) INSERTAR \n2) RETIRAR \n"
                        + "3)MOSTRAR PILA \n4) CIMAS  \n5) FONDOS \n6) SALIR"));
                switch (opc) {
                    case 1:
                        int dato = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE UN DATO"));
                        objPilaEnteros.insertar(dato);
                        break;
                    case 2:
                        objPilaEnteros.retirar();
                        break;
                    case 3:
                        objPilaEnteros.mostrarPila();
                        break;
                    case 4:
                        objPilaEnteros.cima();
                    case 5:
                        objPilaEnteros.fondo();
                        break;
                    case 6:
                        System.exit(0);
                }
            } while (res != String.valueOf(6));
        } else {
            System.exit(0);
        }

    }

}
        
