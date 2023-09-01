public class ExemploSwitchCase {
    public static void main(String[] args) throws Exception{
        
        String plano = "T";

        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");
            }
                break;
            
            case "M":{
                System.out.println("Whatsapp e Instagram grátis");
            }
                break;
                
            case "B":{
                System.out.println("100 minutos de ligação");
            }
                break;
        }
    }
}
