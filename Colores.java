public class Colores{
    public static void main(String arg[]) {

    /*Los colores de texto son código \033[3Xm y \033[9Xm la X va del 1 al 7
      Los colores de fondo son código \033[4Xm y \033[10Xm la X va del 1 al 7
      Los colores extendidos son código (Texto: \033[38;5;Xm) y (Fondo: \033[48;5;Xm) la X va de 0 a 255
      Para la negritas \033[1m.
      Para restablecer todos los valores \033[0m
      *** Es posible convinar negrita, texto y fondo el orden es importante \033[1;3X;4Xm 
            para colores extendidos \033[1;38;5;X;48;5;Xm ***
    */

    System.out.println("");
    System.out.println("\033[1;93;48;5;140m     Plantilla Colores Texto \\033[3Xm, basta cambiar 3X por código correspondiente   \033[0m");
    System.out.println("");
    System.out.println("    COLOR                     CODIGO             COLOR                CODIGO");
    System.out.println("--------------------------------------- | -------------------------------------"); 
    String colores[] = getColor();
    for(String color : colores) {
        System.out.println(color); 
        System.out.println("--------------------------------------- | -------------------------------------"); 
    }
        

    }
        public static String[] getColor() {
            String negro = getColorCodeString("NEGRO", 30);
            String rojo = getColorCodeString("ROJO", 31);
            String verde = getColorCodeString("VERDE", 32);
            String amarillo = getColorCodeString("AMARILLO", 33);
            String azul = getColorCodeString("AZUL", 34);
            String morado = getColorCodeString("MORADO", 35);
            String cian = getColorCodeString("CIAN", 36);
            String blanco = getColorCodeString("BLANCO", 37);

         String result[] = {negro, rojo, verde, amarillo, azul, morado, cian, blanco};
         return result; 
        }

        public static String getColorCodeString(String color, int codigo) {
            String result;
            int codigoClaro = codigo + 60;
            result = String.format("\033[" + codigo + "m    %-14s      %10d\033[0m", color, codigo) + 
                     String.format("\033[" + codigoClaro + "m    %14s CLARO      %10d\033[0m", color, codigoClaro);
            return result;
        }
}
