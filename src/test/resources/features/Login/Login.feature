Feature: Login
  Background:
    Given El usuario esta en la pagina 'home'
    When El usuario hace click en el boton 'Login' del footer

  @Login @Smoke
  Scenario Outline: Login exitoso Demoapp
    Given El usuario esta en la pagina 'login'
    When El usuario ingresa su correo "<email>" y contraseña "<password>"
    And El usuario hace click en 'login'
    When Se visualiza un mensaje de login exitoso
    Examples:
      | email                   | password         |
      | validUsername@gmail.com | validPassword156 |