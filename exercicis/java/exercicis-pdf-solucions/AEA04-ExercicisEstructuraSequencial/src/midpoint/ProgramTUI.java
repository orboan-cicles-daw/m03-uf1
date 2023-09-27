/*
 * ProgramTUI.java        1.0 17/10/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Scanner;
import java.util.Locale;

public class ProgramTUI {

    /**
     * Calculates average of two numbers.
     * 
     * @param n1 a real number.
     * @param n2 a real number.
     * @return the average of -n1- and -n2-.
     */
    public double average2(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    /**
     * Calculates the midpoint of two points. This program has a terminal user
     * interface.
     * 
     * @param args Not used.
     */
    public static void main(String[] args) {
        double ax, ay, bx, by, mx, my;
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        // Read the values from the keyboard
        System.out.printf("\n\nPUNT MIG.\n\n");
        System.out.printf("Coordenada ax ? ");
        ax = s.nextDouble();
        System.out.printf("Coordenada ay ? ");
        ay = s.nextDouble();
        System.out.printf("Coordenada bx ? ");
        bx = s.nextDouble();
        System.out.printf("Coordenada by ? ");
        by = s.nextDouble();
        // Process the data using average2
        ProgramTUI p = new ProgramTUI();
        mx = p.average2(ax, bx);
        my = p.average2(ay, by);
        // Write the result
        System.out.printf("\nPunt mig entre (%f,%f) i (%f,%f) = (%f,%f)\n\n", ax, ay, bx, by, mx, my);
    }
}
