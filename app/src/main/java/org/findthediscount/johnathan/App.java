/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.findthediscount.johnathan;

public class App {
    public double findtheDiscount(double fullPrice, double discount) {
        return fullPrice - ((discount / 100) * fullPrice);
    }

    public static void main(String[] args) {
       double fullPrice;
       fullPrice = 2384;
       double discount;
       discount = 24;
        System.out.println(new App().findtheDiscount( fullPrice, discount));
        
    }
}
