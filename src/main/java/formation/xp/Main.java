package formation.xp;
import utils.NavigationState


public class Main {
    public static void main(String[] args) {


        System.out.print("Bienvenue sur RentManager");
        String buff="";
        do {
            buff=IOUtils.readString(">> ",false);
            if(buff.toUpperCase().equals("CREATE VEHICLE")){
                VehicleUi.getInstance().create();
            } else if (buff.toUpperCase().equals("FIND ALL VEHICLES")) {
                VehicleUi.getInstance().findAll();
            } else if (buff.toUpperCase().equals("DELETE VEHICLE")) {
                VehicleUi.getInstance().delete();
            } else if(buff.toUpperCase().equals("CREATE RESERVATION")){
                ReservationUi.getInstance().create();
            } else if (buff.toUpperCase().equals("FIND ALL RESERVATIONS")) {
                ReservationUi.getInstance().findAll();
            } else if (buff.toUpperCase().equals("DELETE RESERVATION")) {
                ReservationUi.getInstance().delete();
            } else if (buff.toUpperCase().equals("FIND RESERVATION BY CLIENT")) {
                ReservationUi.getInstance().findResaByClientId();
            } else if (buff.toUpperCase().equals("FIND RESERVATION BY VEHICLE")) {
                ReservationUi.getInstance().findResaByVehicleId();
            } else if (buff.contentEquals("/q")) {
            } else {
                IOUtils.print("Erreur de Syntaxe");
            }

        } while (!buff.equals("/q"));
        IOUtils.print("Bye")


    }
}
