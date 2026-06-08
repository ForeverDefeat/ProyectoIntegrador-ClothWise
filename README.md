# ClothWise - Sistema de Gestion de Inventario para tienda de moda

ClothWise es un proyecto universitario orientado a la gestion de inventario y ventas para una tienda de ropa. 
Este repositorio parte con la estructura inicial del sistema y sera construido por hitos para evidenciar el avance desde una base minima hasta una version funcional.

## Estado Inicial

Este primer commit corresponde a la preparacion del proyecto:

- Backend inicializado con Spring Boot.
- Frontend inicializado con React, Vite y TypeScript.
- Repositorio preparado para evolucionar por modulos funcionales.
- Arquitectura planificada por capas y modulos.

## Estructura Esperada

```text
.
├── sistema-inventario/   # Backend Spring Boot
└── omg-moda-front/       # Frontend React + Vite + TypeScript

```

## Stack Tecnico Planeado

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

El sistema permitira administrar:

- Usuarios y autenticacion.
- Productos y variantes por talla/color.
- Movimientos de inventario.
- Registro de ventas.
- Consulta de stock y reportes basicos.

## Comandos Iniciales

Backend:

```
powershell
cd sistema-inventario
mvnw.cmd spring-boot:run
```

Frontend:

```
powershell
cd omg-moda-front
npm install
npm run dev
```

## Plan De Avance

El desarrollo se organizara en commits por hitos:

1. Inicializacion del backend y frontend.
2. Configuracion de base de datos y validaciones.
3. Autenticacion con JWT.
4. Modulo de productos.
5. Modulo de inventario.
6. Modulo de ventas.
7. Integracion frontend-backend.
8. Documentacion, pruebas y entrega final.

## Nota

Este README representa el punto de partida del proyecto. Las secciones se iran ampliando conforme se agreguen modulos, endpoints, pantallas y pruebas.
