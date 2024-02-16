package org.ficha2902082.maven.parking.saraaraque;
// importar dependencias 
import org.ficha2902082.maven.parking.saraaraque.entities.Carro;
import org.ficha2902082.maven.parking.saraaraque.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.saraaraque.entities.TipoDocumento;
import org.ficha2902082.maven.parking.saraaraque.entities.Cliente;

public class Main {
    public static void main(String[] args) {
       //Crear dos instancias
       // de la clase carro 
       Carro carrito1 = new Carro();
       carrito1.placa = "ASB 345";
       carrito1.tipoVehiculo = TipoVehiculo.CAMIONETA;

       Carro carrito2 = new Carro();
       carrito2.placa = "HKJ 765";
       carrito2.tipoVehiculo = TipoVehiculo.TAXI;

      Cliente clientecito1 = new Cliente();
      clientecito1.nombre= "Felipe";
      clientecito1.apellido= "Rodriguez";
      clientecito1.tipoDocumento= TipoDocumento.CC;
      clientecito1.numeroDocumento = 1065228487L;
      clientecito1.celular = 3026988306L;
       
       //añadir carros al cliente
       //invocar,llamar,ejecutar el metodo addCar
      clientecito1.addCar(carrito1);
      clientecito1.addCar(carrito2);
      clientecito1.addCar("ASD 456",TipoVehiculo.TAXI);


     System.out.println("Vehiculos:");

     for(Carro c: clientecito1.misCarros) {
        System.out.println("placa:"+c.placa);
        System.out.println("tipo:" + c.tipoVehiculo);
        System.out.println("_______________________________________________");
        

     }


      System.out.println("Cliente");
      System.out.println("TipoDocumento"+ clientecito1.tipoDocumento);
      System.out.println(clientecito1.nombre);
      System.out.println(clientecito1.apellido);
      System.out.println("numeroDocumento:"+ clientecito1.numeroDocumento);
      

    }
}