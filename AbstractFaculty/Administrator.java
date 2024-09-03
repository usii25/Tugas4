/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFaculty;

/**
 *
 * @author user
 */
class Administrator extends Faculty{
    private String Tugas;
    public Administrator(String Tugas){
        this.Tugas = Tugas;
    }
    @Override
    String getBagiTugas() {
        return Tugas;
    }

}
