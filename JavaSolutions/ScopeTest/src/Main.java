public class Main {
    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
        outerClass.useInner();
        OuterClass.InnerClass innerClass=outerClass.new InnerClass();
        innerClass.useOuter();

    }
}
