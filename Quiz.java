import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
        //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java

        Scanner quiz = new Scanner(System.in);

        int points = 0;

        System.out.println("Hola, Prepeparate para jugar!");


        System.out.println("¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?");
        System.out.println("\ta. Ada Lovelace\r\n" + //
                        "\tb. Jude Milhon\r\n" + //
                        "\tc. Martha Ackelsberg\r\n" + //
                        "\td. Jane Jacobs");
         String answer1 = quiz.nextLine();
         String answer1b = "b"; 
         if(answer1.equals(answer1b)) {
           System.out.println("+ 5 puntos!");
         }
         if(answer1.equals(answer1b)) {
           points =  points + 5;
         }


        System.out.println("¿Quién es Fuencisla Clemares?");
        System.out.println("\ta. La directora general de IBM Europa, Oriente Medio y África\r\n" + //
                        "\tb. La vicepresidenta de Microsoft Western Europe\r\n" + //
                        "\tc. La directora general de Google en España y Portugal\r\n" + //
                        "\td. Fundadora y CEO de Marsi Bionics");

        String answer2 = quiz.nextLine();
        String answer2c = "c"; 
        if(answer2.equals(answer2c)) {
            System.out.println("+ 5 puntos!");
          }
        if(answer2.equals(answer2c)) {
            points =  points + 5;
          }


        System.out.println("Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr\r\n" + 
                            "Si crees que hay mas de una, responde con una y, ejemplo x y z");
        System.out.println("            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?\r\n" + 
                        "\ta. Primera programadora de software\r\n" + 
                        "\tb. Una actriz de cine\r\n" + 
                        "\tc. Inventora del procesador de datos\r\n" + 
                        "\td. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS");
        String answer3 = quiz.nextLine();
       String answer3b = "b y d";
        String answer3d = "d y b";
        if(answer3.equals(answer3d) || answer3.equals(answer3b)) {
            System.out.println("+ 5 puntos!");
        }
        if(answer3.equals(answer3d) || answer3.equals(answer3b)) {
            points =  points + 5;
        }


        System.out.println("¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?");
        System.out.println("\ta. Katherine Johnson, Dorothy Vaughan y Mary Jackson\r\n" + 
                        "\tb. Jessica Miller, Emily Johnson, Sarah Davis\r\n" + 
                        "\tc. bell hooks, Toni Morrison y Alice Walker\r\n" +
                        "\td. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman");
        String answer4 = quiz.nextLine();
        String answer4a ="a";
          
        if(answer4.equals(answer4a)){
            System.out.println("+ 5 puntos!");
        }
        if(answer4.equals(answer4a)) {
            points =  points + 5;
          }

        quiz.close();

        if (points < 5 ) {
            System.out.println("Suerte la proxima!");
	
        } else if (points <= 10 ) {
            System.out.println("No lo haz hecho mal");
            
        } else  {
            System.out.println("Tu si que sabes mucho!");
        } 

        //Preguntas:
        /* 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?
                a. Ada Lovelace
                b. Jude Milhon
                c. Martha Ackelsberg
                d. Jane Jacobs
            
            2. ¿Quién es Fuencisla Clemares?
                a. La directora general de IBM Europa, Oriente Medio y África
                b. La vicepresidenta de Microsoft Western Europe
                c. La directora general de Google en España y Portugal
                d. Fundadora y CEO de Marsi Bionics
            
            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?
                a. Primera programadora de software
                b. Una actriz de cine
                c. Inventora del procesador de datos
                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS
            
            4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?
                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson
                b. Jessica Miller, Emily Johnson, Sarah Davis
                c. bell hooks, Toni Morrison y Alice Walker
                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman
        */

        //Respuestas: 1. b / 2. c / 3. b y d / 4. a

    }
    
}