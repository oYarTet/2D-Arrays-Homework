void main(){
    int[] mtx = {10,20,15,5,25};
    System.out.println();

    int total = 0;
    double avg;

    for(int x : mtx){
        total += x;
    }
    avg = total / mtx.length;

    System.out.println("Total:  "+total+"; average:  "+avg);
}