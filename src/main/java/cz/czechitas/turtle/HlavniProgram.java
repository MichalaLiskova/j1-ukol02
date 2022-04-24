package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setSpeed(100);

        Turtle tomas = new Turtle();
        tomas.setPenColor(Color.blue);

        Turtle pingu = new Turtle();
        pingu.setPenColor(Color.darkGray);


        //nakreslení sněhuláka - Pingu
        pingu.setLocation(1100, 200);
        pingu.turnRight(90);
        nakresliKolecko(pingu, 8);
        jdiPulkolecko(pingu, 8);
        pingu.turnRight(180);
        nakresliKolecko(pingu, 12);
        jdiCtvrtkolecko(pingu, 12);
        pingu.turnLeft(180);
        nakresliKolecko(pingu, 5);
        pingu.turnLeft(180);
        jdiPulkolecko(pingu, 12);
        pingu.turnLeft(180);
        nakresliKolecko(pingu, 5);
        pingu.turnLeft(180);
        jdiPulkolecko(pingu, 12);
        jdiCtvrtkolecko(pingu, 12);
        pingu.turnLeft(180);
        nakresliKolecko(pingu, 16);



        //kreslení mašinky - Tomas
         nakresliObdelnik(tomas, 140, 100);
         nakresliKolecko(tomas, 13.2);
         tomas.turnLeft(90);
         nakresliObdelnik(tomas, 150, 70);
         tomas.move(110);
         tomas.turnLeft(180);
         nakresliKolecko(tomas, 6);
         tomas.move(70);
         nakresliKolecko(tomas, 6);
         tomas.turnLeft(180);
         tomas.move(110);
         tomas.penUp();
         tomas.move(70);
         tomas.turnLeft(90);
         tomas.move(30);
         tomas.turnLeft(45);
         tomas.penDown();
         nakresliRamennytrojuhelnik(tomas, 70, 100);


        //kreslení zmrzliny - Zofka
        System.out.println(zofka.getX());
        System.out.println(zofka.getY());
        zofka.setLocation(50, 100);
        zofka.setPenColor(Color.pink);
        nakresliKolecko(zofka, 20);

        zofka.turnRight(180);
        nakresliRamennytrojuhelnik(zofka, 200, 150);
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

    private void jdiCastMnohohuelniku (Turtle turtle, double delkaStrany, int pocetStran, int cast) {
        double uhel = 360.0 / pocetStran;

        turtle.turnRight(uhel/2);
        for (int i = 0; i < pocetStran/cast; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight(uhel);
        }
        turtle.turnLeft(uhel/2);
    }

    private void nakresliKolecko (Turtle turtle, double delkaStrany)   {
        jdiCastMnohohuelniku(turtle, delkaStrany, 24, 1);
    }

    private void jdiPulkolecko (Turtle turtle, double delkaStrany)   {
        jdiCastMnohohuelniku(turtle, delkaStrany, 24, 2);
    }

    private void jdiCtvrtkolecko (Turtle turtle, double delkaStrany)   {
        jdiCastMnohohuelniku(turtle, delkaStrany, 24, 4);
    }

    private void nakresliObdelnik (Turtle turtle, double delkaStranya, double delkaStranyb) {
        for (int i = 0; i < 2; i++) {
        turtle.move(delkaStranya);
        turtle.turnRight(90);
        turtle.move(delkaStranyb);
        turtle.turnRight(90);
        }
    }

    private void nakresliRamennytrojuhelnik (Turtle turtle, double delkaRamene, double delkaZakladny) {

            double uhelRamen = 2 * Math.toDegrees(Math.asin((delkaZakladny/2)/delkaRamene));
            double uhelZakladny = (180 - uhelRamen)/2;
            turtle.turnLeft(90 - uhelZakladny);
            turtle.move(delkaRamene);
            turtle.turnLeft(180 - uhelRamen);
            turtle.move(delkaRamene);
            turtle.turnLeft(180 - uhelZakladny);
            turtle.move(delkaZakladny);
            turtle.turnLeft(90);


    }


}
