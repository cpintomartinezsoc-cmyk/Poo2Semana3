<img width="488" height="157" alt="image" src="https://github.com/user-attachments/assets/84f38ea1-be00-42e3-96f5-818ed2c6c512" />

# 🧠 Actividad Formativa – Implementando clases abstractas, polimorfismo e interfaces 👤

**Nombre completo:** Camilo Pinto
**Carrera:** Analista Programador
**Asignatura:** Desarrollo Orientado a Objetos II
**Caso:** SpeedFast

---

# 📘 Descripción general del sistema

Este proyecto corresponde a una actividad de la asignatura **Desarrollo Orientado a Objetos II**.

El sistema representa distintos tipos de pedidos de la empresa de reparto a domicilio **SpeedFast**, utilizando conceptos fundamentales de la Programación Orientada a Objetos.

En esta actividad se trabaja principalmente con:

* **Clases abstractas**
* **Herencia**
* **Métodos abstractos**
* **Sobreescritura de métodos**
* **Polimorfismo**
* **Interfaces**
* **Implementación de interfaces**
* **Constructores**
* **Uso de `super()`**
* **Modificador de acceso `protected`**

SpeedFast ofrece tres tipos de pedidos:

* **Comida:** pedidos provenientes de restaurantes.
* **Encomienda:** documentos o paquetes.
* **Compra Express:** compras de supermercado o farmacia.

Cada tipo de pedido posee una lógica diferente para calcular su tiempo estimado de entrega.

Además, el sistema incorpora interfaces que permiten definir comportamientos específicos relacionados con el **despacho, cancelación y rastreo** de los pedidos.

---

# 🧱 Estructura del proyecto

```text
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
```

---

# 📂 Descripción de las clases

## 📦 Pedido

Clase **abstracta** que representa un pedido genérico de SpeedFast.

Esta clase contiene la información común que poseen todos los tipos de pedidos y establece los comportamientos que deben implementar sus clases derivadas.

### Atributos

* **`idPedido`**
* **`direccionEntrega`**
* **`distanciaKm`**
* **`tipoPedido`**

Los atributos utilizan el modificador **`protected`**, permitiendo que las clases hijas puedan acceder directamente a ellos.

La clase `Pedido` también contiene el método abstracto **`calcularTiempoEntrega()`**, permitiendo que cada tipo de pedido implemente su propia lógica de cálculo.

---

## 🍔 PedidoComida

Clase que **hereda de `Pedido`** mediante `extends`.

Representa los pedidos provenientes de restaurantes.

Esta clase sobrescribe el método **`calcularTiempoEntrega()`** utilizando `@Override`, estableciendo la lógica correspondiente al tiempo estimado de entrega de los pedidos de comida.

---

## 📦 PedidoEncomienda

Clase que **hereda de `Pedido`** mediante `extends`.

Representa documentos o paquetes que deben ser entregados mediante el servicio de encomiendas.

Esta clase sobrescribe el método **`calcularTiempoEntrega()`** utilizando `@Override`, estableciendo la lógica correspondiente al tiempo estimado de entrega de una encomienda.

---

## 🛒 PedidoExpress

Clase que **hereda de `Pedido`** mediante `extends`.

Representa las compras realizadas mediante el servicio de **Compras Express**, como compras de supermercado o farmacia.

Esta clase sobrescribe el método **`calcularTiempoEntrega()`** utilizando `@Override`, estableciendo la lógica correspondiente al tiempo estimado de entrega de este tipo de pedido.

---

# 🔌 Interfaces

Las interfaces se encuentran dentro del paquete **`cl.duoc.Interfaz`**.

Estas permiten definir comportamientos específicos que pueden ser implementados por las diferentes clases de pedidos.

En este proyecto se utilizan tres interfaces:

* **`Despachable`**
* **`Cancelable`**
* **`Rastreable`**

El uso de interfaces permite separar determinados comportamientos de la estructura principal de las clases y aplicar **polimorfismo**.

---

## 🚚 Despachable

La interfaz **`Despachable`** representa el comportamiento asociado al despacho de un pedido.

Las clases que implementan esta interfaz deben definir el método correspondiente al despacho.

La implementación se realiza mediante:

```java
implements Despachable
```

---

## ❌ Cancelable

