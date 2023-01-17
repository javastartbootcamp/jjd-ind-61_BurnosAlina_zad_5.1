package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {
    Point point = new Point();

    void run(Scanner scanner) {
        System.out.println("Podaj X");
        point.setX(scanner.nextInt());
        System.out.println("Podaj Y");
        point.setY(scanner.nextInt());
    }

    void checkQuarter() {
        if (point.getX() > 0 && point.getY() > 0) {
            showQuarterInfo();
        } else if (point.getX() < 0 && point.getY() > 0) {
            showQuarterInfo();
        } else if (point.getX() < 0 && point.getY() < 0) {
            showQuarterInfo();
        } else if (point.getX() > 0 && point.getY() < 0) {
            showQuarterInfo();
        } else if (point.getX() == 0 && point.getY() != 0) {
            showPointInfo();
            System.out.println(" na osi Y");
        } else if (point.getY() == 0 && point.getX() != 0) {
            showPointInfo();
            System.out.println(" na osi X");
        } else if (point.getX() == 0 && point.getY() == 0) {
            showPointInfo();
            System.out.println(" na srodku ukladu wspolrzednych");
        }
    }

    private void showPointInfo() {
        System.out.print("Punkt: (" + point.getX() + "," + point.getY() + ") lezy");
    }

    private void showQuarter() {
        if (point.getX() > 0 && point.getY() > 0) {
            System.out.print("I");
        } else if (point.getX() < 0 && point.getY() > 0) {
            System.out.print("II");
        } else if (point.getX() < 0 && point.getY() < 0) {
            System.out.print("III");
        } else if (point.getX() > 0 && point.getY() < 0) {
            System.out.print("IV");
        }
    }

    private void showQuarterInfo() {
        System.out.print("Punkt: (" + point.getX() + "," + point.getY() + ") lezy w ");
        showQuarter();
        System.out.println(" cwiartce ukladu wspolrzednych");
    }

    private void showAxis() {
        if (point.getX() == 0) {
            System.out.println("Punkt: (" + point.getX() + "," + point.getY() + ") lezy na osi X");
        } else if (point.getY() == 0) {
            System.out.println("Punkt: (" + point.getX() + "," + point.getY() + ") lezy na osi Y");
        }
    }
}
