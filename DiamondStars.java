import java.util.*;

public class DiamondStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of Lines:");
        int n = sc.nextInt();
        sc.close();
//Upper Left Part
        //Outer Loop
        for (int i=0; i<=n; i++){
            //Spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }      
            //Stars
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
        
//Upper Right Part
                  
            //Stars
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            //Spaces
            for (int j=(n-i); j>=1; j--){
                System.out.print(" ");
            }  
            System.out.println();
        }

//Lower Left Part
        //Outer Loop
        for (int i = n; i>=1; i--) {
            
        
            //Spaces
            for (int j=0; j<=(n-i); j++){
                System.out.print(" ");
            }      
            //Stars
            for (int j=i; j>=1; j--){
                System.out.print("*");
            }
        
//Lower Right Part
                  
            //Stars
            for (int j=i; j>=1; j--){
                System.out.print("*");
            }
            //Spaces
            for (int j=0; j<=(n-i); j++){
                System.out.print(" ");
            }     

            System.out.println();

        }
    }

}
