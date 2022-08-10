Feature: Forms
  Background:
    Given El usuario esta en la pagina 'home'
    When El usuario hace click en el boton 'Forms' del footer

  @Forms @Smoke
  Scenario: Funcionamiento de campos en seccion Forms
    Given El usuario esta en la pagina 'Forms'
    And Completa el campo input con "texto prueba"
    And El usuario hace click en el switch
    And El usuario selecciona el primer campo del dropdown
    And El usuario presiona active terminar el form
    Then se visualiza un modal exitoso
