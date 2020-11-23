package singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {

        //Start of Eagerly Loaded Instance
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);

        // creating anotherInstance will ONLY refer to the single instance available.
        DbSingleton anotherInstance = DbSingleton.getInstance();
        System.out.println(anotherInstance);
        // End of Eagerly Loaded Instance


        //Start of Lazily Loaded Instance
        DbSingletonLazy lazyInstance = DbSingletonLazy.getInstance();
        System.out.println(lazyInstance);
        //End of Lazily Loaded Instance
    }
}
