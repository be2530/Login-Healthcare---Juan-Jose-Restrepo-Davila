Feature: Yo como practicante quiero
	iniciar sesion en Healthcare para una tarea de Quipux
      
      Scenario: Inicio sesion
      Given Abro Chrome y voy a Healthcare
      When Le doy click en Make Appointment
      And Pego el username
      And Pego el password
      And Doy click en el Login
      And Selecciono a Hongkong
      And Doy click en el checkbox
      And Doy click en Medicaid
      And Pongo la fecha del covid
    	And Escribo un comentario
      And Doy click en Book Appointment
      And Doy click en Go to Homepage
      Then Cierro Chrome