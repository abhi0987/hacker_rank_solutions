import java.util.Scanner;

/**
 * Created by bitu on 16/3/17.
 */
public class CesarCipher {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String s= sc.next();
        int k = sc.nextInt();
        k = k%26;
        StringBuilder builder = new StringBuilder();

        for (int i =0;i<s.length();i++){


            if (Character.isLetter(s.charAt(i))){
                int chVal = s.charAt(i);

                if (s.charAt(i) >= 65 && s.charAt(i) <= 90){
                    chVal = chVal+k;

                    if (chVal > 90){
                        chVal = chVal-26;
                    }
                }else if (s.charAt(i) >= 97 && s.charAt(i) <=122){
                    chVal = chVal+k;

                    if (chVal > 122){
                        chVal = chVal-26;
                    }
                }

                builder.append((char)chVal);

            }else {
                builder.append(s.charAt(i));
            }
        }

        System.out.println(builder.toString());
    }

}
