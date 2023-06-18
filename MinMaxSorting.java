import java.util.Scanner;
import java.util.Arrays;

public class MinMaxSorting {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner input=new Scanner(System.in);

        System.out.println("Dizi :" + Arrays.toString(list));

        System.out.print("Bir sayi giriniz :");
        int number=input.nextInt();

        int min= number;
        int max=number;
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        for (int i :list){
            if (i>number){
                max=i;
                break;
            }
        }


        for (int i = list.length-1; i >= 0; i--){
            if (list[i] < number){
                min = list[i];
                break;
            }

        }


        System.out.println("En yakın büyük sayı :" +max);
        System.out.println("En yakın küçük sayı :" +min);

    }


}
