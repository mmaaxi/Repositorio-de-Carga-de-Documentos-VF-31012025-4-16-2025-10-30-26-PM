Feature: Validar carga simultánea de múltiples documentos

  Escenario: Subir múltiples documentos PDF
    Dado que el usuario selecciona varios documentos PDF válidos
    Cuando el usuario ejecuta el proceso de carga por lotes
    Entonces el sistema permite la selección múltiple sin errores
    Y se muestran mensajes de confirmación individualmente para cada archivo