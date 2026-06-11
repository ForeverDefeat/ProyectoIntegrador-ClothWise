# ClothWise - Sistema de Gestion de Inventario para Tienda de Moda

ClothWise es un proyecto universitario orientado a la gestion de inventario, productos y ventas para una tienda de ropa. El repositorio se esta construyendo por hitos para dejar una historia tecnica clara, visible y auditable desde una base inicial hasta una version funcional.

## Estado Del Proyecto

El proyecto ya cuenta con una base organizada para backend y frontend, junto con una ruta de desarrollo por modulos. Cada avance se registra mediante commits independientes para evidenciar que el sistema evoluciona de forma progresiva.

Hitos alcanzados:

- Repositorio preparado para reconstruccion ordenada del proyecto.
- Estructura principal separada entre backend y frontend.
- Backend inicializado con Spring Boot.
- Frontend inicializado con React, Vite y TypeScript.
- README base agregado para documentar el objetivo, stack y ruta de avance.
- Plan de commits definido para construir el sistema por modulos funcionales.

## Estructura Del Proyecto

```text
.
|-- BackEnd/         # Backend Spring Boot
|-- FrontEnd/        # React + Vite + TypeScript
`-- README.md        # Documentacion general del proyecto
```

## Stack Tecnico

Backend:

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- JWT
- MySQL

Frontend:

- React
- Vite
- TypeScript
- React Router

## Objetivo Del Sistema

El sistema permitira administrar los procesos principales de una tienda de moda:

- Autenticacion de usuarios.
- Gestion de productos.
- Gestion de variantes por talla, color y material.
- Control de movimientos de inventario.
- Registro de ventas.
- Consulta de stock.
- Reportes basicos para seguimiento operativo.

## Modulos Planeados

Backend:

1. `shared`: excepciones, respuestas comunes y utilidades.
2. `usuario`: autenticacion, roles y JWT.
3. `producto`: productos y variantes.
4. `inventario`: entradas, ajustes y movimientos de stock.
5. `venta`: registro, consulta y anulacion de ventas.

Frontend:

1. `auth`: login y sesion.
2. `layout`: navegacion principal y rutas protegidas.
3. `dashboard`: resumen operativo.
4. `catalogo`: productos y variantes.
5. `inventario`: entradas y ajustes.
6. `ventas`: punto de venta.
7. `reportes`: consultas y metricas basicas.

## Comandos De Ejecucion

Backend:

```powershell
cd BackEnd\sistema\
mvnw.cmd spring-boot:run
```

Frontend:

```powershell
cd FrontEnd
npm install
npm run dev
```

## Ruta De Avance Por Hitos

El desarrollo se organiza en commits pequenos y verificables:

1. Inicializacion del repositorio, backend y frontend.
2. Configuracion de base de datos, validaciones y estructura compartida.
3. Autenticacion con JWT y seguridad por roles.
4. Modulo de productos y variantes.
5. Modulo de inventario.
6. Modulo de ventas.
7. Construccion del frontend por pantallas.
8. Integracion frontend-backend.
9. Pruebas funcionales.
10. Documentacion final de entrega.

## Nota

Este README documenta el avance actual del proyecto y se actualizara conforme se completen nuevos modulos, endpoints, pantallas y pruebas.
