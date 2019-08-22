package serie_3;

import java.util.Scanner;

public class Serie_3 {

    public static void main(String[] args) {  
        Scanner entrada = new Scanner(System.in);
        int CA1, CA2, CA3, CA4, NO1, NO2, NO3, NO4; 
        
        System.out.print("Ingrese el 1er. carnet: ");
        CA1 = entrada.nextInt();
        System.out.print("Ingrese la nota del 1er. carnet: ");
        NO1 = entrada.nextInt();
        System.out.println("");
        System.out.print("Ingrese el 2do. carnet: ");
        CA2 = entrada.nextInt();
        System.out.print("Ingrese la nota del 2do. carnet: ");
        NO2 = entrada.nextInt();
        System.out.println("");
        System.out.print("Ingrese el 3er. carnet: ");
        CA3 = entrada.nextInt();
        System.out.print("Ingrese la nota del 3er. carnet: ");
        NO3 = entrada.nextInt();
        System.out.println("");
        System.out.print("Ingrese el 4to. carnet: ");
        CA4 = entrada.nextInt();
        System.out.print("Ingrese la nota del 4to. carnet: ");
        NO4 = entrada.nextInt();
        System.out.println("");

       int[] vec = new int[]{NO1,NO2,NO3,NO4};
       Bubble(vec);       
}
    
    public static void Bubble(int[] A){
        int i, j, AUX1;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] > A[j]) {
                    AUX1 = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = AUX1;
                }
            }
        }
          
        for(i=0; i<A.length; i++){
            System.out.println(A[i]);
        } 
}
}

