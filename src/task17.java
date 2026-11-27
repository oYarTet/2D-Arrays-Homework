void main(){
    int[] mtx = {1,3,5,2,4,6};
    int[] dob = new int[mtx.length];
    System.out.println();

    for(int i=0 ; i<mtx.length ; i++){
        dob[i]=mtx[i]*2;

        System.out.print(mtx[i]+" ");
    }
    System.out.println();

    for(int x : dob){
        System.out.print(x+" ");
    }
}