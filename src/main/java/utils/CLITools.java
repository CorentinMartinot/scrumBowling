package utils;

import java.io.InputStream;
import java.util.Scanner;

public class CLITools {

    private final Scanner scanner;
    
    public CLITools(InputStream is){
    	scanner = new Scanner(is);
    }
    

    /**
     * Affiche un message sur la sortie standard
     *
     * @param message
     */
    public void print(String message) {
        System.out.println(message);
    }

    /**
     * Affiche un message sur la sortie standard
     *
     * @param message
     * @param mandatory
     */
    public String readString(String message, boolean mandatory) {
        print(message);

        String input = null;
        int attempt = 0;

        do {
            if (attempt >= 1) {
                print("Cette valeur est obligatoire");
            }

            input = readString();
            attempt++;
        } while (mandatory && (input.isEmpty() || input == null));

        return input;
    }

    /**
     * Lit un message sur l'entrée standard
     */
    public String readString() {
        String value = "";
        if (scanner.hasNextLine()) {
            value = scanner.nextLine();
        }


        return value;
    }

    /**
     * Lit un entier sur l'entrée standard
     *
     * @param message
     * @return
     */
    public int readInt(String message) {
        print(message);

        String input = null;
        int output = 0;
        boolean error = false;

        do {
            input = readString();
            error = false;

            try {
                output = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                error = true;
                print("Veuillez saisir un nombre");
            }
        } while (error);

        return output;
    }

}
