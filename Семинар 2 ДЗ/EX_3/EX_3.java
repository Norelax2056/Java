package EX_3;



public class EX_3 {
    
    public static void main(String[] args) {
        JsonSipleParser parser = new JsonSipleParser();
        Root root = parser.parse();

        System.out.println(root.toString());
        
    }
}
