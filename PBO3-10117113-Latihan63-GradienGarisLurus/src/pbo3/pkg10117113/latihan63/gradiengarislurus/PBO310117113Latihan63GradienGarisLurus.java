/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan63.gradiengarislurus;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menampilkan hasil dari pergitungan mencari gradien
 *            dari garis yang melewati 4 titik  
 *            
 */
public class PBO310117113Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat kd = new Koordinat(2,10,5,7);
        System.out.println("Titik Koordinat : ("+kd.getX1()+","+kd.getY1()
                +") dan ("+kd.getX2()+","+kd.getY2()+")"+"\nGradien : "
                +kd.hitungGradien());
        System.out.println(" ");
        
        Koordinat kd1 = new Koordinat(5, 1, 3, 12);
        System.out.println("Titik Koordinat : ("+kd1.getX1()+","+kd1.getY1()
                +") dan ("+kd1.getX2()+","+kd1.getY2()+")"+"\nGradien : "
                +kd1.hitungGradien());
    }
    
}
