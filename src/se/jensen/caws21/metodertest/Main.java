package se.jensen.caws21.metodertest;

public class Main{

    // Det här är "main-metoden", och den anropas alltid automatiskt när vi kör vår kod.
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        // Här anropar vi metoden "addition" med två argument (number1, number2) och sparar vad den metoden retunerar i variabeln "myTotal".
        int myTotal = addition(number1, number2);

        System.out.println("The total is: " + myTotal);
    }

    public static int addition(int numA, int numB) { // Det här är vår nya metod
        int total = numA + numB;

        // Här skickar vi tillbaka innehållet i variabeln "total" till där vi anropade den här metoden
        return total;
    }
}
