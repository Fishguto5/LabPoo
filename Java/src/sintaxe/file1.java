package sintaxe;
import java.util.Scanner;
// em java a classe que é public é a que possui o nome do arquivo, ou seja, ao criar uma nova classe essa não poderá ser do tipo public
public class file1 {
    public static void main(String[] args) {
        Scanner user_num = new Scanner(System.in);
        int number = user_num.nextInt();
        int[] list_int;
        list_int = new int[number];
        for (int i = 0; i < number; i++) {
            Scanner input_number = new Scanner(System.in);
            int real_number = input_number.nextInt();
            list_int[i] = real_number;
            System.out.print(list_int[i]+" ");
        }
    }
}
