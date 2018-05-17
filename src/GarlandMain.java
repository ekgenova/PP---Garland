import java.util.ArrayList;
import java.util.Scanner;

public class GarlandMain {


    public static void main(String[] args) {

        int garlandDegree = 0;
        String garlandPart = "";

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String s = input;
        int length = input.length();

        String sub = s.substring(0,1);

        for (int i=1;i<=length;i++) {
            String sub2 = s.substring(i,length);
            if (sub2.contains(sub)){
                garlandDegree++;
                sub = sub + s.charAt(i);
                if (sub2.contains(sub)){
                    garlandDegree++;
                    garlandPart = sub;
                    System.out.println("Garland part is: '" + garlandPart + "' and the degree is " + garlandDegree);
                }
            }

        }

    }
}
