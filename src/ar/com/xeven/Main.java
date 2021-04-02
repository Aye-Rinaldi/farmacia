package ar.com.xeven;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        /*
        En una farmacia se tienen Clientes que ingresan a una
        cola para ser atendidos.
        La farmacia atiende con menor prioridad a los particulares.
        Clientes pueden ser jubilados, embarazadas, particulares o afiliados.
         */

        Queue<Cliente> cola = new PriorityQueue<>();

        cola.add(new Cliente("jubilado","juan"));
        cola.add(new Cliente("particular","pablo"));
        cola.add(new Cliente("embarazada","martha"));
        cola.add(new Cliente("particular","luciana"));

        System.out.println("Cantidad de clientes en espera: "+cola.size());
        for (Cliente c:cola){
            System.out.println("Siguiente: "+c.getNombre()+" -"+c.getPrioridad());
        }

    }
}
