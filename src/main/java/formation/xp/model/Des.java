package formation.xp.model;

import java.util.Random;

public class Des
{
    private Random rd;
    private static Des INSTANCE = new Des();

    private Des()
    {
        rd = new Random();
    }

    public static Des getInstance()
    {   return INSTANCE;
    }

    public int lancer() {
        return(rd.nextInt(11));
    }
}
