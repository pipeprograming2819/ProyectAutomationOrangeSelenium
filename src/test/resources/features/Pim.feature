
#Proyecto de pruebas y cargado en Github
#23/07/2022
#pipeprogramaming 
@Regresion
Feature: Pim

  Scenario Outline: Add Empleoyee
    Given abrir el navegador
    And diligenciar usuario<userName> y password <pass>
    And llegar a la opcion agregar empleado 

    Examples: 
      | userName | pass     |
      | Admin    | admin123 |

