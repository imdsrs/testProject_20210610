import test.newPackage.*;

import java.io.FileReader;
import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello! World");

        Scanner scanObject = new Scanner(System.in);
        int testIntData;// = scanObject.nextInt();
        String stringTest1 = "aa";
        String stringTest2 = "bb";
        String stringTest3, stringTest4;

        stringTest3 = stringTest1+stringTest2;
        stringTest4 = stringTest1.concat(stringTest2);

        if(stringTest3 == "aabb"){
            System.out.println("11111");
        }
        if(stringTest4 == "aabb"){
            System.out.println("2222");
        }
        if(stringTest3.equals(stringTest4)){
            System.out.println("3333");
        }
        if(stringTest3 == stringTest4){
            System.out.println("4444");
        }

        String stringCheck1 = "Hello!";
        String stringCheck2 = "Hello!";

        if(stringCheck1 == stringCheck2){
            System.out.println("11.11");
        }

        stringCheck2 = "test! changed text";

        if(stringCheck1 == stringCheck2){
            System.out.println("22.11");
        }
        else{
            System.out.println("22.22");
        }

        //**Important start**//
        String grandTotal = String.format("Grand Total: %,.2f", 2222.1588);
        System.out.println(grandTotal);

        System.out.printf("Grand Total: %,.2f\n", 2222.1588);
        //**Important end**//
        //this is a new change

        //newPackageMainClass objForOtherPackage = new newPackageMainClass();
        newPackageSubClass objForOtherPackage = new newPackageSubClass();
        objForOtherPackage.printOnScreen();

        int testCompare = "a".compareTo("c");
        System.out.println(testCompare);

//        try{
//            testIntData = 10/0;
//            FileReader in = new FileReader("");
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//            System.out.println("***");
//            e.printStackTrace();
//        }
//        catch (RuntimeException e){
//            System.out.println(e);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }


//        parentClass testObj = new parentClass();
//        testObj.setIntData(testIntData);
//        System.out.println(testObj.getIntData());
    }
}
