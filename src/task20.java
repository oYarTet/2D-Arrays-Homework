void main(){
    int[][] mtx = {
            {2,8,3,1},
            {9,4,6,5},
            {7,0,11,2}
    };

    for(int[] x : mtx){
        int mx = x[0];
        for(int y : x){
            if(y>mx)mx=y;
        }
        System.out.print(mx+", ");
    }
}