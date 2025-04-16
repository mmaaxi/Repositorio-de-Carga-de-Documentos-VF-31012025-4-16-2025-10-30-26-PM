Feature: Verificación de estado en el seguimiento de carga

  Scenario: Verificar el estado del documento después de cargar un PDF
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento PDF
    Then el sistema debe asignar un estado inicial de 'En Proceso'
    And el usuario verifica el estado del documento en el panel de seguimiento
    Then el estado del documento debería cambiar a 'Cargado' tras completarse el proceso