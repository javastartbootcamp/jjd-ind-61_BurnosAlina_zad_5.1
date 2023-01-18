package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    void run(Scanner scanner) {
        Point point = new Point();
        System.out.println("Podaj X");
        point.setX(scanner.nextInt());
        System.out.println("Podaj Y");
        point.setY(scanner.nextInt());
        findPosition(point);
    }

    void findPosition(Point point) {
        if (point.getX() != 0 && point.getY() != 0) {
            showQuarterInfo(point);
        } else if (point.getX() == 0 && point.getY() == 0) {
            System.out.println(showPointInfo(point) + " na środku układu współrzędnych");
        } else {
            showAxisInfo(point);
        }
    }

    private String showPointInfo(Point point) {
        return ("Punkt (" + point.getX() + ", " + point.getY() + ") leży");
    }

    private String getQuarter(Point point) {
        if (point.getX() > 0 && point.getY() > 0) {
            return ("I");
        } else if (point.getX() < 0 && point.getY() > 0) {
            return ("II");
        } else if (point.getX() < 0 && point.getY() < 0) {
            return ("III");
        } else {
            return ("IV");
        }
    }

    private void showQuarterInfo(Point point) {
        System.out.println(showPointInfo(point) + " w " + getQuarter(point) +
                " ćwiartce układu współrzędnych");
    }

    private void showAxisInfo(Point point) {
        if (point.getX() == 0 && point.getY() != 0) {
            System.out.println(showPointInfo(point) + " na osi Y");
        } else if (point.getY() == 0 && point.getX() != 0) {
            System.out.println(showPointInfo(point) + " na osi X");
        }
    }
}
