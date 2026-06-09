# 🚀 Guía de Trabajo - Proyecto ClothWise

Bienvenido al repositorio del proyecto **ClothWise**.

Este archivo sirve como guía para que todos los participantes puedan trabajar correctamente con **Git** y **GitHub**, aunque no tengan mucha experiencia previa.

El objetivo es que cada integrante sepa:

* Cómo descargar el proyecto.
* En qué rama debe trabajar.
* Dónde debe modificar archivos.
* Cómo guardar sus cambios.
* Cómo subir sus avances a GitHub.
* Qué cosas debe evitar para no generar conflictos.

---

# 📌 Información del Proyecto

**Nombre del proyecto:** ClothWise
**Repositorio:** `ProyectoIntegrador-ClothWise`
**Rama principal:** `master`

El proyecto está dividido en dos partes:

```bash
ProyectoIntegrador-ClothWise/
├── FrontEnd/          # Parte visual del sistema
├── BackEnd/
│   └── sistema/       # Parte lógica del sistema
└── README.md
```

---

# 🧩 ¿Cómo se organiza el trabajo?

Para evitar que todos trabajen sobre los mismos archivos al mismo tiempo, se usarán ramas separadas.

## Ramas del proyecto

| Rama     | ¿Quién la usa?  | Carpeta donde debe trabajar |
| -------- | --------------- | --------------------------- |
| `vista`  | Equipo Frontend | `FrontEnd/`                 |
| `logica` | Equipo Backend  | `BackEnd/sistema/`          |
| `master` | Administrador   | Rama principal del proyecto |

---

# ⚠️ Reglas importantes

Antes de empezar, ten en cuenta estas reglas:

1. No trabajes directamente en la rama `master`.
2. Si eres de Frontend, trabaja en la rama `vista`.
3. Si eres de Backend, trabaja en la rama `logica`.
4. No modifiques archivos de la carpeta que no te corresponde.
5. Antes de subir cambios, revisa bien qué archivos modificaste.
6. Si tienes dudas, pregunta antes de hacer `push`.

---

# 🛠️ Requisitos antes de empezar

Cada integrante debe tener instalado:

* Git
* Visual Studio Code
* Node.js, si trabajará en Frontend
* Java y Maven, si trabajará en Backend
* Una cuenta de GitHub

También se recomienda tener Git configurado con tu nombre y correo.

Para configurar tu nombre:

```bash
git config --global user.name "Tu Nombre"
```

Para configurar tu correo:

```bash
git config --global user.email "tu_correo@gmail.com"
```

---

# 📥 Paso 1: Descargar el proyecto

Abre una terminal en la carpeta donde quieras guardar el proyecto.

Ejecuta este comando:

```bash
git clone https://github.com/ForeverDefeat/ProyectoIntegrador-ClothWise.git
```

Luego entra a la carpeta del proyecto:

```bash
cd ProyectoIntegrador-ClothWise
```

---

# 🌿 Paso 2: Entrar a tu rama de trabajo

Antes de modificar archivos, debes cambiarte a la rama que te corresponde.

---

## Si eres del equipo Frontend

Ejecuta:

```bash
git checkout vista
```

Luego actualiza la rama:

```bash
git pull origin vista
```

Debes trabajar solo dentro de esta carpeta:

```bash
FrontEnd/
```

---

## Si eres del equipo Backend

Ejecuta:

```bash
git checkout logica
```

Luego actualiza la rama:

```bash
git pull origin logica
```

Debes trabajar solo dentro de esta carpeta:

```bash
BackEnd/sistema/
```

---

# 📂 Paso 3: Abrir el proyecto en Visual Studio Code o en su IDE

Desde la carpeta principal del proyecto, ejecuta:

```bash
code .
```

Esto abrirá el proyecto completo en Visual Studio Code.

---

# ▶️ Paso 4: Ejecutar el proyecto

## Ejecutar Frontend

Entra a la carpeta del Frontend:

```bash
cd FrontEnd
```

Instala las dependencias:

```bash
npm install
```

Ejecuta el proyecto:

```bash
npm run dev
```

---

## Ejecutar Backend

Entra a la carpeta del Backend:

```bash
cd BackEnd/sistema
```

Ejecuta el proyecto en Windows:

```bash
mvnw.cmd spring-boot:run
```

En Linux o macOS:

```bash
./mvnw spring-boot:run
```

---

# 💾 Paso 5: Guardar tus cambios

Cuando termines una tarea, primero revisa qué archivos modificaste.

```bash
git status
```

Este comando muestra los archivos que cambiaste.

---

## Agregar los archivos modificados

```bash
git add .
```

Este comando prepara tus archivos para guardarlos en Git.

---

## Crear un commit

Un commit es como guardar una versión de tu trabajo.

Ejemplo para Frontend:

