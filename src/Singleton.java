public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Creating new instance");
    }

    public static Singleton getInstance() {
        System.out.println("Returning instance");
        return instance;
    }
}
