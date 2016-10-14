package figureSquare;

import static java.util.Arrays.copyOfRange;

/**
 * Created by a1 on 30.09.16.
 */
public class Triangle {

    // Fields
    public Point a;
    public Point b;
    public Point c;

    double ABSideLength, BCSideLength, CASideLength;

    /*Vector AB = new Vector(a, b);
    Vector BC = new Vector(b, c);
    Vector CA = new Vector(c, a);*/
    Vector AB, BC, CA;

    /*double AB, BC, CA;
    double[] sidesArray = {AB, BC, CA};*/
    Vector[] vectorsArray = {AB, BC, CA}; // **

    /**
     * TODO what to do with vectorsArray up here and in the method below
     */

    private double area;
    private double maxLength;

    // Methods
    public double getArea() {
        return area;
    }
    public double getMaxLength() {
        return maxLength;
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        this.AB = new Vector(a, b);
        this.BC = new Vector(b, c);
        this.CA = new Vector(c, a);

        this.ABSideLength = a.distanceTo(b);
        this.BCSideLength = b.distanceTo(c);
        this.CASideLength = c.distanceTo(a);
    }

    private boolean triangleExistion(double AB, double BC, double CA) {
        boolean exist = false;
        if ( (AB + BC > CA) ||
                (BC + CA > AB) ||
                (CA + AB > BC) ) {
            exist = true;
        }
        return exist;
    }

    int[] allNumbersArray(int arrayLength) {
        int[] allNumbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            allNumbers[i] = i;
        }
        return allNumbers;
    }

    int[] arrayWithRemovedIElement(int[] array, int i) {
        for (; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        return copyOfRange(array, 0, array.length - 1 );
    }

    void showArray(double[] array, String tag) {
        System.out.print(tag + " array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void showArray(int[] array, String tag) {
        System.out.print(tag + " array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void showArray(Vector[] array, String tag) {
        System.out.print(tag + " array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*double getNearPointAngle(int[] numberOfNeededPoints, int i) {
        double cSide = sidesArray[i];
        double aSide = sidesArray[numberOfNeededPoints[0]];
        double bSide = sidesArray[numberOfNeededPoints[1]];
*//*        for (int j = 0; j < numberOfNeededPoints.length; j++) {

        }*//*
        double angleSize = Math.acos( (Math.pow(aSide, 2) + Math.pow(bSide, 2) - Math.pow(cSide, 2))
                / (2 * aSide * cSide ) );
        return angleSize;
    }*/

    double getNearPointAngle(int[] numberOfNeededPoints, int i) { // getNearPointAngleViaVector
        Vector[] vectorsArray = {this.AB, this.BC, this.CA}; // **

        /**TODO Maybe to add this. before vectorsArray here ?*/
        Vector AB = vectorsArray[i];
        Vector BC = vectorsArray[numberOfNeededPoints[0]];
        Vector CA = vectorsArray[numberOfNeededPoints[1]];
        // BC ^ CA
        /*System.out.println("In triangle Class");
        System.out.println("this.AB: " + this.AB + "; this.BC: " + this.BC + "; this.CA: " + this.CA);

        showArray(numberOfNeededPoints, "InTriangle Class; Number of needed points");
        System.out.println("vectorsArray[numberOfNeededPoints[0]]: " + vectorsArray[numberOfNeededPoints[0]]);
        System.out.println("vectorsArray[numberOfNeededPoints[1]]: " + vectorsArray[numberOfNeededPoints[1]]);
        showArray(vectorsArray, "vectorsArray ");*/

        /*System.out.println("AB: " + AB + "; BC: " + BC + "; CA: " + CA);
        System.out.println("BC.X : " + BC.X + "; CA.X : " + CA.X + "; CA.X : " + BC.Y + "; CA.X : " + CA.Y);*/
        double fractionUp = BC.X *  CA.X + BC.Y *  CA.Y;// ;
        double fractionDown = BC.getVectorLength() * CA.getVectorLength();
        double angleSize = Math.acos( fractionUp / fractionDown );
        return angleSize;
    }


//    double allAnglesSize(Point a, Point b, Point c) {
    double allAnglesSize() {
        double allAnglesSizeQuantity = 0;
//        Point[] pointArray = {a, b, c};
//        for (int i = 0; i < sidesArray.length; i++) {
        for (int i = 0; i < vectorsArray.length; i++) {
            /**
             *  It is needed that allNumbers to be generated each time
             */
            int[] allNumbers = allNumbersArray(vectorsArray.length);
            int[] numberOfNeededPoints = arrayWithRemovedIElement(allNumbers, i);
            double neededAngle = getNearPointAngle(numberOfNeededPoints, i);
            allAnglesSizeQuantity += neededAngle;
        }
        return allAnglesSizeQuantity;
    }

    boolean triangleExistionByAngles() {
        boolean exist = false;
        if(allAnglesSize() <= 180) exist = true;
        return exist;
    }

    public void area() {
        /*
         * By the Geron's Formula
         */
        if ( this.triangleExistion(ABSideLength, BCSideLength, CASideLength) ) {
            double halfPerimeter;
            halfPerimeter = (ABSideLength + BCSideLength + CASideLength) / 2;
            area = Math.sqrt( halfPerimeter *
                    (halfPerimeter - ABSideLength) *
                    (halfPerimeter - BCSideLength) *
                    (halfPerimeter - CASideLength)
            );
        } else {
            System.out.println("Triangle doesn't exist!");
        }
    }

    public void maxLength() {
        this.maxLength = ABSideLength;
        if( BCSideLength > maxLength ) {
            maxLength = BCSideLength;
        } else if ( CASideLength > maxLength ) {
            maxLength = CASideLength;
        }
    }

}