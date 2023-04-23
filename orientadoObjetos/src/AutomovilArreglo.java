import java.util.Arrays;

public class AutomovilArreglo {
    public static void main(String[] args) {

        Automovil auto1 = new Automovil("Suzuki", "Vitera");
        Persona conductor = new Persona("Lucia", "Martinez");
        Motor  motor = new Motor(3.0, TipoMotor.BENCIMA);
        auto1.setColor(Color.AZUL);
        auto1.setTipo(TipoAutomovil.SUV);
        auto1.setCondutor(conductor);
        auto1.setMotor(motor);
        auto1.setEstanque(new Estanque(30));
        Automovil.setCapacidadEstanqueEstatico(40);
        Automovil.setColorPatente(Color.GRIS);


        Automovil auto2 = new Automovil("Mazda", "Sendero");
        Persona conductor2 = new Persona("Angela", "Rios");
        Motor  motor2 = new Motor(8.0, TipoMotor.DIESEL);
        auto2.setColor(Color.AZUL);
        auto2.setTipo(TipoAutomovil.SUV);
        auto2.setCondutor(conductor2);
        auto2.setMotor(motor2);
        auto2.setEstanque(new Estanque(50));
        Automovil.setCapacidadEstanqueEstatico(20);
        Automovil.setColorPatente(Color.GRIS);

        Automovil[] autos =  new Automovil[5];
        autos[0] = auto1;
        autos[1] = auto2;
        autos[2] = auto1;
        autos[3] = auto1;
        autos[4] = auto1;

        Arrays.sort(autos);

        for(int i = 0; i < autos.length; i++){
            System.out.println(autos[i]);
        }

    }
}
