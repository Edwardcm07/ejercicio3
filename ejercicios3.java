// Primera parte:
// Crear una función con tres parámetros que sean números que se suman entre sí.
// Llamar a la función en el main y darle valores.
class Main {
    public static void main(String[] args) {

        int num1, num2, num3, resultado;

        num1 = 10;
        num2 = 20;
        num3 = 30;
        resultado = num1 + num2 + num3;

        System.out.println(resultado);

    }
}

// Segunda parte:
// Crear una clase coche.
// Dentro de la clase coche, una variable numérica que almacene el número de
// puertas que tiene.
// Una función que incremente el número de puertas que tiene el coche.
// Crear un objeto miCoche en el main y añadirle una puerta.
// Mostrar el número de puertas que tiene el objeto.
class coche {

    public static void main(String[] args) {

        int puertasCoche = 2;
        int otraPuerta = 1;
        // Con una suma incremento el numero de puertas
        System.out.println(miCoche(puertasCoche, otraPuerta));
        // con un operador de incremento, incremento el numero de puertas
        System.out.println("mi coche tiene " + puertasCoche++ + " puertas");
        System.out.println("mi coche tiene " + puertasCoche++ + " puertas");
        System.out.println("mi coche tiene " + puertasCoche++ + " puertas");
        System.out.println("mi coche tiene " + puertasCoche++ + " puertas");
    }

    public static int miCoche(int puertasCoche, int otraPuerta) {

        return puertasCoche + otraPuerta;

    }
}
