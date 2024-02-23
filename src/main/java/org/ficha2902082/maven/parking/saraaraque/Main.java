package org.ficha2902082.maven.parking.saraaraque;
// importar dependencias 

import org.ficha2902082.maven.parking.saraaraque.entities.Carro;
import org.ficha2902082.maven.parking.saraaraque.entities.Cliente;
import org.ficha2902082.maven.parking.saraaraque.entities.Cupo;
import org.ficha2902082.maven.parking.saraaraque.entities.TipoDocumento;
import org.ficha2902082.maven.parking.saraaraque.entities.TipoVehiculo;
import java.util.List;
import java.util.ArrayList;
import org.ficha2902082.maven.parking.saraaraque.entities.Registro;
import java.time.*;



public class Main {
    public static void main(String[] args) {

      //Crear dos cupos
      //instaciar dos cupo 
      //Sirve para inicializar el objeto 
      //-dar valores iniciales al los atributos del objeto  
      
      Cupo cupito1 = new Cupo();
      cupito1.ancho = 1.0;
      cupito1.largo =5.5;
      cupito1.letra = 'A';
      Cupo cupito2 = new Cupo('B',5.5, 2.5);

    

      //Instaciar dos carros

      Carro carrito1 = new Carro("ABD 123",TipoVehiculo.MOTO);
      Carro carrito2 = new Carro("ccc 000", TipoVehiculo.CAMIONETA);

      //Instaciar dos clientes 

      Cliente cliente1 = new Cliente("Andrey", "Algara",TipoDocumento.TI, 10747548949L,3551177991L);
      Cliente cliente2 = new Cliente("Felipe","Martinez",TipoDocumento.CC,65656565L, 345554188L);

      //vincular el valor de carros al cliente

      cliente1.addCar(carrito1);
      cliente2.addCar(carrito2);
      cliente2.addCar("abc 123", TipoVehiculo.TAXI);
      
      //Declara una lista +

      List<Registro> misRegistros =new ArrayList<>();

      //crear dos registro E/S

      Registro registro1 = new Registro(LocalDate.of(2024, 2, 22), LocalTime.of(15, 10), LocalDate.of(2024, 2, 23), LocalTime.of(5, 0), 2000.00 , cliente1.misCarros.get(0), cupito2);
      Registro registro2 = new Registro(LocalDate.of(2024, 2, 22),LocalTime.of(12, 2, 1), LocalDate.of(2024, 2, 23), LocalTime.of(13, 10, 2), 3000.00, cliente2.misCarros.get(1),cupito1);

//Vincular los registros a la lista de resgistros
   misRegistros.add(registro1);
       misRegistros.add(registro2);

       //recorrer la lista de registros 
       for( Registro  r : misRegistros){
         System.out.println(" Placa: " + r.carro.placa + "|" + "Cupo: " + r.cupo.letra + "|" +"valor:" + r.valor+"|"+"horainicio:"+r.fechaInicio.toString() + "|"   );

       }
}
    };

    

    