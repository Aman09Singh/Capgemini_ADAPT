package Intermediate;

import javax.xml.crypto.Data;

public class Assignment2Q6 {

    public static void main(String[] args) {

        System.out.println("Say this is the Client Class");

        Persistence ob2 = new Persistence() {
            @Override
            void persist() {
                System.out.println("In the main class");
            }
        };

        if(ob2.getClass() == FilePersistence.class){
            System.out.println("File Persistence");
        }else if (ob2.getClass() == DatabasePersistence.class){
            System.out.println("DatabasePersistence");
        }else if(ob2.getClass() == Persistence.class){
            System.out.println("Persistence ");
        }

    }


}
