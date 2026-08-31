package cl.duoc.modelo;

public class PedidoComida extends Pedido {

    private String restaurante;

    public PedidoComida(
            int numeroPedido,
            String cliente,
            String restaurante) {

        super(numeroPedido, cliente);

        this.restaurante = restaurante;
    }

    @Override
    public void asignarRepartidor() {

        repartidor = "Carlos";

        System.out.println(
                "Pedido de comida asignado automáticamente a: "
                        + repartidor
        );
    }

    @Override
    public int calcularTiempoEntrega() {

        return 30;
    }

    @Override
    public void mostrarResumen() {

        System.out.println("\n=== PEDIDO DE COMIDA ===");

        super.mostrarResumen();

        System.out.println("Restaurante: " + restaurante);
        System.out.println(
                "Tiempo estimado: "
                        + calcularTiempoEntrega()
                        + " minutos"
        );
    }
}