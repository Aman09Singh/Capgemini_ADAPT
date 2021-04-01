package Intermediate;

public class DatabasePersistence extends Persistence{

    @Override
    void persist() {
        System.out.println("Persist method in the DatabasePersistence Class");
    }
}