```bash
git commit -m "feat: se agregó pantalla de login"
```

Ejemplo para Backend:

```bash
git commit -m "feat: se agregó endpoint de productos"
```

---

# ☁️ Paso 6: Subir tus cambios a GitHub

Si trabajas en Frontend:

```bash
git push origin vista
```

Si trabajas en Backend:

```bash
git push origin logica
```

---

# 🧪 Flujo completo para Frontend

```bash
git checkout vista
git pull origin vista

cd FrontEnd

# Aquí realizas tus cambios

git status
git add .
git commit -m "feat: descripción del cambio"
git push origin vista
```

---

# 🧪 Flujo completo para Backend

```bash
git checkout logica
git pull origin logica

cd BackEnd/sistema

# Aquí realizas tus cambios

git status
git add .
git commit -m "feat: descripción del cambio"
git push origin logica
```

---

# 👑 Guía para el Administrador

El administrador es la persona encargada de unir los avances de Frontend y Backend en la rama principal `master`.

Los demás integrantes no deben hacer cambios directamente en `master`.

---

## Crear las ramas si todavía no existen

### Crear rama para Frontend

```bash
git checkout master
git pull origin master
git checkout -b vista
git push origin vista
```

---

### Crear rama para Backend

```bash
git checkout master
git pull origin master
git checkout -b logica
git push origin logica
```

---

# 🔀 Unir ramas usando GitHub

La forma recomendada es usar Pull Request.

## Para unir la rama `vista`

1. Entra al repositorio en GitHub.
2. Ve a la pestaña **Pull Requests**.
3. Haz clic en **New Pull Request**.
4. Configura:

```text
base: master <- compare: vista
```

5. Revisa que no existan conflictos.
6. Haz clic en **Create Pull Request**.
7. Revisa los archivos modificados.
8. Haz clic en **Merge Pull Request**.

---

## Para unir la rama `logica`

Repite el mismo proceso, pero usando:

```text
base: master <- compare: logica
```

---

# 🔀 Unir ramas usando consola

Si el administrador quiere unir las ramas desde su computadora, puede hacer lo siguiente:

```bash
git checkout master
git pull origin master
git merge vista
git merge logica
git push origin master
```

---

# 🧾 Mensajes recomendados para commits

Usa mensajes cortos, claros y fáciles de entender.

Formato recomendado:

```bash
git commit -m "tipo: descripción del cambio"
```

Ejemplos:

```bash
git commit -m "feat: se agregó formulario de login"
git commit -m "fix: se corrigió error en el menú"
git commit -m "docs: se actualizó el README"
git commit -m "style: se mejoró el diseño del navbar"
git commit -m "refactor: se ordenó el código del backend"
```

---

# 📚 Tipos de commits más usados

| Tipo       | Uso                                |
| ---------- | ---------------------------------- |
| `feat`     | Nueva funcionalidad                |
| `fix`      | Corrección de error                |
| `docs`     | Cambios en documentación           |
| `style`    | Cambios visuales o de formato      |
| `refactor` | Reorganización o mejora del código |
| `test`     | Pruebas                            |
| `chore`    | Configuración o mantenimiento      |

---

# 🚫 Cosas que debes evitar

No hagas esto:

```bash
git push origin master
```

A menos que seas el administrador y sepas exactamente lo que estás haciendo.

Tampoco trabajes en carpetas que no te corresponden.

Si eres Frontend, evita modificar:

```bash
BackEnd/
```

Si eres Backend, evita modificar:

```bash
FrontEnd/
```

---

# 🆘 Problemas comunes

## Me sale error al hacer `git checkout vista`

Puede que la rama todavía no exista en tu computadora.

Ejecuta:

```bash
git fetch origin
git checkout vista
```

---

## Me sale error al hacer `git pull`

Puede que tengas cambios sin guardar.

Primero revisa:

```bash
git status
```

Si tienes cambios, guárdalos con un commit antes de hacer `pull`.

---

## No sé en qué rama estoy

Ejecuta:

```bash
git branch
```

La rama actual aparecerá marcada con un asterisco `*`.

---

## Quiero cambiarme a otra rama

Ejecuta:

```bash
git checkout nombre-de-la-rama
```

Ejemplo:

```bash
git checkout vista
```

---

# ✅ Recomendación final

Antes de empezar a trabajar cada día, ejecuta:

```bash
git pull origin nombre-de-tu-rama
```

Ejemplo para Frontend:

```bash
git pull origin vista
```

Ejemplo para Backend:

```bash
git pull origin logica
```

Esto ayuda a tener los últimos cambios del equipo y evita conflictos.

---

# 🙌 Gracias por colaborar

Gracias por formar parte del desarrollo de **ClothWise**.

Si tienes dudas con Git, GitHub o algún comando, consulta con el administrador del proyecto antes de subir cambios.
