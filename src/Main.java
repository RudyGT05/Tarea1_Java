import java.util.Scanner;

public class Main {
    public static void holaMundo() {
        System.out.println("Hola, Mundo!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option, num1,num2, suma, parim, facto, facto1,numtabla=1, tabla, nummul=1, numerin;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Salir");
            System.out.println("7.Bonus");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    System.out.println("Suma dos numeros!");
                    System.out.println("Ingresa el 1er numero");
                    num1 = scanner.nextInt();
                    System.out.println("Ingresa el 2do numero");
                    num2= scanner.nextInt();
                    suma = num1 +num2;
                    System.out.println("El resultado es:"+ suma);

                    break;
                case 3:
                    System.out.println("Determinar si un numero es par");
                    System.out.println("Ingresa el numero a identificar");
                    parim= scanner.nextInt();
                    if(parim % 2 == 0)
                    {
                        System.out.println("El numero es par");
                    }
                    else
                    {
                        System.out.println("El numero es impar");
                    }

                    break;
                case 4:
                    System.out.println("Factorial de un numero");
                    System.out.println("Ingresa el numero al que deseas sacarle el factorial");
                    facto= scanner.nextInt();
                    facto1= facto-1;
                    for(int i= facto-1 ;i>=1;i--) {
                        facto= facto*facto1;
                        facto1= facto1 -1;

                    }
                    System.out.println("El factorial es: " + facto);
                case 5:
                    System.out.println("Tabla de multiplicar");
                    System.out.println("Ingrese el numero del cual desea hacer la tabla");
                    System.out.println("Ascendente");
                    numtabla =scanner.nextInt();
                    for(int i= 1 ;i<=10 ;i++) {
                        tabla= numtabla*i;
                        nummul= nummul+1;

                        System.out.println("Multiplicado por "+i+" el resultado es "+tabla);
                    }
                    System.out.println("Descendente");
                    for(int i= 10 ;i>=1 ;i--) {
                        tabla= numtabla*i;
                        nummul= nummul+1;

                        System.out.println("Multiplicado por "+i+" el resultado es "+tabla);
                    }

                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                case 7:
                    int nummax = Integer.MIN_VALUE;
                    int nummin = Integer.MAX_VALUE;




                    while (true) {
                        System.out.println("Ingresa una serie de números enteros (termina con un número negativo):");
                        numerin = scanner.nextInt();
                        if (numerin < 0) {
                            break;
                        }
                        if (numerin > nummax) {
                            nummax = numerin;
                        }
                        if (numerin < nummin) {
                            nummin = numerin;
                        }
                    }



                        System.out.println("El numero maximo es: " + nummax);
                        System.out.println("El numero minimo es: " + nummin);

                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 6);

        scanner.close();
    }
}
