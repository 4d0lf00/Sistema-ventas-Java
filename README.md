# 📊 Sistema de Ventas en Java

Sistema de gestión de ventas desarrollado en Java con arquitectura MVC (Modelo-Vista-Controlador) y base de datos relacional.

## 📋 Tabla de Contenidos
- [Características](#características)
- [Tecnologías](#tecnologías)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Requisitos Previos](#requisitos-previos)
- [Instalación](#instalación)
- [Configuración de Base de Datos](#configuración-de-base-de-datos)
- [Uso](#uso)
- [Documentación](#documentación)

## ✨ Características

- **👥 Gestión de Usuarios**: Control de acceso y permisos
- **📦 Gestión de Productos**: CRUD completo de productos
- **🛒 Gestión de Ventas**: Proceso completo de ventas
- **📊 Reportes**: Generación de informes y estadísticas
- **🔐 Sistema de Autenticación**: Login seguro de usuarios
- **🎨 Interfaz Gráfica**: Diseño intuitivo con Java Swing

## 🛠️ Tecnologías

- Java JDK 8+
- MySQL/MariaDB
- Java Swing
- NetBeans IDE
- Patrón MVC

## 📁 Estructura del Proyecto

```
SistemaVentas/
├── src/
│   ├── Conexion/
│   │   └── Conexion.java           # Gestión de conexión a BD
│   ├── Controlador/
│   │   ├── ProductoController.java # Lógica de productos
│   │   └── VentaController.java    # Lógica de ventas
│   ├── Modelo/
│   │   ├── Producto.java          # Entidad Producto
│   │   ├── Usuario.java           # Entidad Usuario
│   │   └── Venta.java            # Entidad Venta
│   └── Vista/
│       ├── Principal.java         # Ventana principal
│       └── Principal.form         # Diseño de interfaz
├── image/                         # Recursos gráficos
│   ├── carro.jpg
│   └── img24.jpg
├── build/                        # Archivos compilados
├── nbproject/                    # Configuración NetBeans
├── Script Base datos.txt         # Script SQL
└── README.md                     # Documentación
```

## ⚙️ Requisitos Previos

1. JDK 8 o superior
2. NetBeans IDE
3. Servidor MySQL/MariaDB
4. Conector JDBC para MySQL

## 🚀 Instalación

1. **Clonar el repositorio**
```bash
git clone [URL_del_repositorio]
cd SistemaVentas
```

2. **Abrir el proyecto**
- Abrir NetBeans IDE
- File -> Open Project
- Seleccionar la carpeta del proyecto

3. **Instalar dependencias**
- Asegurarse de que el conector JDBC está incluido en las librerías

## 💾 Configuración de Base de Datos

1. **Crear la base de datos**
```sql
CREATE DATABASE sistema_ventas;
```

2. **Ejecutar script**
- Abrir el archivo `Script Base datos.txt`
- Ejecutar el script en su gestor de base de datos

3. **Configurar conexión**
- Abrir `src/Conexion/Conexion.java`
- Modificar las credenciales de conexión:
```java
private String url = "jdbc:mysql://localhost:3306/sistema_ventas";
private String user = "tu_usuario";
private String pass = "tu_contraseña";
```

## 📱 Uso

1. **Iniciar la aplicación**
- Ejecutar `src/Vista/Principal.java`
- Ingresar credenciales de usuario

2. **Módulos principales**
- Gestión de Productos
- Registro de Ventas
- Reportes
- Administración de Usuarios

## 📖 Documentación

### Módulos Principales

1. **Productos**
   - Agregar, editar y eliminar productos
   - Gestionar inventario
   - Búsqueda y filtrado

2. **Ventas**
   - Crear nueva venta
   - Selección de productos
   - Cálculo automático de totales
   - Generación de comprobante

3. **Usuarios**
   - Gestión de permisos
   - Registro de nuevos usuarios
   - Control de acceso

### Base de Datos
La estructura de la base de datos incluye las siguientes tablas:
- `usuarios`
- `productos`
- `ventas`
- `detalle_venta`

## 🤝 Soporte

Para soporte y consultas:
- Crear un issue en el repositorio
- Contactar al equipo de desarrollo

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.
