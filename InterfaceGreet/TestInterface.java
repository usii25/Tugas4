/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceGreet;

/**
 *
 * @author user
 */
public class TestInterface {
    public static void main(String[] args) {
        // Membuat objek sapaan dengan bahasa yang berbeda
        EnglishGreeting english = new EnglishGreeting();
        IndonesianGreeting indonesian = new IndonesianGreeting();

        english.sayHello();   
        indonesian.sayHello(); 
    }

}
