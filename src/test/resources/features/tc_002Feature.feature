Feature: Validar integración con Jira

  Scenario: Validar configuración de integración con Jira
    Given que estoy en la página de configuración de integración
    When configuro la integración con Jira
    Then la integración debe ser correcta y los issues deben estar sincronizados