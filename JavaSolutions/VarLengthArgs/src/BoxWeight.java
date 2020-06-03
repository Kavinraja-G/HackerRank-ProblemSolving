
public class BoxWeight extends Box{
    double weight;

    BoxWeight(double ... a){
        super(a[0],a[1],a[2]);
        weight=a[3];
    }
    BoxWeight(BoxWeight obj){
        super(obj);
        weight=obj.weight;
    }

}
