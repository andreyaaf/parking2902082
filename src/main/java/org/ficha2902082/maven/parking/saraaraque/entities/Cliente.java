package org.ficha2902082.maven.parking.saraaraque.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombre;
    public String apellido;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public Long celular;
    
    public List<Carro> misCarros=
           new ArrayList<Carro>();

//Metodo 1;añadir carro al cliente
//definir metodo:
//-modificar acceso
//-tipo de dato de retorno 
//- nombre de metodo 
//parametros(Entradas,inputs):
//1.Tipo de dato del parametro 
//2.Nombre del parametro 
 public void addCar(Carro c){
     this.misCarros.add(c);
}


//sobrecarga del metodo addCar
public void addCar(String placa, TipoVehiculo tv){
    //construir(instanciar)
    Carro c = new Carro();
    c.placa = placa;
    c.tipoVehiculo = tv;
        this.misCarros.add(c);
     }
public Cliente() {
}
public Cliente(String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroDocumento, Long celular) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.tipoDocumento = tipoDocumento;
    this.numeroDocumento = numeroDocumento;
    this.celular = celular;
    this.misCarros = new ArrayList<Carro>();}
 

 // Sobrecarga de metodos;
 //en una clase se permiten metodos
 //con el mismo nombre pero
 //con diferente firma
}
