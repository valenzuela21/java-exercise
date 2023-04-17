import java.util.Scanner;

public class EjercicioOperadoresLogicosLogin {
    public static void main(String[] args) {
        /*String[] usernames = new String[2];
        usernames[0] = "andres";
        usernames[1] = "admin";

        String[] passwords = new String[2];
        passwords[0] = "123456";
        passwords[1] = "123";
*/

        String[] usernames = {"andres", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};

        String username = "andres";
        String password = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username: ");
        String u = scanner.next();

        System.out.println("Ingrese el password: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        for(int  i  = 0; i < usernames.length; i++){
            if(usernames[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }else{
                System.out.println("Username o password son incorrectos");
                break;
            }
        }

        /*if(username.equals(u) && password.equals(p)){
            esAutenticado = true;
        }*/

        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("No estas autorizado...");
        }

    }
}
