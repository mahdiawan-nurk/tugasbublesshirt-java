import java.util.Scanner;
public class sorting{
	public static void main (String args [])
	{
		int ember,d;
		
        Scanner scan = new Scanner(System.in);
		// int a[] ={6,8,3,2,4};
        System.out.print("Masukan Panjang data : ");
        d=scan.nextInt();
        Integer[] a = new Integer[d];
        for(int bar = 0; bar < a.length; bar++){
                System.out.format("List Value nilai: ", bar);
                a[bar] = scan.nextInt();
        }

        // for(int i=0; i < a.length; i++){  
                 // for(int j=1; j < (a.length-1); j++){  
                 //          if(a[j-1] > a[j]){  
                 //                 //swap elements  
                 //                 ember = a[j-1];  
                 //                 a[j-1] = a[j];  
                 //                 a[j] = ember;  
                 //         }  
                          
                 // }  
         // }  
        
		for (int z=1; z<(a.length-1); z++)
	
			{
				if(a[z-1]>a[z]){
					ember = a[z-1];
					a[z-1]=a[z];
					a[z] = ember;
				}
			}
		for(int z=0; z < a.length; z++){
			System.out.print(a[z]);
		}
	}
}