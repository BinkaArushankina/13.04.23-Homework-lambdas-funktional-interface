package Homework;

public class Main {
    /*
    Napisatj sledujuschie lambdi ispolsuja naschi interface
    1. concatinirowatj stroki a i b; a+b
    2. estj stroka, esli ee dlina rawna 3 wernutj true inatsche false
    3. estj stroka string, raspetschatatj ee w wide !string!
     */
    public static void main(String[] args) {
        //1)
        StringConcate stringConcate= (a,b) -> Integer.toString(a)+(b);

        System.out.println(stringConcate.concat(3,5));  //35


        //2)
        Checkable checkable= s -> (s.length()==3) ? true : false;

        System.out.println(checkable.check("abc")); //true


        //3)
        Printable printable= s -> {  System.out.println("!".concat(s).concat("!"));  };

        printable.print("string");   //!string!


    }

}
