package tasks;

public class Task16 {

    // Animal interface
    interface Animal {
        boolean feed(boolean timeToEat);
        void groom();
        void pet();
    }

    // Gorilla class
    static class Gorilla implements Animal {

        @Override
        public boolean feed(boolean timeToEat) {
            if (timeToEat) {
                // put gorilla food into cage
                System.out.println("Feeding gorilla... Food is placed in the cage.");
                return true;
            } else {
                System.out.println("It's not feeding time.");
                return false;
            }
        }

        @Override
        public void groom() {
            // lather, rinse, repeat
            System.out.println("Grooming gorilla... Lather, rinse, repeat.");
        }

        @Override
        public void pet() {
            // pet at your own risk
            System.out.println("Petting the gorilla... Pet at your own risk!");
        }
    }

    // Main method to test Gorilla behavior
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        System.out.println("Attempting to feed gorilla:");
        gorilla.feed(true);

        System.out.println("\nGrooming gorilla:");
        gorilla.groom();

        System.out.println("\nTrying to pet gorilla:");
        gorilla.pet();
    }
}
