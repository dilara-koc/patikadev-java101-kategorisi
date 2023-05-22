import java.util.Scanner;
public class MinMaxList {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("First number: ");
        a = input.nextInt();

        System.out.print("Second number: ");
        b = input.nextInt();

        System.out.print("Third number: ");
        c = input.nextInt();

        if ((a<b) && (a<c)){
            if (b<c){
                System.out.println("a<b<c: " +a +"<" +b +"<" +c);
            }else {
                System.out.println("a<c<b: " +a +"<" +c +"<" +b);
            }
        }else if ((b<a) && (b<c)){
            if (a<c){
                System.out.println("b<a<c: " +b +"<" +a +"<" +c);
            }else {
                System.out.println("b<c<a: " +b +"<" +c +"<" +a);
            }
        }else if ((c<a) && (c<b)){
            if (a<b){
                System.out.println("c<a<b: " +c +"<" +a +"<" +b);
            }else {
                System.out.println("c<b<a: " +c +"<" +b +"<" +a);
            }
        }else {
            if ((a==b) && (a==c)){
                System.out.println("a=b=c: " +a + "=" +b +"=" +c);
            }else if ((a==b) && (a<c)){
                System.out.println("a=b<c: " +a + "=" +b +"<" +c);
            }else if ((b==c) && (b<a)){
                System.out.println("b=c<a: " +b + "=" +c +"<" +a);
            }else if ((a==c) && (a<b)){
                System.out.println("a=c<b: " +a + "=" +c +"<" +b);
            }else if ((a==b) && (a>c)){
                System.out.println("c<a=b: " +c +"<" +a + "=" +b);
            }else if ((b==c) && (b>a)){
                System.out.println("a<b=c: " +a +"<" +b + "=" +c);
            }else if ((a==c) && (a>b)){
                System.out.println("b<a=c: " +b +"<" +a + "=" +c);
            }
        }
    }
}
