public class Box {
    double height;
    double depth;
    double width;

    Box(double ... v){
        height=v[0];
        depth=v[1];
        width=v[2];
    }
    Box(Box obj){
        height=obj.height;
        depth=obj.depth;
        width=obj.width;
    }
    double volume(){
        return height*depth*width;
    }
}
