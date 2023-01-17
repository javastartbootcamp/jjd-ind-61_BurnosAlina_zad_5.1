package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {
    Point point = new Point();

    void run(Scanner scanner) {
        System.out.println("Podaj X");
        point.setX(scanner.nextInt());
        System.out.println("Podaj Y");
        point.setY(scanner.nextInt());
        checkQuarter();
    }

    void checkQuarter() {
        if (point.getX() > 0 && point.getY() > 0) {
            System.out.println(showQuarterInfo());
        } else if (point.getX() < 0 && point.getY() > 0) {
            System.out.println(showQuarterInfo());
        } else if (point.getX() < 0 && point.getY() < 0) {
            System.out.println(showQuarterInfo());
        } else if (point.getX() > 0 && point.getY() < 0) {
            System.out.println(showQuarterInfo());
        } else if (point.getX() == 0 && point.getY() != 0) {
            System.out.println(showPointInfo() + " na osi Y");
        } else if (point.getY() == 0 && point.getX() != 0) {
            System.out.println(showPointInfo() + " na osi X");
        } else if (point.getX() == 0 && point.getY() == 0) {
            System.out.println(showPointInfo() + " na środku układu współrzędnych");
        }
    }

    private String showPointInfo() {
        return ("Punkt (" + point.getX() + ", " + point.getY() + ") leży");
    }

    private String showQuarter() {
        if (point.getX() > 0 && point.getY() > 0) {
            return ("I");
        } else if (point.getX() < 0 && point.getY() > 0) {
            return ("II");
        } else if (point.getX() < 0 && point.getY() < 0) {
            return ("III");
        } else if (point.getX() > 0 && point.getY() < 0) {
            return ("IV");
        }
        return null;
    }

    private String showQuarterInfo() {
        return ("Punkt (" + point.getX() + ", " + point.getY() + ") leży w " + showQuarter() +
                " ćwiartce układu współrzędnych");
    }

    private String showAxis() {
        if (point.getX() == 0) {
            return ("Punkt (" + point.getX() + ", " + point.getY() + ") leży na osi X");
        } else if (point.getY() == 0) {
            return ("Punkt (" + point.getX() + ", " + point.getY() + ") leży na osi Y");
        }
        return null;
    }
}
