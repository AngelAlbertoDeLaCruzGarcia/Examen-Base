import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//////////////////////////////////////////////////////
/*                                                  //
/FECHA           : 31-JUL-2022                      //
/@AUTOR           : Angel Alberto De La Cruz Garcia //
*/                                                  //
//////////////////////////////////////////////////////
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner tecla = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int exit;
        do {
            procesar();
            System.out.println("Presione enter para continuar");
            br.readLine();
            System.out.println("¿Desar procesar realizar una vez mas el proeceso?");
            System.out.println("1.-Si, 2.-No");
            exit = tecla.nextInt();
        }while(exit == 1);
    }
    public static void procesar() {
        String nombre;
        int edad, resultado;
        char sexo;
        double peso, altura;
        Persona comprobar = new Persona();
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingresa nombre:");
        nombre = tecla.nextLine();
        System.out.println("Ingresa edad:");
        edad = tecla.nextInt();
        System.out.println("Ingresa tu sexo: H | M");
        sexo = tecla.next().charAt(0);
        while (!comprobar.comprobarSexo(sexo)) {
            System.out.println("Ingrese sexo valido:");
            sexo = tecla.next().charAt(0);
        }
        System.out.println("Ingresa peso (kg):");
        peso = tecla.nextDouble();
        System.out.println("Ingresa estatura (m):");
        altura = tecla.nextDouble();
        Persona per = new Persona(nombre, edad, sexo, peso, altura);
        System.out.println();
        resultado = per.calcularIMC();
        if(resultado == -1) {
            System.out.println("Falta de peso");
        }else if(resultado == 0) {
            System.out.println("Peso normal");
        }else if(resultado == 1) {
            System.out.println("Sobrepeso");
        }
        if(per.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
        System.out.println(per.toString());
    }
}
