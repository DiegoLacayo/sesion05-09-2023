import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        System.out.println("--Ingrese su sexo (H = Hombre / M = Mujer)--");
        char sexo = lector.next().charAt(0);
        System.out.println("--Ingrese su edad--");
        byte edad = lector.nextByte();
        
        if (edad < 18) {
            System.out.println("--Usted no puede entrar--");
        }
        
        System.out.println("¿Usted lleva un arma consigo? porfavor ingrese (S = Si / N = No)");
        char arma = lector.next().charAt(0);
            
        if (edad >= 18 && sexo == 'H' && arma == 'N') {
            System.out.println("--Usted puede ingresar pero no puede consumir bebidas alcohólicas--");
        }

        if (edad >= 18 && sexo == 'H' && arma == 'S') {
            System.out.println("--Usted no puede entrar--");
        }
            
        if (edad < 18 && sexo == 'H') {
            System.out.println("--Usted no puede entrar--");
        }

        if (edad < 18 && sexo == 'M') {
            System.out.println("--Usted no puede entrar--");
        }

        if (edad >= 18 && sexo == 'M') {
            System.out.println("--Usted puede ingresar pero no puede consumir bebidas alcohólicas--");
        }

        if (edad >= 20 && sexo == 'H') {
            System.out.println("--Usted puede ingresar y puede consumir bebidas alcohólicas--");
        } else  {
            System.out.println("--Usted puede ingresar y puede consumir bebidas alcohólicas--");
        }

        lector.close();
   
    }
}
