
package tarea_estudiantes;

import javax.swing.JOptionPane;

public class Tarea_estudiantes {

    public static void main(String[] args) {
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
                
                switch (opcion) {
                    case 1:
                        obj.registrarEstudiante();
                        flag = true;
                        break;

                    case 2:
                        if (flag){
                            obj.getCarreras();
                        }else{
                            JOptionPane.showMessageDialog(null,"NO SE ENCONTRARON ESTUDIANTES REGISTRADOS");
                        }
                    break;

                    case 3:
                        if (flag){
                        	profession = JOptionPane.showInputDialog(null,
                                    "DIGITAR NOMBRE DE LA CARRERA A CONSULTAR ");


                            obj.consultarCarrera(profession);
                        }else {
                            JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON CARRERAS A CONSULTAR");

                        }
                    break;

                    case 4:

                        JOptionPane.showMessageDialog(null, "ADIOS REGRESA PRONTO :D ");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION NO ENCONTRADA (INVALIDA)");
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR ! " + e.getMessage());
            }
        } while (opcion != 4);
    }
    
}
