package AnisulJava;

public class VariablesJava {

    int a=10;

    static int b=20;

    public void variable1(){

        System.out.println("My name is Hasan");
    }

    static int variable2(){
        int num=50;
        return num;
    }


    public static void main(String[] args) {
        System.out.println(variable2());
        variable2();
        System.out.println(b);

       // VariablesJava obj=new VariablesJava();
       // obj.a=10;
        //obj.variable1();

       new VariablesJava().a=10;
       System.out.println(new VariablesJava().a);
       new VariablesJava().variable1();


    }


}
