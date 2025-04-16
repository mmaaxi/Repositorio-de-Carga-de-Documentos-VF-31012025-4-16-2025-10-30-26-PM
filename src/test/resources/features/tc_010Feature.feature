Feature: Prueba de usabilidad del módulo de carga de documentos

  Scenario: Verificar la carga y usabilidad del módulo
    Given el usuario está en la interfaz principal
    When el usuario accede al módulo de carga de documentos
    Then la interfaz se carga sin retraso y se visualizan claramente opciones y botones
    When el usuario intercambia el idioma de la interfaz
    Then el sistema adapta correctamente la visualización en el idioma seleccionado
    When el usuario finaliza la carga del documento
    Then la navegación es intuitiva y se recibe feedback visual consistente