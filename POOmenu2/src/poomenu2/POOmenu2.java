package poomenu2;

import java.util.Scanner;

public class POOmenu2 {

    public static void main(String[] args) {
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        
        while(op!=4){
            System.out.println("1. Crear profesor");
            System.out.println("2. Ver profesor");
            System.out.println("3. Actualizar datos del profesor");
            System.out.println("4. Salir");
            System.out.println("Ingrese el número de opcion");
            op = entrada.nextInt();
            if(op == 1){
                System.out.println("------Nuevo profesor-------");
            }else if(op == 2){
                System.out.println("--------Los datos son------");
            }else if(op == 3){
                System.out.println("Programa finalizado");
            }else{
                System.out.println("Opcion incorrecta");
            }
        }
    }
    
}
