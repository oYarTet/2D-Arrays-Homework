void main(){
    int[][] mtx = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    for(int[] x : mtx){
        int sum=0;
        for (int y : x){
            sum+=y;
        }
        System.out.print(sum+", ");
    }
}