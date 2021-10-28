package estudiantes;


import javax.swing.JOptionPane;

public class Estudiantes {
    public static void main(String[] args) {
        System.out.println("Hello, World!");



        // Creamos variables necesarias
        int opcion = 0;
        String profession;
        boolean flag = false;

        
        // Creamos el string mensaje a mostrar
        String messageOption = "REGISTRO DE ESTUDIANTES:\n" + "1. Registro de estudiantes\n"
                + "2. Consulta Datos Por Estudiantes\n" + "3. Consulta Carreras\n" + "4. Salir\n";
        
        // Creamos una instacia de la clase DatosEstudiante
        DatosEstudiante obj = new DatosEstudiante ();        // TRAER LA CLASE DE DATOS

        do {
            try {
                // Atrapamos la opcion que el user digite
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, messageOption, "________________",
                        JOptionPane.QUESTION_MESSAGE));

                System.out.println("Opcion elegida por el usuario: " + opcion);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR ! " + e.getMessage());
            }
        } while (opcion != 4);

    }
}
