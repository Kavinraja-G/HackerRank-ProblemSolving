public class Carpet {
    public double cost;
    public Carpet(double cost){
        this.cost=cost;
        }

    public void setCost(double cost) {
        if(cost<0)
            this.cost =0;
        this.cost=cost;
    }

    public double getCost() {
        return this.cost;
    }
}
