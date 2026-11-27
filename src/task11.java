void main(){
    int[] mtx = {2,4,6,8,1,3,5,7};
    System.out.println();

    int sum=0;
    for(int i=1 ; i< mtx.length ; i+=2){
        sum+=mtx[i];
    }

    System.out.println("Sum: "+sum);
}