package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        nakresliObdelnik(zofka, 20, 40);
    }

    private void nakresliRTrojuhlenik (Turtle turtle, double delkaStrany) {
        for (int i = 0; i < 3; i++) {
        turtle.move(delkaStrany);
        turtle.turnRight(120);

        }
    }

    private void nakresliCtverec(Turtle turtle, double delkaStrany) {
        for (int i = 0; i < 4; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight(90);
        }
    }

    private void nakresliMnohohuelnik (Turtle turtle, double delkaStrany, int pocetStran) {
        double uhel = 360.0 / pocetStran;
        for (int i = 0; i < pocetStran; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight(uhel);
        }
    }

    private void nakresliKolecko (Turtle turtle, double delkaStrany)   {
        nakresliMnohohuelnik(turtle, delkaStrany, 24);
    }

    private void nakresliObdelnik (Turtle turtle, double delkaStranya, double delkaStranyb) {
        for (int i = 0; i < 2; i++) {
        turtle.move(delkaStranya);
        turtle.turnRight(90);
        turtle.move(delkaStranyb);
        turtle.turnRight(90);
        }
    }
}
