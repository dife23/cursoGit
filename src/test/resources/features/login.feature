# encoding: iso-8859-1

  Feature: Loguearse en la pagina de prueba

    Scenario: Loguearse de manera exitosa en la pagina elempleo.com
      Given que ingreso a la pagina elempleo.com
      When ingreso los datos de usuario "usuartest" y contrasena "clavetest"
      Then valido el ingreso exitoso