La interfaz **`Cancelable`** representa el comportamiento asociado a la cancelación de un pedido.

Permite establecer un comportamiento común para los pedidos que pueden ser cancelados.

Las clases que implementan esta interfaz deben proporcionar la implementación correspondiente utilizando **`@Override`**.

---

## 📍 Rastreable

La interfaz **`Rastreable`** representa el comportamiento asociado al seguimiento o rastreo de un pedido.

Permite establecer un comportamiento común para los pedidos cuyo estado o ubicación puede ser consultado.

Las clases que implementan esta interfaz deben proporcionar la implementación correspondiente utilizando **`@Override`**.

---

# 🖥️ Main

Clase principal del proyecto.

Su función consiste en crear objetos de los diferentes tipos de pedidos y probar los métodos implementados.

### Funciones principales

* Crear un objeto **`PedidoComida`**.
* Crear un objeto **`PedidoEncomienda`**.
* Crear un objeto **`PedidoExpress`**.
* Utilizar referencias de tipo **`Pedido`**.
* Utilizar los comportamientos definidos mediante interfaces.
* Ejecutar el método **`mostrarResumen()`**.
* Ejecutar el método **`calcularTiempoEntrega()`**.
* Ejecutar los métodos relacionados con **despacho, cancelación y rastreo**.
* Mostrar en consola el tiempo estimado de cada pedido.
* Comprobar el comportamiento **polimórfico** de los diferentes tipos de pedidos.

---

# 🔹 Método abstracto

La clase `Pedido` contiene el método:

```java
public abstract int calcularTiempoEntrega();
```

Un **método abstracto** no posee implementación en la clase padre.

Las clases hijas deben implementar este método utilizando **`@Override`**.

Esto permite que cada tipo de pedido tenga una lógica diferente para calcular su tiempo de entrega.

---

# 🔄 Herencia

Las clases:

```text
PedidoComida
PedidoEncomienda
PedidoExpress
```

heredan de `Pedido` utilizando:

```java
extends Pedido
```

De esta forma, las clases hijas reciben los atributos y métodos definidos en la clase padre y pueden agregar o modificar comportamientos específicos.

---

# 🔁 Polimorfismo

El sistema utiliza **polimorfismo** al trabajar con referencias de tipo `Pedido` para almacenar objetos de las clases hijas.

Por ejemplo:

```java
Pedido pedido = new PedidoComida(...);
```

Aunque la referencia es de tipo `Pedido`, el método **`calcularTiempoEntrega()`** ejecutado corresponde a la implementación de la clase `PedidoComida`.

De esta forma, una misma referencia de tipo `Pedido` puede utilizarse para trabajar con diferentes tipos de pedidos.

También se aplica polimorfismo mediante las **interfaces**, permitiendo trabajar con objetos según los comportamientos que implementan.

---

# 🔌 Implementación de interfaces

Las interfaces utilizadas en el proyecto son:

```text
Despachable
Cancelable
Rastreable
```

Estas permiten incorporar **comportamientos específicos** a los pedidos.

Las clases que implementan una interfaz utilizan la palabra reservada:

```java
implements
```

y deben sobrescribir los métodos definidos por la interfaz utilizando:

```java
@Override
```

Esto permite que diferentes clases puedan compartir determinados comportamientos sin necesidad de pertenecer a una misma jerarquía de herencia para cada uno de ellos.

---

# ▶️ Instrucciones para ejecutar el proyecto

1. **Clonar el repositorio desde GitHub.** https://github.com/cpintomartinezsoc-cmyk/Poo2Sumativa1.git
2. **Abrir el proyecto en IntelliJ IDEA.**
3. Verificar que todas las clases se encuentren organizadas en sus respectivos paquetes.
4. Ejecutar la clase:

```text
cl.duoc.app.Main
```

5. **Revisar los resultados mostrados en la consola.**
6. Comparar los tiempos estimados de entrega correspondientes a cada tipo de pedido.
7. Comprobar el comportamiento polimórfico de las clases.
8. Verificar el funcionamiento de las interfaces implementadas.

---

# 🔗 Repositorio GitHub

**Repositorio:** `POO2ActividadS2`

**URL:**
https://github.com/cpintomartinezsoc-cmyk/Poo2Sumativa1.git

**Fecha de entrega:** 31/08/2026

