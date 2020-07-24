import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Dictionary{
    static String x[] = {"Aaron","Aback","Abaddon","Abaft","Accent","Access","Balcony","Bulwark","Bunch"};
    static String z[]={"The Brother of Moses and high priest of the jews(noun.)","Backwards(adv.)",
            "Hell(noun.)","At or near the stern half of a Ship(adv. & prep.)","Modulation or tone of voice(noun.",
            "Approach(noun)","A platform projecting from the wall of a building","A rampart(noun)","A tuft or cluster(noun)"};
    static int i,j=0,u=0;
    static int gt[] = new int[100];
    static boolean p;
    static char f;
    public  static  void main(String str[])
    {
        x = Stream.of(x).sorted().toArray(String[]::new);
        System.out.println("The words are in sorted order: "+ Arrays.toString(x));
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Keyword");
            String y = sc.nextLine();
            String out = y.substring(0, 1).toUpperCase() + y.substring(1);
            CharSequence sp = out;
            for (i = 0; i < x.length; i++) {
                p = x[i].contains(sp);
                if (p) {
                    System.out.println("Index:" + (j + 1) + " " + "Word found:" + x[i]);
                    j++;
                    gt[j]=i;
                }
                if(out.charAt(0)!=x[i].charAt(0))
                    u++;
            }
            if(u==x.length){
                System.out.println("The Word containing the above keyword is not found..");
                System.exit(0);
            }
            if (j == 0) {
                System.out.println("The Word containing the above keyword is not found..");
                System.out.println("Suggestions: ");
                String pr = out.substring(0,out.length()-1);
                Dictionary.dict(pr);
            }
            while(true) {
                System.out.println("To exit press '*' or to back to continue press '#': ");
                f = sc.next().charAt(0);
                if (f == '*'){
                    System.out.println("See you again");
                    System.exit(0);}
                else if (f == '#') {
                    System.out.println("Enter the Index of the number: ");
                    int k = sc.nextInt();
                    System.out.println(z[gt[k]]);
                }
                }
    }
        public static  void  dict(String pqr)
        {
            Scanner sc = new Scanner(System.in);
            CharSequence sp = pqr;
            for (i = 0; i < x.length; i++) {
                p = x[i].contains(sp);
                if (p) {
                    System.out.println("Index:" + (j + 1) + " " + "Word found:" + x[i]);
                    j++;
                    gt[j] = i;
                }
            }
            if (j == 0) {
                String pr = pqr.substring(0,pqr.length()-1);
                Dictionary.dict(pr);
            }
            while(true) {
                System.out.println("To exit press '*' or to back to continue press '#': ");
                f = sc.next().charAt(0);
                if (f == '*'){
                    System.out.println("See you again");
                    System.exit(0);}
                else if (f == '#') {
                    System.out.println("Enter the Index of the number: ");
                    int k = sc.nextInt();
                    System.out.println(z[gt[k]]);
                }
            }
        }
}
