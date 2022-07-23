#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: Login orange

  Scenario Outline: Login with Admin
    Given abrir el navegador
    And diligenciar usuario<userName> y password <pass>

    Examples: 
      | userName | pass     |
      | Admin    | admin123 |
 