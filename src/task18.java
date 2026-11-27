void main(){
    int[] mtx = {1,2,3,4,5,6};
    int[] mat = {1,8,3,9,5,10};
    int matches = 0;
    System.out.println();

    for(int i=0 ; i< mtx.length ; i++){
        if(mtx[i]==mat[i])matches++;
    }

    System.out.println("Matches: "+matches);
}