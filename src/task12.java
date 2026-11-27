import java.util.Scanner;
void main(){
    int[] mtx = new int[10];
    Scanner scan = new Scanner(System.in);
    System.out.println();

    int cnt=0;
    for(int i=0 ; i< mtx.length ; i++){
        System.out.print("Number #"+(i+1)+":  ");
        mtx[i]=scan.nextInt();
        if(mtx[i]%3==0)cnt++;
    }

    System.out.println();
    System.out.println("Count:  "+cnt);
}