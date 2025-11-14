# 📘 Proyecto: Lectura archivo TXT - Centros de Cultivo

## 📝 Descripción general del sistema
Este proyecto corresponde a la evaluación formativa del segundo bimestre correspondiente a la asignatura *Desarrollo Orientado a Objetos I*.

El objetivo del proyecto consta en desarrollar una aplicacion Java para gestionar y visualizar los datos de produccion de los centros de cultivo de la empresa Salmontt, especializada en la producción y exportación de productos del sur de chile (especialmente salmones).

Las funciones principales del sistema son las siguientes:

- Lectura automatica de un archovos de texto plano, el cual contiene informacion estructurada de cada centro de cultivo (id, nombre, comuna, produccion en toneladas).
- Conversion y alamcenamiento de cada registro leido en objetos de la clase **ProduccionCultivos**.
- Presentación y visualización de todos los centors de cultivos registrados de forma legible por consola.
- Contiene validaciones de formato de los datos y notificaciones claras en caso de errores o problemas al leer el archivo.

Resumen

El proyecto es una aplicacion de consola Java,con estructura modular y buenas practicas de manejo de datos, pensada para automatizar la gestion y análisis inicial de la produccion de centros de cultivo, priorizando claridad, robustez y base escalable para futuras mejoras.

---

## 🧱 Estructura general del proyecto

```
📦 Salmontt-Colecciones/
┣ 📂 .idea/
┣ 📂 resources/
┃ ┃ ┣ 📜 Cultivos.txt	
┣ 📂 src/
┃ ┣ 📂 data/
┃ ┃ ┣ 📜 GestorDatos
┃ ┣ 📂 model/					
┃ ┃ ┣ 📜 ProduccionCultivos
┃ ┣ 📂 ui/					
┃ ┃ ┣ 📜 Main
┣ 📜 .gitignore
┃ 📜 README.md
┗ 📜 cl.duoc.SalmonttApp.iml

```

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

### 1. clonar el repositorio
```bash
git clone https://github.com/matisuarezm/Salmontt-Colecciones.git
```
### 2. Abre el proyecto en tu IDE Favorito, éste fue creado en IntelliJ.
### 3. Abre la clase Main del paquete app/
### 4. Puedes ejecutar el proyecto.

- Nota: La clase Main ya trae algunos ejemplos que se mostraran por consola.

---

## 📚 Caso Planteado

Salmontt es una empresa salmonera con sede en Puerto Montt, dedicada desde hace más de 15 años a la producción, procesamiento y exportación de salmón. Su crecimiento sostenido la ha posicionado como un actor relevante en la industria acuícola del sur de Chile, con múltiples centros de cultivo, plantas de proceso y una red logística nacional e internacional.

### Problematica

La empresa necesita cargar desde un archivo los centros de cultivo con su nombre, comuna y toneladas producidas, para luego identificar los de mayor producción.

---

## 👤 Autor del proyecto
- **Nombre completo:** Matias Suarez M.
- **Sección:** 003A
- **Carrera:** Analista Programador Computacional
- **Sede:** Carrera 100% Online