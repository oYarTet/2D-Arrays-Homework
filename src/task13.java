import java.util.Scanner;
void main(){
    int[] mtx = {5,2,8,2,7,3,9,5};
    Scanner scan = new Scanner(System.in);
    System.out.println();

    System.out.print("Search:  ");
    int n = scan.nextInt();

    int ni=-1;
    for(int i=0 ; i<mtx.length ; i++){
        if(mtx[i]==n){
            ni=i;
            break;
        }
    }
    if(ni>=0 ){
        System.out.println("Index: "+ni);
    }else System.out.println("Not found");
}