package everythingIsAnObjectChapter3;

public class Tank {

    public boolean fillTank;

    public Tank(boolean fillTank) {
        this.fillTank = fillTank;
    }

    public void emptied(boolean emptyTank) {
        if(emptyTank==true){
            this.fillTank = false;
        }
    }

    protected void finalize() {
        if(fillTank==true){
            System.out.println("Error: Exercise 12 tank is not empty ");
        }
    }
}
