import java.util.Scanner;
public class E3{
    
    public static void main (String[]args){
        System.out.println("Nombre usuario: ");
        Scanner sc = new Scanner(System.in);
        String nombre;
        String password;
            nombre= sc.nextLine();
      
       
        char pos1=nombre.charAt(0);
        
          
        boolean nook= nombre.equalsIgnoreCase("admin");
        
        String errornombre= (nook == true)? "El usuario \"admin\" no se puede utilizar ":"";
       
         System.out.println("Password");    
         password= sc.nextLine();  
        int passwordl=password.length();
        String passwordok=    (passwordl>7)? "":"El pasword debe tener al menos 8 caracteres";
            
            
             String errornombre2= (pos1>='0' && pos1<='9' )? "El nombre no puede empezar por numero":"";
           
        String mayusculas = password.toLowerCase();
        int mayu=password.compareTo(mayusculas);
        String mayusok= (mayu<0)? "":"El Password debe tener al menos un mayuscula"; 
       
        System.out.println(mayusok);
        
        
        
        System.out.println(errornombre2); 
             System.out.println(errornombre);  
            System.out.println(passwordok);      
            int signo1=password.lastIndexOf(".");
        int signo2=password.lastIndexOf("_");
        int signo3=password.lastIndexOf("@");
        int totalsigno = signo1+signo2+signo3;
        String signook= (totalsigno>-3)? "":"El Password debe tener al menos un .,_,@"; 
        System.out.println(signook);
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
    