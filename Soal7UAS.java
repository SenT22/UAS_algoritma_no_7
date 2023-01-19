public class Soal7UAS {
    public static void main(String[]agrs){
      int n = 5;
      int i, j;
      for (i = 0; i < n; i++){
        for (j = 1; j < n - i; j++){
            System.out.print(" ");
        }
        for (int a = 0; a <= i; a++){
            System.out.print(a);
        }
        System.out.println();
        }
    }
}
