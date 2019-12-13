package formation.xp;
import utils.*;


public class Main {
    private static NavigationState navigationState;
    private CLITools cliTools = new CLITools(System.in);
    
    
    public static void main(String[] args) {
        navigationState=NavigationState.Menu;
        System.out.print("Bienvenue sur scrumBowling");
        String buff="";
        do {
            buff=CLITools.readString(">> ",false);
            if (buff.toUpperCase().equals("INITGAME")) {
                navigationState=NavigationState.InitGame;
            } else if(buff.toUpperCase().equals("HIGHSCORE")){
                navigationState=NavigationState.HighScore;
            } else if (buff.contentEquals("/q")) {
            } else {
                CLITools.print("Erreur de Syntaxe, entrer '/q' pour quitter");
            }

        } while (!buff.equals("/q"));
        CLITools.print("Bye");

    }
}
