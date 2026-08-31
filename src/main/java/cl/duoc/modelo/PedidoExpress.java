package cl.duoc.modelo;

public class PedidoExpress extends Pedido {

    private String tipoCompra;

    public PedidoExpress(
            int numeroPedido,
            String cliente,
            String tipoCompra) {

        super(numeroPedido, cliente);

        this.tipoCompra = tipoCompra;
    }

    @Override
    public void asignarRepartidor() {

        repartidor = "Pedro";

        System.out.println(
                "Pedido express asignado automáticamente a: "
                        + repartidor
        );
    }

    @Override
    public int calcularTiempoEntrega() {

        return 20;
    }

    @Override
    public void mostrarResumen() {

        System.out.println("\n=== PEDIDO EXPRESS ===");

        super.mostrarResumen();

        System.out.println("Tipo de compra: " + tipoCompra);
        System.out.println(
                "Tiempo estimado: "
                        + calcularTiempoEntrega()
                        + " minutos"
        );
    }
}