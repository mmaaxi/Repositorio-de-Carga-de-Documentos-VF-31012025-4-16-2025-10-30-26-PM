Feature: Validar carga de documento con formato PDF correcto

  Scenario: El usuario carga un documento PDF válido
    Given El usuario está en la página de carga de documentos
    When El usuario selecciona el botón de 'Cargar documento'
    Then El sistema muestra el formulario para seleccionar un archivo
    When El usuario selecciona un archivo PDF válido desde el sistema de archivos
    Then El campo de archivo acepta el documento y muestra el nombre del archivo
    When El usuario hace clic en 'Subir documento'
    Then El sistema sube el archivo y muestra un mensaje de confirmación de carga exitosa