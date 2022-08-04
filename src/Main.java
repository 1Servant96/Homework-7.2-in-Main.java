//import org.w3c.dom.ls.LSOutput;

//import java.sql.SQLOutput;
//import java.util.Random;

/**search the shorcuts of IntelIdea   . If the classes in one package(like com.company) you don't need in public*/
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] rgs) {
        Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       int a = scanner.nextInt();
       int[]massive = new int[100];
       int counter = 0;
       int i = 0, indexOf = 0;
        for (int j = 0; j < massive.length; j++) {
            massive[j]= random.nextInt(1,100);
        }
        System.out.println(Arrays.toString(massive));
        while(i<massive.length){
            if(a==massive[i]){
                counter++;
                indexOf = i;
                break;
            }
            i++;
        }
        String result = counter>0 ? "Same number in index: "+ i : "No same number";
        System.out.println(result);



       
