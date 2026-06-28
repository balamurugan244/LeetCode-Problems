public class StringBufferDemo { 
    public static void main(String[] args) { 
        // Instantiates the built-in Java StringBuffer class
        StringBuffer sb = new StringBuffer("Hello"); 
        
        // 1. append()
        sb.append("Java"); 
        System.out.println("append(): " + sb); 
        
        // 2. insert()
        sb.insert(5, " world "); 
        System.out.println("insert(): " + sb); 
        
        // 3. delete()
        sb.delete(5, 11); 
        System.out.println("delete(): " + sb); 
        
        // 5. reverse()
        sb.reverse(); 
        System.out.println("reverse(): " + sb); 
        
        // Reverse back to original order for subsequent methods
        sb.reverse(); 
        
        // 6. length()
        System.out.println("length(): " + sb.length()); 
        
        // 7. charAt()
        System.out.println("charAt(1): " + sb.charAt(1)); 
    } 
}
