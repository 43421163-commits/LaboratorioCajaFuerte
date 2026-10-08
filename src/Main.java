public class Main {
    static void main(String[] args) {
        System.out.println("Iniciando simulador de caja fuerte");
        //Creacion del objeto caja
        CajaFuerte caja = new CajaFuerte("20260001L", "SecureBox A1", 1234, 50000.0);
        System.out.println("Caja fuerte creada correctamente\n");

        //Probando el metodo abrir con la clave correcta
        caja.abrir(1234);

        //Probando el metodo depositar
        caja.depositar(1500.00);

        //Probando el metodo retirar
        caja.retirar(500.00);

        //Probando el metodo mostarEstado
        caja.mostrarEstado();
        caja.cerrar();
        //Probando los metodos anteriores con una clave incorrecta
        caja.abrir(4852);
        caja.depositar(1500.00);
        caja.retirar(500.00);
        caja.mostrarEstado();

    }
}
