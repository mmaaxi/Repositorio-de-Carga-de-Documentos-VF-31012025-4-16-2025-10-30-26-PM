Feature: Validar rechazo de formato no permitido (JPG en lugar de PDF)

  Scenario: Intentar subir archivo con formato JPG
    Given que estoy en la página de carga de documentos
    When selecciono el botón 'Cargar documento'
    Then se despliega el formulario de carga
    When selecciono un archivo JPG incorrecto
    Then el sistema muestra un error indicando formato no permitido
    When intento subir el archivo
    Then el archivo no se sube y se mantiene en el formulario un mensaje de error