package DataStructures;

public class Arrays {
    public static void main(String[] args) {
        // Single dimension array
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (i + 1) * 10;
        }
        for (int j = 0; j < arr.length; j++){
            System.out.println("Element at index"+j+": "+ arr[j]);
        }
        // Two dimension array
        int[][] array = new int[10][10];
        for (int k = 0; k < array.length; k++){
            for (int l = 0; l < array.length; l++){
                array[k][l] = ((k+1) * l) * 10;
            }
        }
        System.out.println();
        // printing the two dimension array
        for (int j = 0; j < array.length; j++){
            for (int y = 0; y < array.length; y++){
                System.out.println("Array["+j + "]["+y+"] :"+array[j][y]);
            }
        }
    }
}
