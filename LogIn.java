import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña,
        // si son iguales a los datos dados imprimirá en terminal:
        // Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.

        String dataBaseUserId1 = "Mari-Bongoll";
        String dataBasePasswordId1 = "hola123";
        
        Scanner logIn = new Scanner(System.in);
        System.out.print("Porfavor ingrese su uruario ");
        String userName = logIn.nextLine();
        System.out.print("Ahora su contraseña ");
        String password =logIn.nextLine();

            

        if(userName.equals(dataBaseUserId1) && password.equals(dataBasePasswordId1) ) {
            System.out.println("Acceso concedido");
        }
        else {
            System.out.println("Nombre de usuario o contraseña incorrecta.");
        }

        logIn.close();
    }
}
