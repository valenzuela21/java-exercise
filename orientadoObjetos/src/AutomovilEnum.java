public class AutomovilEnum {

    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru", "Impreza");
        auto.setMotor(new Motor(9.0, TipoMotor.DIESEL));
        auto.setEstanque(new Estanque());
        auto.setColor(Color.ROJO);
        auto.setTipo(TipoAutomovil.HATCHBAK);
        Automovil.setColorPatente(Color.AMARLLO);
        Automovil.setCapacidadEstanqueEstatico(40);

        TipoAutomovil tipoAutomovil =  auto.getTipo();

        switch (tipoAutomovil){
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo de dos puertas");
                break;
            case COUPE:
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automovil utilitario de transporte de empresas");
                break;
            case HATCHBAK:
                System.out.println("Es un automovil mediano compacto , aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("Es un automovil de double cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("Es un automovil mediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un automovil más grenade, con maletero grande");
                break;

        }


        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta: tipos){
            System.out.print(ta + " => " + ta.getNombre() + "," + ta.getDescripcion() + "," +  ta.getNumeroPuerta());
            System.out.println();
        }





    }
}
