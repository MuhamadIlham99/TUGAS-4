package tugas4;

import java.util.Scanner;
public class cari_Array {
    public static void main(String[] args) {
       int jum = 0;
       int k = 0;
       int x = 0;
       int j = 0;
       
       System.out.print("Masukan jumlah elemen array : ");
       Scanner s = new Scanner(System.in);
      jum = s.nextInt();

       int[] array = new int[jum];
       System.out.println("Masukan nilai array sebanyak : " +jum);
       for (int i=0; i<jum; i++)
       {
        array[i] = s.nextInt();
       }
       
      System.out.print("Masukan nilai array yang akan di cari : ");
      int nilai = s.nextInt();
      
       System.out.print("Nilai dalam array : ");
       for (x = 0; x < jum; x++)
       {
        System.out.print(array[x]);
       }
      
       for (j = 0; j < array.length; j++) {
          if (nilai == array[j])
          {
           System.out.println(" ");
              System.out.println("nilai yang dicari : " +nilai);
              System.out.println("ada pada index ke : "+j);
           k = 1;
           }
       }
       if (k==0){
       System.out.println("\nnilai "+nilai+" tidak ada dalam array");
       }   
    } 
}