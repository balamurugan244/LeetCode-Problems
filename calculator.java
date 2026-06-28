public class calculator {
    static int add(int a,int b){
        return a+b;
    }
    static int multiply(int a,int b){
        return a*b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int divide(int a,int b){
        return a/b;
    }
    public static void main(String[]args){
        System.out.println(add(5,3));
        System.out.println(multiply(5,3));
        System.out.println(sub(5,3));
        System.out.println(divide(5,3));
    }
    
}
