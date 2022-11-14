# encoding: iso-8859-1

  Feature: Loguearse en la pagina de prueba

    Scenario: Loguearse de manera exitosa en la pagina AutomationPractice.com
      Given que ingreso a la pagina automation practice
      When ingreso los datos de usuario y contraseña
      Then valido el ingreso exitoso