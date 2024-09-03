/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFaculty;

/**
 *
 * @author user
 */
class TestAbstraction {
    public static void main(String args[]){
        Faculty admin = new Administrator ("Admin Sinau");
        Faculty teach = new Teacher ("Mengajar Kelas"); 
        
        System.out.println("Tugas Administrator :" + admin.getBagiTugas());
        System.out.println("Tugas Teacher :" + teach.getBagiTugas());
    }
    
}
