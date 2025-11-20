   # 🌋 Proyecto de Gestión de Criaturas Elementales

Sistema para registrar, entrenar y controlar criaturas con afinidades elementales (Fuego, Agua, Aire y Tierra).  
Los maestros pueden entrenar y transformar criaturas aplicando principios de Programación Orientada a Objetos.

---

## 📘 Características Principales

- Herencia, clases abstractas e interfaces.
- Uso de colecciones (`HashMap`).
- Manejo de excepciones *checked* y *unchecked*.
- Desarrollo guiado por pruebas (TDD con JUnit 4).
- Trabajo colaborativo con Git y GitHub.

---

## 🐲 Tipos de Criaturas

### Salvajes
- Aumentan energía con riesgo de superarla.
- Pueden lanzar `EnergiaExcedidaException`.

### Domesticadas
- Aumentan energía de manera estable.

### Ancestrales
- Muy potentes.
- Se estabilizan con entrenamiento.

---

## 🔁 Transformaciones

### Llama Interna 🔥
- Suma energía si la criatura es de Fuego.
- Si no, queda inestable.

### Bendición del Río 💧
- Duplica energía sin superar 180.

### Vínculo Terrestre 🪨
- La energía nunca baja de 50.

### Ascenso del Viento 🌬️
- Convierte temporalmente la afinidad a AIRE.

---

## 🤝 Interacciones entre Criaturas

- Afinidades iguales → ambas ganan energía.
- Afinidades opuestas → ambas quedan inestables.
- Si una es ancestral:
  - La ancestral gana 20 de energía.
  - La otra pierde 15 (mínimo 0).

---

## 📊 Reportes del Consejo

- Listar todas las criaturas registradas por todos los maestros.
- Obtener la criatura con mayor energía.
- Determinar qué maestro tiene más criaturas transformadas.
- Obtener un mapa con la cantidad de criaturas por afinidad.

---

## ❗ Excepciones

- `EnergiaExcedidaException`: cuando se supera el límite de energía.
- `FaltaDeMaestriaException`: cuando un maestro no tiene suficiente nivel.

---

## 🧪 Tests Incluidos

- Entrenamiento y pacificación.
- Transformaciones.
- Interacciones entre criaturas.
- Reportes del consejo.
- Manejo de errores y validación de reglas.

---

## 👥 Autores

- Emanuel Ruiz Díaz  
- Juan Manuel Pena
