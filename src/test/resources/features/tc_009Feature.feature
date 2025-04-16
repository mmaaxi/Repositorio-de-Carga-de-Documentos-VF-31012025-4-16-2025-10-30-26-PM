Feature: Verificar la indexación y recuperación del documento

  Scenario: Cargar y buscar un documento PDF
    Given El usuario carga un documento PDF válido
    When El sistema procesa e indexa el documento
    Then El usuario utiliza la función de búsqueda para localizar el documento
    And El documento se encuentra en los resultados de búsqueda