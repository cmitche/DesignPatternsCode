package singleton;

public class DbSingleton {

    private static DbSingleton instance = new DbSingleton();

    private DbSingleton(){}
    //private constructor so people can't use "new" to create their own instance;

    public static DbSingleton getInstance(){
        return instance;
    }
}
