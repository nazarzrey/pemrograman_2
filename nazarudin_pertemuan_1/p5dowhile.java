public class p5dowhile {
public static void main( String[] args ){
    int i=0;
    do{
        System.out.print(" "+i);
        if(i==20 || i==40 || i==60 || i==80){
            System.out.println("");
        }
        i++;
    }
    while(i<=100);
}
}