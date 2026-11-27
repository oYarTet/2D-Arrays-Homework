import java.util.Scanner;
void main(){
    int[] mtx = new int[6];
    Scanner scan = new Scanner(System.in);
    System.out.println();

    int pasd=0;
    for(int i=0 ; i< mtx.length ; ){
        System.out.print("Score #" + (i+1) + ":  ");
        int x = scan.nextInt();

        if(x>=0 && x<=100){
            mtx[i]=x;
            if(mtx[i]>=60)pasd++;
            i++;
            continue;
        }
        System.out.println("\tIncorrect score. try again");
    }
    System.out.println();
    System.out.println("Passed:  "+pasd);

}