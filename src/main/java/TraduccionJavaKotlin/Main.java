package TraduccionJavaKotlin;

public class main {
    public static void main(String[] args) {
        ej4();
    }

    public static void ej2(){
        /**
         * En java no es posible dar un valor a una variable con una condición if directamente
         * se debe de escribir la estructura completa para poder hacer esto
         */
        int energia = 80;
        String estado;
        if (energia>50){
            estado="Personaje fuerte";
        } else {
            estado="Personaje debil";
        }
        System.out.println(estado);
    }

    public static void ej4(){
        /**
         * En java de debe crear una variable i que se asigna un valor inicial,
         * luego se compara a un valor final y al finalizar el loop se suma 1, en kotlin se
         * compara con un intervalo definido por dos puntos con la palabra reservada
         * "in" precediendolo, el "continue" funciona igual en ambos idiomas
         */
        for (int i = 1; i < 5; i++) {
            if (i==3){
                continue;
            }
            System.out.println("Numero: "+i);
        }
    }
}
