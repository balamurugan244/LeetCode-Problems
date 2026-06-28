public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = " Hello Java World ";
        // 1.length()
        System.out.println("1. length()");
        System.out.println("Length = "+str.length());
        //2.charAt()
        System.out.println("\n2.charAt()");
        System.out.println("Character at index 2 = " +str.charAt(2));
        //3Substring()
        System.out.println("\n3.substring()");
        System.out.println("Substring(2,7)="+str.substring(2,7));
        //4.equals()
        System.out.println("\n4.equals()");
        String str2 = " Hello Java World ";
        System.out.println("str equals str2 ="+str.trim().equals(str2));
        //5.contains()
        System.out.println("\n5.contains()");
        System.out.println("contains 'java'="+str.contains("Java"));
        //6.indexof()
        System.out.println("\n6.indexof()");
        System.out.println("Index of 'java' = " +str.indexOf("Java"));
        //7.replace()
        System.out.println("]n7.replace()");
        System.out.println("After replace = "+str.replace("Java","python"));
        //8.toYpperCase()
        System.out.println("\n8.toUpperCase()");
        System.out.println(str.toUpperCase());
        //9.toLowerCase()
        System.out.println("\n9.toLowerCase()");
        System.out.println(str.toLowerCase());
        //10.trim()
        System.out.println("\n10.trim()");
        System.out.println("'"+str.trim()+"'");


    }
    
}
