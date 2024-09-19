package calculadora;

public class Calculadora {

    public static void main(String[] args) {
        ventana cal = new ventana();
       cal.setTitle("Calculadora Estandar");
       cal.setBounds(500,100, 495,600);
       cal.setResizable(false);
       cal.inserpanel();
       cal.textos();
       cal.botones();
    }

}
