import java.util.Scanner;
public class nazarduin_231011450485_dowhile{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int y;
        int z;
        System.out.print("coba mauskin nilai y : ");
        y=input.nextInt();
        System.out.print("coba mauskin nilai z : ");
        z=input.nextInt();
        do{
            System.out.println("Statemen 1, nilai y : "+y);
            if(y==1){
                System.out.println("Statatemen 2, nilai y : "+y);
                System.out.println("Proses 1");
                System.out.println("nilai dari y + z / "+y+" + "+z+" adalah "+(y+z));
            }
            if(y==2){
                System.out.println("Kembali ke S1, nilai xy: "+y);
                break;
            }
        } while (y==2);
        System.out.println("Statemen 3, nilai Y = "+y);
        input.close();
    }
}