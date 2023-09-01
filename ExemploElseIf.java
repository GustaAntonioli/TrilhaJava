
package estruturasCondicionais;
public class ExemploElseIf{

public static void main(String[] args)  {
    
    int idade = 17;

if (idade >= 18) {
    System.out.println("Você é maior de idade.");
}   else if (idade <= 17 && idade >= 1)
        System.out.println("Você é criança.");

    else if (idade >= 60 && idade <= 80)
        System.out.println("Você é Vovô.");
 
    
}
}