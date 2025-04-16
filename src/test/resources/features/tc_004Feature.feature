Feature: Validar integridad del documento después de la carga

  Scenario: Verificar que un documento PDF se carga y abre correctamente
    Given El usuario ha accedido a la página de carga de documentos
    When El usuario carga un documento PDF válido
    Then El sistema debe procesar el documento sin errores
    When El usuario abre el documento cargado desde el repositorio
    Then El documento debe visualizarse correctamente y preservar el formato original