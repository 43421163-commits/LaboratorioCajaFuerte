public class Main {
    static void main(String[] args) {
        System.out.println("Iniciando simulador de caja fuerte");
        //Creacion del objeto caja
        CajaFuerte caja = new CajaFuerte("20260001L", "SecureBox A1", 1234, 50000.0);
        System.out.println("Caja fuerte creada correctamente\n");

        //Probando el metodo abrir con la clave correcta
        caja.abrir(1234);

        //probando el metodo cerrar
        caja.cerrar();

        //Provando el metodo abrir con claves incorrectas
        caja.abrir(4565);
        caja.abrir(9859);
        caja.abrir(8975);

    }
}
