public class OuterClass {
    private int var=1;

    public OuterClass() {

    }

    public int getVar() {
        return var;
    }
    public void useInner(){
        InnerClass innerClass=new InnerClass();

        System.out.println("Value of var from outerclass = "+innerClass.var);
    }
    public class InnerClass{
        private int var=2;

        public InnerClass() {
        }

        public int getVar() {
            return var;
        }
        public void useOuter(){
            System.out.println("Value of var from innerclass = "+OuterClass.this.var);

        }
    }
}
