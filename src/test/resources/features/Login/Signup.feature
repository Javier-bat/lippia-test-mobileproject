Feature: Sign up
  Background:
    Given El usuario esta en la pagina 'home'
    When El usuario hace click en el boton 'Login' del footer

  @SignUp @Smoke
  Scenario Outline: Sign up exitoso Demoapp
    Given El usuario esta en la pagina 'login'
    And El usuario hace click en el boton 'Sign up'
    When El usuario ingresa su correo "<email>" y contraseña "<password>"
    And El usuario llena el campo para confirmar su contraseña "<password>"
    And El usuario hace click en boton 'Sign up' para completar el registro
    When Se visualiza un mensaje de sign up exitoso
    Examples:
      | email                   | password         |
      | validUsername@gmail.com | validPassword156 |