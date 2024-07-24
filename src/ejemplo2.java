public class ejemplo2 {
    public static void main(String[] args){
        //Este es un comentario, corto
        /*Este es un comentarios
        * en varias
        * lineas*/
        System.out.println("Hola, Java");

        //Para escribir variables, decimos de que tipo:
        String myString = "Esto es una cadena de texto";

        myString = "Aqui cambio el valor de cadena de texto";
        System.out.println(myString);

        //Enteros o Int en operaciones basicas
        Integer myInt= 7;
        myInt = myInt + 4;
        System.out.println(myInt);
        System.out.println(myInt - 1);

        //Ahora para decunales
        Double myDouble = 6.5;
        System.out.println(myDouble);

//la diferencia en Double y Float es la longitud
        float myFloat = 6.5f;
        System.out.println(myFloat);

        System.out.println(myDouble + myFloat);
    }
}