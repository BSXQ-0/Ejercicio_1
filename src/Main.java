import java.util.*;
/*
        ENUNCIADO
    Una clínica médica necesita modelar un Paciente que pueda cambiar su estado
    físico y condición médica a lo largo del tiempo.
    En el main
    1. Mostrar información inicial.
    2. Crear un menú interactivo que permita:
    o Crear pacientes
    o Buscar
    o Modificar edad
    o Modificar peso
    o Modificar presión
    o Cambiar estado (estable / inestable)
    o Mostrar información
    o Salir
    3. Mostrar la información antes y después de cada cambio
 */
void main() {

    Scanner teclado = new Scanner(System.in);
    ArrayList<Paciente> ltspacientes = new ArrayList<>();
    int opc1;
    String nombreB;

    do{
        System.out.println("""
                    Menu
                        1. Crear pacientes
                        2. Buscar
                        3. Modificar edad
                        4. Modificar peso
                        5. Modificar presión
                        6. Cambiar estado (estable / inestable)
                        7. Mostrar información
                        8. Salir
                """);
        opc1 = teclado.nextInt();
        switch (opc1){
            case 1:
                System.out.print("Nombre: ");
                String nombre = teclado.nextLine();

                System.out.print("Edad: ");
                int edad = teclado.nextInt();

                System.out.print("Peso: ");
                double peso = teclado.nextDouble();

                System.out.print("Presion arterial: ");
                double presion = teclado.nextDouble();

                System.out.print("¿Paciente estable? (true/false): ");
                boolean estable = teclado.nextBoolean();

                Paciente pac = new Paciente(nombre, edad, peso, presion, estable);
                ltspacientes.add(pac);

                System.out.println("Paciente creado correctamente.");
                break;
            case 2:
                System.out.println("Ingrese el nombre a buscar:");
                nombreB = teclado.next();
                Paciente paciente = null;

                for (Paciente p: ltspacientes) {
                    if (p.getNombre().equalsIgnoreCase(nombreB)){
                        paciente=p;
                    }
                }
                System.out.println(paciente.mostrarHistoriaClinica());
                break;
            case 3:
                System.out.println("Ingrese el nombre a buscar:");
                nombreB = teclado.next();

                for (Paciente p : ltspacientes) {

                    if (p.getNombre().equalsIgnoreCase(nombreB)) {

                        System.out.println("Antes: ");
                        p.mostrarHistoriaClinica();

                        p.cumplirAnios();

                        System.out.println("Despues: ");
                        p.mostrarHistoriaClinica();
                    }
                }
                break;
            case 4:
                System.out.println("Ingrese el nombre a buscar:");
                nombreB = teclado.next();
                for (Paciente p : ltspacientes) {

                    if (p.getNombre().equalsIgnoreCase(nombreB)) {

                        System.out.println("Antes: ");
                        p.mostrarHistoriaClinica();

                        System.out.println("1. Aumentar peso");
                        System.out.println("2. Disminuir peso");

                        int opPeso = teclado.nextInt();

                        System.out.print("Cantidad: ");
                        double cant = teclado.nextDouble();

                        if (opPeso == 1) {
                            p.aumentarPeso(cant);
                        } else if (opPeso == 2) {
                            p.disminuirPeso(cant);
                        } else {
                            System.out.println("Opcion Incorrecta");
                        }

                        System.out.println("Despues:");
                        p.mostrarHistoriaClinica();
                    }
                }
                break;
            case 5:
                System.out.print("Nombre del paciente: ");
                nombreB = teclado.nextLine();

                for (Paciente p : ltspacientes) {

                    if (p.getNombre().equalsIgnoreCase(nombreB)) {

                        System.out.println("Antes: ");
                        p.mostrarHistoriaClinica();

                        System.out.println("1. Subir presion");
                        System.out.println("2. Bajar presion");

                        int opPresion = teclado.nextInt();

                        System.out.print("Valor: ");
                        double valor = teclado.nextDouble();

                        if (opPresion == 1) {
                            p.subirPresion(valor);
                        } else {
                            p.bajarPresion(valor);
                        }

                        System.out.println("Despues: ");
                        p.mostrarHistoriaClinica();
                    }
                }
                break;
            case 6:
                System.out.print("Nombre del paciente: ");
                nombreB = teclado.nextLine();

                for (Paciente p : ltspacientes) {

                    if (p.getNombre().equalsIgnoreCase(nombreB)) {

                        System.out.println("Antes: ");
                        p.mostrarHistoriaClinica();

                        System.out.println("1. Mejorar estado");
                        System.out.println("2. Empeorar estado");

                        int opEstado = teclado.nextInt();

                        if (opEstado == 1) {
                            p.mejorarEstado();
                        } else {
                            p.empeorarEstado();
                        }

                        System.out.println("Despues: ");
                        p.mostrarHistoriaClinica();
                    }
                }
                break;
            case 7:
                for (Paciente p : ltspacientes) {
                    p.mostrarHistoriaClinica();
                }
                break;
            case 8:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }while(opc1!=8);

}
