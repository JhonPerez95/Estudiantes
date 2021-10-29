
package tarea_estudiantes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DatosEstudiante extends Carrera {
    List<Carrera> carreras = new ArrayList<>();
    
    private String carreraEst;

    public List <Carrera> registrarEstudiante() {
        int numbered = Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes desea registrar: "));

        if (numbered > 0) {
            Carrera carrera = new Carrera ();
            for (int i = 0; i < numbered; i++) {
                name = JOptionPane.showInputDialog(null,
                		"1. Ingrese el nombre del estudiante: ",
                		JOptionPane.QUESTION_MESSAGE);
                carrera.setName(name);

                carnet = JOptionPane.showInputDialog(null,
                		"2. Ingrese el numero del carnet: ",
                		JOptionPane.QUESTION_MESSAGE);
                carrera.setCarnet(carnet);
                
                semestre = Integer.parseInt(JOptionPane.showInputDialog(null, 
                		"3. Ingrese el semestre en el que se encuentra: ", 
                		JOptionPane.QUESTION_MESSAGE));
                carrera.setSemestre(semestre);

                carreraEst = JOptionPane.showInputDialog(null,
                		"4. Ingrese el nombre de la carrera: ",
                		JOptionPane.QUESTION_MESSAGE);
                carrera.setCarrera(carreraEst);

                carreras.add(carrera);
                System.out.println("Datos guardados Carerra: " + carreras);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El numero es invalido!");   
        }
        return carreras;
    }

    public List<Carrera> getCarreras (){
        for (Carrera obj: carreras){
            JOptionPane.showMessageDialog (null,
                "INFORMACION (S)! \n"
                +"Nombre : "+obj.getName()
                +"\nCarrera: "+obj.getCarrera()
                +"\nNumero Carnet: "+obj.getCarnet()
                +"\nSemestre que se encuentra cursando: "+obj.getSemestre());
        }
        return carreras;
    }    

    public void consultarCarrera (String profesion){
        for(Carrera obj: carreras) {
            if (profesion.equalsIgnoreCase(obj.getCarrera())){
                JOptionPane.showMessageDialog(null,
                      "Estudiante de la carrera: "+ profesion+ "\n"
                      +"Nombre del estudiante: "+ obj.getName()+ "\n"
                      +"ID: "+obj.getCarnet()+"\n"
                      +"Semestre: "+ obj.getSemestre()
                );
            }
        }   
    }
}
