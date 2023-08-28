public class ComboLock {
    // private String sectretOne;
    // private String sectretTwo;
    // private String sectretThree;
    // private int presentDial;
    // private String testOne;
    // private String testTwo;
    // private String testThree;

    // public ComboLock(int one , int two , int three){
    // sectretOne = one + "R";
    // sectretTwo = two + "L";
    // sectretThree = three + "R";
    // presentDial = 0;
    // }

    // public void reset(){
    // presentDial =0;
    // }
    // public void turnLeft(int ticks){
    // if(presentDial - ticks < 0){
    // presentDial =39 - (ticks - presentDial);
    // }else if(presentDial + ticks >39){
    // presentDial = ticks - presentDial;
    // }
    // if(!(sectretOne.equals(testOne))){
    // testOne = presentDial + "L";
    // }else{
    // if(!(sectretTwo.equals(testTwo))){
    // testTwo= presentDial + "L";
    // }else{
    // if(!(sectretThree.equals(testThree))){
    // testThree = presentDial + "L";
    // }
    // }
    // }

    // }
    // public void turnRight(int ticks){
    // if(presentDial - ticks < 0){
    // presentDial =39 - (ticks - presentDial);
    // }else if(presentDial + ticks >39){
    // presentDial = ticks - presentDial;
    // }
    // if(!(sectretOne.equals(testOne))){
    // testOne = presentDial + "R";
    // }else{
    // if(!(sectretTwo.equals(testTwo))){
    // testTwo= presentDial + "R";
    // }else{
    // if(!(sectretThree.equals(testThree))){
    // testThree = presentDial + "R";
    // }
    // }
    // }

    // }
    // public boolean open(){
    // if((sectretOne.equals(testOne)) && (sectretTwo.equals(testTwo)) &&
    // (sectretThree.equals(testThree))){
    // return true;
    // }else{
    // return false;
    // }
    // }

    private int result;
    private int presentDial;

    public ComboLock(int secret1, int secret2, int secret3) {
        result = secret1 - secret2 + secret3;
        while (result > 39) {
            result = result - 39;
        }
        while (result < 0) {
            result = result + 39;
        }
        presentDial = 0;
    }

    public void reset() {
        presentDial = 0;
    }

    public void turnLeft(int ticks) {
        presentDial = presentDial - ticks;
        while(presentDial <0){
            presentDial = presentDial + 39;
        }
    }

    public void turnRight(int ticks) {
        presentDial = presentDial + ticks;
        while(presentDial >39){
            presentDial = presentDial - 39;
        }
    }

    public boolean open(){
        if(presentDial == result){
            return true;
        }
        return false;
    }

}
