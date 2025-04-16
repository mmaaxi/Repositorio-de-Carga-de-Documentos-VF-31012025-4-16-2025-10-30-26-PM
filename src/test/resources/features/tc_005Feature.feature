Feature: Prueba de seguridad en la carga de documentos

  Scenario: Intentar cargar un archivo malicioso y revisar los logs de seguridad
    Given el usuario está en la página de carga de documentos
    When intenta cargar un archivo malicioso
    Then el sistema detecta el contenido no permitido y rechaza la carga
    When revisa los logs de seguridad
    Then se registra la incidencia y se notifica al administrador del sistema