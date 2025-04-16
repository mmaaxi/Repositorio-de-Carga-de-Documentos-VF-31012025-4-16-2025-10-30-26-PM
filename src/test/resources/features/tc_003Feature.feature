Feature: Verificar límite de tamaño de archivo permitido

  Scenario: Usuario intenta cargar un archivo que excede el límite de tamaño permitido
    Given el usuario está en la página de carga de documentos
    When selecciona la opción 'Cargar documento'
    Then el formulario carga correctamente
    When selecciona un archivo que excede el límite de tamaño permitido
    Then el sistema rechaza el archivo
    And muestra un mensaje indicando que el tamaño excede el límite