package org.ficha2902082.maven.parking.saraaraque.entities;

import java.time.LocalDate;
import java.time.LocalTime;


public class Registro {
    //Atributos intrinsecos (Propios del objeto) a un registro 

    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalDate fechaSalida;
    public LocalTime horaSalida;
    public Double valor;
    
    


    //atributos de relación
    public Carro carro;
    public Cupo cupo;
    //Constructor por defecto
    public Registro() {
    }
    //Constructor parametizado
    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaSalida, LocalTime horaSalida,
            Double valor, Carro carro, Cupo cupo) {
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.valor = valor;
        this.carro = carro;
        this.cupo = cupo;
    }
    




}
