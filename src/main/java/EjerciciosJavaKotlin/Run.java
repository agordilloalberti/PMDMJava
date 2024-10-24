package EjerciciosJavaKotlin;

import java.util.ArrayList;
import java.util.Scanner;
import Ayudas.*;

public class Run {
    private static final Scanner sc = Ayudas.sc;
    public static void main(String[] args) {
        System.out.println("Ejercicios del tema 2 por Álvaro Gordillo Suano");
        String op;
        do {
            System.out.println("Escriba unicamente el número del ejercicio que desea comprobar, \"0\" para salir\"");
            op=sc.nextLine();
            switch (op){
                case "1":
                    ej1();
                    break;
                case "2":
                    ej2();
                    break;
                case "3":
                    ej3();
                    break;
                case "4":
                    ej4();
                    break;
                case "5":
                    ej5();
                    break;
                case "6":
                    ej6();
                    break;
                case "7":
                    ej7();
                    break;
                case "8":
                    ej8();
                    break;
                case "9":
                    ej9();
                    break;
                case "10":
                    ej10();
                    break;
                case "11":
                    ej11();
                    break;
                case "12":
                    ej12();
                    break;
                case "13":
                    ej13();
                    break;
                case "14":
                    ej14();
                    break;
                case "0":
                    System.out.println("Ten un buen dia despues de comprobar mi arte ;)");
                    break;
                default:
                    System.out.println("Opción no válida, introduzca un valor dentro del conjunto");
            }
        }while (!op.equals("0"));
        System.out.println("Fin");
    }

    private static void ej1(){
        System.out.println("Por favor escriba su nombre:");
        String nombre = sc.nextLine();
        System.out.println("¡Hola "+nombre+"!");
    }

    private static void ej2(){
        System.out.println("Indique un número para comprobar si es par");
        String input = sc.nextLine();
        try {
            int num = Integer.parseInt(input);
            if (num%2==0){
                System.out.println("El número "+num+" es par");
            }else {
                System.out.println("El número "+num+" no es par");
            }
        }catch (Exception e){
            System.out.println("Debe introducir un número entero");
        }
    }

    private static void ej3(){
        System.out.println("Introduzca el radio de su circulo");
        String radioS = sc.nextLine();
        try {
            double radio = Double.parseDouble(radioS);
            System.out.println("El área de su circulo es "+Ayudas.round(Math.PI*Math.pow(radio,2),2));
        }catch (Exception e){
            System.out.println("Debe introducir un número");
        }
    }

    private static void ej4(){
        int num = (int) Math.round(Math.random() * 100);
        System.out.println("Se ha generdo un número del 1 al 100, intente adivinarlo");
        int op;
        String input;
        do {
            input=sc.nextLine();
            try {
                op=Integer.parseInt(input);
                if (op>num){
                    System.out.println("El número es mas pequeño");
                } else if (op<num) {
                    System.out.println("El número es mas grande");
                }
            }catch (Exception e){
                System.out.println("Debe introducir un número");
                op=-1;
            }
        }while (op!=num);
        System.out.println("Exacto el número era "+num+", enhorabuena ¡Has ganado!");
    }

    private static void ej5(){
        System.out.println("Introduzca el número del que desea saber la tabla de multiplicar");
        String numS = sc.nextLine();
        try {
            int num = Integer.parseInt(numS);
            for (int i = 1; i <=10 ; i++) {
                System.out.println(num+" por "+i+" es "+num*i);
            }
        } catch (Exception e) {
            System.out.println("Debe introducir un número entero");
        }
    }

    private static void ej6(){
        System.out.println("Se van a sumar todos los números del 1 al 100");
        int sum=0;
        for (int i = 1; i <=100; i++) {
            sum+=i;
        }
        System.out.println("El total es "+sum);
    }

