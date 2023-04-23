import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Subaru", "Impreza");
        Motor motor =  new Motor(2.0, TipoMotor.DIESEL);
        auto.setMotor(motor);
        auto.setEstanque(new Estanque());
        auto.setColor(Color.AZUL);
        auto.setTipo(TipoAutomovil.PICKUP);

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
        auto2.setTipo(TipoAutomovil.CONVERTIBLE);

        System.out.println("Automobil Fabricante 2 = " +  auto2.getFabricante());
        System.out.println("Automobil Modelo 2 = " +  auto2.getModel());


        Automovil auto3 = new Automovil("mazda", "Navarra", Color.ROJO, new Motor(4.0, TipoMotor.BENCIMA), new Estanque(50), new Persona("David", "Valenzuela"));
        Automovil auto4 = new Automovil("mazda", "Impreza", Color.MORADO,  new Motor(4.0, TipoMotor.DIESEL), new Estanque(50), new Persona("Andrea", "Garzón"));
        auto3.setTipo(TipoAutomovil.FURGON);
        auto4.setTipo(TipoAutomovil.STATION_WAGON);

        System.out.println("Son Iguales = " + (auto3 == auto2));
        System.out.println("Son Iguales = " +  auto3.equals(auto2));

        System.out.println("Automobil Fabricante 3 = " +  auto3.getFabricante());
        System.out.println("Automobil Modelo 3 = " +  auto3.getModel());
        System.out.println("Automobil Color 3 = " +  auto3.getColor());
        System.out.println("Automobil Cilindrada 3 = " +  auto3.getMotor().getCilindrada());


        System.out.println(auto.toString());
    }
}