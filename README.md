<img width="488" height="157" alt="image" src="https://github.com/user-attachments/assets/84f38ea1-be00-42e3-96f5-818ed2c6c512" />

🧠 Actividad Formativa – Implementando clases abstractas, polimorfismo e interfaces 👤

svg

Nombre completo: Camilo Pinto

Carrera: Analista Programador

Asignatura: Desarrollo Orientado a Objetos II

Caso: SpeedFast

📘 Descripción general del sistema

svg

Este proyecto corresponde a una actividad de la asignatura Desarrollo Orientado a Objetos II.

El sistema representa distintos tipos de pedidos de la empresa de reparto a domicilio SpeedFast, utilizando conceptos fundamentales de la Programación Orientada a Objetos.

En esta actividad se trabaja principalmente con:

Clases abstractas
Herencia
Métodos abstractos
Sobreescritura de métodos
Polimorfismo
Interfaces
Implementación de interfaces
Constructores
Uso de super()
Modificador de acceso protected

SpeedFast ofrece tres tipos de pedidos:

Comida: pedidos provenientes de restaurantes.
Encomienda: documentos o paquetes.
Compra Express: compras de supermercado o farmacia.

Cada tipo de pedido posee una lógica diferente para calcular su tiempo estimado de entrega.

Además, el sistema incorpora interfaces para representar comportamientos específicos que pueden realizar los pedidos, como ser despachados, cancelados y rastreados.

🧱 Estructura del proyecto

svg

src/
│
├── cl.duoc.model/
│   │
│   ├── Pedido.java
│   ├── PedidoComida.java
│   ├── PedidoEncomienda.java
│   └── PedidoExpress.java
│
├── cl.duoc.Interfaz/
│   │
│   ├── Despachable.java
│   ├── Cancelable.java
│   └── Rastreable.java
│
└── cl.duoc.app/
    │
    └── Main.java

svg

📂 Descripción de las clases 📦
📦 Pedido

Clase abstracta que representa un pedido genérico de SpeedFast.

Esta clase contiene la información común que poseen todos los tipos de pedidos y establece el comportamiento que deben implementar sus clases derivadas.

Atributos:

idPedido
direccionEntrega
distanciaKm
tipoPedido

Los atributos utilizan el modificador protected, permitiendo que las clases hijas puedan acceder directamente a ellos.

La clase Pedido también establece el método abstracto calcularTiempoEntrega(), permitiendo que cada tipo de pedido implemente su propia lógica.

🍔 PedidoComida

Clase que hereda de Pedido mediante extends.

Representa los pedidos provenientes de restaurantes.

Esta clase sobrescribe el método calcularTiempoEntrega() para establecer la lógica correspondiente al tiempo estimado de entrega de los pedidos de comida.

📦 PedidoEncomienda

Clase que hereda de Pedido mediante extends.

Representa documentos o paquetes que deben ser entregados mediante el servicio de encomiendas.

Esta clase sobrescribe el método calcularTiempoEntrega() para establecer la lógica correspondiente a las encomiendas.

🛒 PedidoExpress

Clase que hereda de Pedido mediante extends.

Representa las compras realizadas mediante el servicio de Compras Express, como compras de supermercado o farmacia.

Esta clase sobrescribe el método calcularTiempoEntrega() para establecer la lógica correspondiente a este tipo de pedido.

🔌 Interfaces

Las interfaces se encuentran dentro del paquete Interfaz.

Estas permiten definir comportamientos específicos que pueden ser implementados por las clases de pedidos.

El uso de interfaces permite separar el comportamiento de las características propias de cada pedido y facilita la aplicación del polimorfismo.

🚚 Despachable

La interfaz Despachable representa el comportamiento asociado al despacho de un pedido.

Las clases que implementan esta interfaz deben definir el método correspondiente al despacho.

Se utiliza mediante:

implements Despachable
❌ Cancelable

La interfaz Cancelable representa el comportamiento asociado a la cancelación de un pedido.

Permite establecer un comportamiento común para los pedidos que pueden ser cancelados.

Las clases que implementan esta interfaz deben definir el método correspondiente a la cancelación.

📍 Rastreable

La interfaz Rastreable representa el comportamiento asociado al seguimiento o rastreo de un pedido.

Permite establecer un comportamiento común para los pedidos cuyo estado o ubicación puede ser consultado.

Las clases que implementan esta interfaz deben definir el método correspondiente al rastreo.

🖥️ Main

Clase principal del proyecto.

Su función consiste en crear objetos de los diferentes tipos de pedidos y probar los métodos implementados.

Funciones principales
Crear un objeto PedidoComida.
Crear un objeto PedidoEncomienda.
Crear un objeto PedidoExpress.
Utilizar referencias de tipo Pedido.
Utilizar los comportamientos definidos mediante interfaces.
Ejecutar el método mostrarResumen().
Ejecutar el método calcularTiempoEntrega().
Ejecutar los métodos asociados al despacho, cancelación y rastreo.
Mostrar en consola el tiempo estimado de cada pedido.
Comprobar el comportamiento polimórfico de los diferentes tipos de pedidos.
🔹 Método abstracto

La clase Pedido contiene el método:

public abstract int calcularTiempoEntrega();

Un método abstracto no posee implementación en la clase padre.

Las clases hijas deben implementar este método utilizando @Override.

Esto permite que cada tipo de pedido tenga una lógica diferente para calcular su tiempo de entrega.

🔄 Herencia

Las clases:

PedidoComida
PedidoEncomienda
PedidoExpress

heredan de Pedido utilizando:

extends Pedido

De esta forma, las clases hijas reciben los atributos y métodos definidos en la clase padre y pueden agregar o modificar comportamientos específicos.

🔁 Polimorfismo

El sistema utiliza polimorfismo al trabajar con referencias de tipo Pedido para almacenar objetos de las clases hijas.

Por ejemplo:

Pedido pedido = new PedidoComida(...);

Aunque la referencia es de tipo Pedido, el método calcularTiempoEntrega() ejecutado corresponde a la implementación de la clase PedidoComida.

También se utiliza polimorfismo mediante las interfaces, permitiendo trabajar con objetos según el comportamiento que implementan, independientemente de su tipo específico.

De esta manera, una misma interfaz puede ser utilizada para trabajar con diferentes clases de pedidos que compartan un determinado comportamiento.

🔌 Implementación de interfaces

Las interfaces permiten agregar comportamientos específicos a las clases sin necesidad de establecer una relación de herencia entre ellas.

En este proyecto se utilizan:

Despachable
Cancelable
Rastreable

Estas interfaces permiten representar diferentes acciones que pueden realizar los pedidos de SpeedFast.

Cada clase que implementa una interfaz debe proporcionar la implementación de los métodos definidos en ella utilizando @Override.

▶️ Instrucciones para ejecutar el proyecto
Clonar el repositorio desde GitHub.
Abrir el proyecto en IntelliJ IDEA.
Verificar que todas las clases se encuentren organizadas en sus respectivos paquetes.
Ejecutar la clase:
cl.duoc.app.Main
Revisar los resultados mostrados en la consola.
Comparar los tiempos estimados de entrega correspondientes a cada tipo de pedido.
Comprobar el comportamiento polimórfico de las clases.
Verificar el funcionamiento de las interfaces implementadas.
🔗 Repositorio GitHub

Repositorio: POO2ActividadS2

https://github.com/cpintomartinezsoc-cmyk/Poo2Actividad2.git

Fecha de entrega: 31/08/2026
