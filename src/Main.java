import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] a = {"yy","on","iyirmi","otuz","qirx","elli","altmis","yetmis","seksen","doxsan"};
        System.out.print("eded daxil edin (yuzden kicik olmalidi) : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int q = num%10;
        int r = num/10;
        if(num==0){
            System.out.print("sifir");
        }
        if(num==100){
            System.out.println("yuz");
        }
        System.out.print(a[r]+" ");
        switch (q){
            case 1:
                System.out.print("bir");break;
            case 2:
                System.out.print("iki");break;
            case 3:
                System.out.print("uc");break;
            case 4:
                System.out.print("dord");break;
            case 5:
                System.out.print("bes");break;
            case 6:
                System.out.print("alti");break;
            case 7:
                System.out.print("yeddi");break;
            case 8:
                System.out.print("sekkiz");break;
            case 9:
                System.out.print("doqquz");break;
            default:
                System.out.println("Sehv verilen!!!");
        }
    }
}
