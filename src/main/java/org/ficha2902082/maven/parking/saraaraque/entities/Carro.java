package org.ficha2902082.maven.parking.saraaraque.entities;


public class Carro {

    //sintaxis de atributos
    //1. modificador de acceso
    //2. tipo de dato del atributo 
    //3. Nombre del atributo 
    //  (camel case)
    public String placa; 
    public TipoVehiculo tipoVehiculo;
    
    public Carro() {
    }

    public Carro(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    

}
