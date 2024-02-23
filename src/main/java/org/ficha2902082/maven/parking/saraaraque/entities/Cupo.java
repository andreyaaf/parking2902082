package org.ficha2902082.maven.parking.saraaraque.entities;


public class Cupo {

    public char letra;
    public Double largo;
    public Double ancho;

    //Constructor de clas: Es un metodo especial en una entidad, primero se ejecuta automaticamente cuando se crea un objeto (Instanciar o crear una instancia)
    //Constructor por defecto
    public Cupo() {

    }

    //Constructor con parametros
    public Cupo(char letra, Double largo, Double ancho) {
        this.letra = letra;
        this.largo = largo;
        this.ancho = ancho;
    }

        




}
