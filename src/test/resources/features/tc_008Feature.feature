Feature: Validar la funcionalidad de reintentos al fallar la carga

  Scenario: Simular falla en la red y reintentar la carga.
    Given la aplicación está cargando un documento
    When se simula una falla en la red
    Then el sistema muestra un mensaje de error y opción para reintentar

    When hago clic en 'Reintentar carga'
    Then el sistema reintenta la carga del documento exitosamente si la red se recupera