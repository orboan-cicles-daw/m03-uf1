/*
 * Program.java        1.0 24/10/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

    /**
     * Determines if 3 segments form a triangle.
     * 
     * @param a the length of a segment.
     * @param b the length of a segment.
     * @param c the length of a segment.
     * @return true if -a-, -b- and -c- form a triangle, false otherwise.
     */
    boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    /**
     * Finds out the type of a triangle.
     * 
     * @param a the length of a segment.
     * @param b the length of a segment.
     * @param c the length of a segment.
     * @return "Equilàter", "Isòsceles" or "Escalè" if the triangle is valid or
     *         "ERROR", otherwise.
     */
    String typeOfTriangle(double a, double b, double c) {
        String tot; // Type of triangle
        if (!isTriangle(a, b, c)) {
            tot = "ERROR";
        } else if (a == b && a == c) {
            tot = "Equilàter";
        } else if (a == b || a == c || b == c) {
            tot = "Isòsceles";
        } else {
            tot = "Escalè";
        }
        return tot;
    }
}