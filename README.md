🌋 Proyecto de Gestión de Criaturas Elementales
🧠 Descripción

Sistema para registrar, entrenar y controlar criaturas con afinidades elementales: Fuego, Agua, Aire y Tierra.
Los maestros pueden entrenar y transformar criaturas utilizando principios de Programación Orientada a Objetos.

🎯 Objetivos del Trabajo Práctico

Usar herencia, clases abstractas e interfaces.

Implementar colecciones como HashMap.

Manejar excepciones checked y unchecked.

Aplicar TDD con JUnit 4.

Utilizar Git y GitHub para trabajo colaborativo.

✅ Funcionalidades Implementadas
📦 Criaturas

Salvajes: Aumentan su energía con riesgo de superarla (lanza excepción).

Domesticadas: Aumentan energía de forma estable.

Ancestrales: Muy potentes, se estabilizan con entrenamiento.

🔁 Transformaciones

LlamaInterna: Suma energía si es de fuego; si no, queda inestable.

BendicionDelRio: Duplica la energía sin superar 180.

VinculoTerrestre: La energía nunca queda bajo 50.

AscensoDelViento: Convierte temporalmente a tipo Aire.

🤝 Interacciones entre Criaturas

Afinidades iguales → ambas ganan energía.

Afinidades opuestas → se vuelven inestables.

Si una es ancestral → gana energía y la otra pierde.

📊 Reportes del Consejo

Listar todas las criaturas.

Obtener la criatura con más energía.

Saber qué maestro tiene más criaturas transformadas.

Mapear cuántas criaturas hay por afinidad.

❗ Excepciones

EnergiaExcedidaException: cuando se supera el límite permitido.

FaltaDeMaestriaException: cuando un maestro sin nivel intenta entrenar.

📚 Tests

Entrenamiento y pacificación.

Transformaciones y su comportamiento.

Reportes e interacciones.

Manejo de errores.

👥 Autores

Emanuel Ruiz Díaz

Juan Manuel Pena
