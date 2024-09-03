/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFaculty;

/**
 *
 * @author user
 */
public class Teacher extends Faculty{
    private String tugas;
    public Teacher(String tugas){
        this.tugas = tugas;
    }

    String getBagiTugas() {
        return tugas;
    }
}
