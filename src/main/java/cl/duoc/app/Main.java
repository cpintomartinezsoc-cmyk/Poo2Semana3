package cl.duoc.app;

import cl.duoc.modelo.Pedido;
import cl.duoc.modelo.PedidoComida;
import cl.duoc.modelo.PedidoEncomienda;
import cl.duoc.modelo.PedidoExpress;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        System.out.println("SISTEMA SPEEDFAST");


        Pedido pedidoComida = new PedidoComida(
                1001,
                "Camilo",
                "Restaurante Volcanes"
        );

        Pedido pedidoEncomienda = new PedidoEncomienda(
                1002,
                "Vanessa",
                "Puerto Montt"
        );

        Pedido pedidoExpress = new PedidoExpress(
                1003,
                "Marcia",
                "Farmacia Rapida"
        );


        ArrayList<Pedido> pedidos = new ArrayList<>();

        pedidos.add(pedidoComida);
        pedidos.add(pedidoEncomienda);
        pedidos.add(pedidoExpress);



        System.out.println("\n=== ASIGNACIÓN AUTOMÁTICA ===");

        for (Pedido pedido : pedidos) {

            pedido.asignarRepartidor();
        }



        System.out.println("\n=== ASIGNACIÓN MANUAL ===");

        pedidoComida.asignarRepartidor("Diego");


        // Cálculo de tiempo
        System.out.println("\n=== TIEMPOS DE ENTREGA ===");

        for (Pedido pedido : pedidos) {

            System.out.println(
                    "Tiempo estimado del pedido: "
                            + pedido.calcularTiempoEntrega()
                            + " minutos."
            );
        }


        System.out.println("\n=== RESERVA DE PEDIDO ===");

        pedidoComida.reservarPedido();


        System.out.println("\n=== RESÚMENES ===");

        for (Pedido pedido : pedidos) {

            pedido.mostrarResumen();
        }


        System.out.println("\n=== DESPACHO ===");

        pedidoComida.despachar();
        pedidoEncomienda.despachar();


        System.out.println("\n=== CANCELACIÓN ===");

        pedidoExpress.cancelar();


        System.out.println("\n=== HISTORIAL ===");

        pedidoComida.verHistorial();
    }
}