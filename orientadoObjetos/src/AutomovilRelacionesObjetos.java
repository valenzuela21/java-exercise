import java.util.ArrayList;
import java.util.List;

public class AutomovilRelacionesObjetos {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Subaru", "Impreza");
        Rueda[] ruedas1 =  new Rueda[5];

        Persona conductor = new Persona("Lucia", "Martinez");

        Motor  motor = new Motor(3.0, TipoMotor.BENCIMA);

        auto.setColor(Color.ROJO);
        auto.setTipo(TipoAutomovil.HATCHBAK);
        auto.setRuedas(ruedas1);
        auto.setCondutor(conductor);
        auto.setMotor(motor);
        auto.setEstanque(new Estanque(30));
        Automovil.setCapacidadEstanqueEstatico(40);
        Automovil.setColorPatente(Color.AMARLLO);

        for(int  i =  0; i < ruedas1.length; i++ ){
            auto.addRuedas(new Rueda("Yokohama", 16, 7.5));
        }

        System.out.println(auto.verDetalle());
        for(Rueda r: auto.getRuedas() ){
            System.out.println("fabricante" + r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
        }

        Rueda[]  ruedas2 =  new Rueda[5];

        for(int i = 0; i < ruedas2.length; i++){
                ruedas2[i] = new Rueda("Michelin", 18, 10.5);
        }

        Persona conductor2 = new Persona("Bea", "Pardo");
        Automovil auto2 = new Automovil("mazda", "kft", Color.GRIS);
        auto2.setTipo(TipoAutomovil.SEDAN);
        auto2.setRuedas(ruedas2);
        auto.setCondutor(conductor2);

        System.out.println(auto2.verDetalle());

        System.out.println("============================================================");

        System.out.println("Automovil.getColorPartente() = " + Automovil.getColorPatente());
        System.out.println("auto.getCapacidadEstanque() = " + Automovil.getCapacidadEstanqueEstatico());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("Velocidad max carretera = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad max ciudad = " + Automovil.VELOCIDAD_MAX_CIUDAD);

        Rueda[] ruedas3 = new Rueda[5];

        for(int i = 0; i< ruedas3.length; i++){
            ruedas3[i] = new Rueda("Pirelli", 18, 10.5);
        }

        Persona conductor3 = new Persona("Bea", "Pardo");
        Automovil auto3 = new Automovil("mazda", "kft", Color.AZUL, new Motor(2.0, TipoMotor.BENCIMA), new Estanque(), conductor3, ruedas3);
        auto3.setTipo(TipoAutomovil.PICKUP);

        System.out.println(auto3.verDetalle());
        System.out.println("auto3.getConductor() = " + auto3.getCondutor());

        for(Rueda r: auto3.getRuedas() ){
            System.out.println("fabricante" + r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
        }
    }
}
