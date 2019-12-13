package formation.xp.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class partie {

    // Automatic close
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        // Read string
        String s = br.readLine();

        // Read integer
        int i = Integer.parseInt(br.readLine());
    }

}
