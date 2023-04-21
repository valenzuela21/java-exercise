import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Subaru", "Impreza");
        auto.setCilindrada(2.0);
        auto.setCapacidadEstanque(30);
        auto.setColor("amarillo");
        auto.setCilindrada(2.0);


        System.out.println(auto.verDetalle());
        System.out.println(auto.acelerar(3000));
        System.out.println(auto.frenar());
        System.out.println(auto.acelerarFrenar(200));

        System.out.println("Kilometro por litro " + auto.calcularConsumo(300, 0.6f));

        System.out.println("Kilometro por litro " + auto.calcularConsumo(300, 60));

        System.out.println("Automobil Fabricante = " +  auto.getFabricante());
        System.out.println("Automobil Modelo = " +  auto.getModel());
        System.out.println("Automobil Color = " +  auto.getColor());


        Automovil auto2 = new Automovil();

        auto2.setFabricante("Subaru_2");
        auto2.setModelo("Impreza_2");

        System.out.println("Automobil Fabricante 2 = " +  auto2.getFabricante());
        System.out.println("Automobil Modelo 2 = " +  auto2.getModel());


        Automovil auto3 = new Automovil("mazda", "kft", "rojo", 20);

        System.out.println("Automobil Fabricante 3 = " +  auto3.getFabricante());
        System.out.println("Automobil Modelo 3 = " +  auto3.getModel());
        System.out.println("Automobil Color 3 = " +  auto3.getColor());
        System.out.println("Automobil Cilindrada 3 = " +  auto3.getCilindrada());
    }
}