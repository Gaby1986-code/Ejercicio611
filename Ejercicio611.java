import java.util.Scanner;
public class Ejercicio611 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //Declaramos las CONSTANTES y variables
        final char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't','u', 'v'};
        final char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r','k', 'q', 's'};
        
        char codificado[];
        String texto;
        System.out.println("Introduzca un texto a codificar: ");
        texto=scanner.nextLine();
        texto = texto.toLowerCase();

        codificado = new char[texto.length()];
        
        for (int i= 0; i<texto.length(); i++) {
            codificado [i] = codifica(conjunto1, conjunto2, texto.charAt(i));
        
        }
        texto= String.valueOf(codificado);
        System.out.println(texto);
    
        
        // Preguntar al usuario si quiere decodificar
        System.out.print("¿Desea decodificar el texto? (s/n): ");
        String respuesta = scanner.nextLine().toLowerCase();

        if (respuesta.equals("s") || respuesta.equals("si")) {
            String textoDecodificado = decodifica(conjunto1, conjunto2, texto);
            System.out.println("Texto decodificado: " + textoDecodificado);
     
    
     }
    
  }
static char codifica(char conjunto1[], char conjunto2[], char c) {

    final String conj1 = String.valueOf(conjunto1);
    int pos = conj1.indexOf(c);
    if (pos == -1) {
        return c;
    } else {
        return conjunto2[pos];
    }
}
  //Se decodifica el texto usando la función codifica.
    static String decodifica(char conjunto1[], char conjunto2[], String texto) {
        texto= texto.toLowerCase();
        char[] decodificado = new char[texto.length()];
        for(int i = 0; i < texto.length(); i++) {
            decodificado[i] = codifica(conjunto2, conjunto1, texto.charAt(i));

         }
   return String.valueOf(decodificado);
        

   }


 }
