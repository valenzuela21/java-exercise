public class AutomovilStatic {

    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru", "Impreza");
        Motor  motor = new Motor(3.0, TipoMotor.BENCIMA);
        auto.setMotor(motor);
        auto.setEstanque(new Estanque(30));
        auto.setColor(Color.ROJO);
        auto.setTipo(TipoAutomovil.HATCHBAK);
        Automovil.setCapacidadEstanqueEstatico(40);

        Automovil.setColorPatente(Color.AMARLLO);

        Automovil auto2 = new Automovil("mazda", "kft", Color.GRIS);
        auto2.setTipo(TipoAutomovil.SEDAN);

        System.out.println(auto2.verDetalle());
        System.out.println(auto.verDetalle());
        System.out.println("============================================================");

        System.out.println("Automovil.getColorPartente() = " + Automovil.getColorPatente());
        System.out.println("auto.getCapacidadEstanque() = " + Automovil.getCapacidadEstanqueEstatico());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("Velocidad max carretera = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad max ciudad = " + Automovil.VELOCIDAD_MAX_CIUDAD);

        Automovil auto3 = new Automovil("mazda", "kft", Color.AZUL);
        auto3.setTipo(TipoAutomovil.PICKUP);
    }
}