    private static void ej7(){
        System.out.println("Introduzca una cadena de caracteres para imprimirla invertida");
        String input = sc.nextLine();
        StringBuilder revertida = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
            revertida.append(input.charAt(i));
        }
        System.out.println("La cadena original era: \""+input+"\", invertida queda asi: \""+revertida+"\"");
    }

    private static void ej8(){
        System.out.println("Introduzca una cadena de caracteres para contar las vocales");
        String inputS = sc.nextLine();
        char[] input = inputS.toUpperCase().toCharArray();
        char[] vocales = {'A','E','I','O','U'};
        int cont =0;
        for (char c : input) {
            for (char v : vocales) {
                if (c == v) {
                    cont++;
                    break;
                }
            }
        }
        System.out.println("La cadena \""+inputS+"\" tiene un total de "+cont+" vocales");
    }

    private static void ej9(){
        System.out.println("Introduzca un número para comprobar si es primo");
        String input = sc.nextLine();
        try {
            int num = Integer.parseInt(input);
            boolean primo = true;
            if (num>2){
                for (int i = 2; i < num; i++) {
                    if (num%i==0){
                        primo=false;
                        break;
                    }
                }
            }
            if (primo){
                System.out.println("El número "+num+" es primo");
            }else {
                System.out.println("El número "+num+" no es primo");
            }
        } catch (Exception e) {
            System.out.println("Debe introducir un número entero");
        }
    }

    private static void ej10(){
        char o;
        do {
            System.out.println("Debe elegir uno de los dos tipos de conversión admitidos, de Celsius a Fahrenheit (F) o viceversa (C)");
            o = sc.nextLine().toUpperCase().charAt(0);
        }while (o!='F' && o!='C');

        System.out.println("Indique los grados "+o);
        String gradosS = sc.nextLine();

        try {
            double r;
            double grados = Double.parseDouble(gradosS);

            if (o=='C'){
                r=(grados-32)*5/9;
            } else {
                r=grados*9/5+32;
            }
            System.out.println("La temperatura en grados "+o+" es de "+r);
        } catch (Exception e) {
            System.out.println("Debe introducir un número");
        }
    }

    private static void ej11(){
        System.out.println("Introduzca la cantidad de números de la secuencia de fibonacci que desea obtener");
        String nS = sc.nextLine();
        try {
            int n = Integer.parseInt(nS);
            StringBuilder r = new StringBuilder("0,1");

            for (int i = 0; i <= n; i++) {
                String[] arr = r.toString().split(",");
                r.append(",").append(Integer.parseInt(arr[arr.length - 1])+Integer.parseInt(arr[arr.length - 2]));
            }
            System.out.println("Aqui tiene "+n+" números de la secuencia de fibonacci:\n"+r);
        } catch (Exception e) {
            System.out.println("Debe introducir un número entero");
        }
    }

    private static void ej12(){
        System.out.println("Introduzca una secuencia de números para imprimirla invertida");
        String input = sc.nextLine();
        StringBuilder revertida = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
            revertida.append(input.charAt(i));
        }
        System.out.println("La secuencia original era: \""+input+"\", invertida queda asi: \""+revertida+"\"");
    }

    private static void ej13(){
        class Anime{
            private String nombre;
            private int episodios;
            private String genero;

            public Anime(String nombre, int episodios, String genero) {
                this.nombre = nombre;
                this.episodios = episodios;
                this.genero = genero;
            }

            @Override
            public String toString() {
                return "El nombre del anime es: "+nombre+", pertenece al genero "+genero+" y tiene "+episodios+" episodios ";
            }
        }
        System.out.println("Introduzca el nombre del anime");
        String nombre = sc.nextLine();
        System.out.println("Introduzca el número de espisodios del anime");
        int episodios = sc.nextInt();
        System.out.println("Introduzca el genero del anime");
        String genero = sc.nextLine();

        Anime a = new Anime(nombre,episodios,genero);
        System.out.println(a);
    }

    private static void ej14() {
        class Videojuego {
            public String titulo;
            public String plataforma;
            public double horasJugadas;

            public Videojuego(String titulo, String plataforma, double horasJugadas) {
                this.titulo = titulo;
                this.plataforma = plataforma;
                this.horasJugadas = horasJugadas;
            }

            public static String eliminarJuego(ArrayList<Videojuego> inventario) {
                System.out.println("Introduzca el nombre del juego a eliminar");
                String n = sc.nextLine().toLowerCase();
                String r = "No se ha encontrado el juego\n";
                for (Videojuego v : inventario){
                    if (v.titulo.toLowerCase().equals(n)){
                        inventario.remove(v);
                        r="El juego "+v.titulo+" ha sido eliminado del inventario\n";
                        break;
                    }
                }
                return r;
            }

            @Override
            public String toString() {
                return "El juego: " + titulo + ", esta disponible en " + plataforma + " y llevas " + horasJugadas + " horas jugadas\n";
            }

            public static String crearJuego(ArrayList<Videojuego> i) {
                System.out.println("Introduzca el nombre del juego");
                String t = sc.nextLine();
                System.out.println("Introduzca la plataforma en la que se puede jugar al juego");
                String p = sc.nextLine();
                System.out.println("Introduzca las horas jugadas");
                String hS = sc.nextLine();
                try {
                    double h = Double.parseDouble(hS);
                    i.add(new Videojuego(t, p, h));
                    return "Se ha añadido el juego con exito";
                } catch (Exception e) {
                    return "Se ha introducido un valor incorreto, el juego no ha sido añadido";
                }
            }
        }

        ArrayList<Videojuego> inventario = new ArrayList<>();
        String op;
        do {
            System.out.println("¿Que desea hacer?\n1.Añadir un juego.\n2.Eliminar un juego.\n3.Mostrar el inventario.\n0.Salir");
            op = sc.nextLine();
            switch (op){
                case "1":
                    System.out.println(Videojuego.crearJuego(inventario));
                    break;
                case "2":
                    if (!inventario.isEmpty()) {
                        System.out.println(Videojuego.eliminarJuego(inventario));
                    }else {
                        System.out.println("No hay juegos en el inventario");
                    }
                    break;
                case "3":
                    if (!inventario.isEmpty()){
                        for (Videojuego v : inventario){
                            System.out.println(v);
                        }
                    }else {
                        System.out.println("No hay juegos en el inventario");
                    }
                    break;
                case "0":
                    System.out.println("Gracias por usar esta aplicación, adiós");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while (!op.equals("0"));
    }
}
