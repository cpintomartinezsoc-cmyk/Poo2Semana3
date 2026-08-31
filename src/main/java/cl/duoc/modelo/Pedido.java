package cl.duoc.modelo;

import cl.duoc.interfaz.Cancelable;
import cl.duoc.interfaz.Despachable;
import cl.duoc.interfaz.Rastreable;

import java.util.ArrayList;

public abstract class Pedido implements Despachable, Cancelable, Rastreable {

    protected int numeroPedido;
    protected String cliente;
    protected String repartidor;
    protected boolean reservado;
    protected boolean despachado;
    protected boolean cancelado;

    protected static ArrayList<Pedido> historial = new ArrayList<>();

    public Pedido(int numeroPedido, String cliente) {

        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.repartidor = "Sin asignar";
        this.reservado = false;
        this.despachado = false;
        this.cancelado = false;
    }

    public void mostrarResumen() {

        System.out.println("Número de pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Repartidor: " + repartidor);
        System.out.println("Reservado: " + reservado);
        System.out.println("Despachado: " + despachado);
        System.out.println("Cancelado: " + cancelado);
    }

    public abstract void asignarRepartidor();

    public abstract int calcularTiempoEntrega();

    public void asignarRepartidor(String nombre) {

        repartidor = nombre;

        System.out.println("Repartidor asignado manualmente: " + repartidor);
    }

    public void reservarPedido() {

        reservado = true;

        System.out.println("Pedido " + numeroPedido + " reservado correctamente.");
    }

    @Override
    public void despachar() {

        if (cancelado) {

            System.out.println(
                    "No se puede despachar el pedido porque está cancelado."
            );

        } else {

            despachado = true;

            historial.add(this);

            System.out.println("Pedido " + numeroPedido + " despachado.");
        }
    }

    @Override
    public void cancelar() {

        if (despachado) {

            System.out.println(
                    "No se puede cancelar un pedido que ya fue despachado."
            );

        } else {

            cancelado = true;

            System.out.println("Pedido " + numeroPedido + " cancelado.");
        }
    }

    @Override
    public void verHistorial() {

        System.out.println("\n=== HISTORIAL DE ENTREGAS ===");

        if (historial.isEmpty()) {

            System.out.println("No existen entregas realizadas.");

        } else {

            for (Pedido pedido : historial) {

                System.out.println("------------------------");
                System.out.println("Pedido: " + pedido.numeroPedido);
                System.out.println("Cliente: " + pedido.cliente);
                System.out.println("Repartidor: " + pedido.repartidor);
            }
        }
    }
}