import java.util.Scanner;
void main(){
    int[] mtx = {4,12,7,20,3,0,-5};
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Limit:  ");
    int lim= scan.nextInt();

    for(int i=0 ; i<mtx.length ; i++){
        if(mtx[i]>lim)mtx[i]=lim;

        System.out.print(mtx[i]+" ");
    }
}