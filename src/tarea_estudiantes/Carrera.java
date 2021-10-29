
package tarea_estudiantes;

public class Carrera {
    String name;
    int semestre;
    String carnet;
    String carrera;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
        @Override
   public String toString (){
        return "Estudiante [nombre=" + name + ", carnet=" + carnet + ", semestre=" +semestre + ", carrera=" + carrera;
       
   }
   void setCarrera (Carrera carrera ){
       throw new UnsupportedOperationException("Not supported yet.");
       
   }
   
   void getCarrera (Carrera carrera){
       throw new UnsupportedOperationException("Not supported yet.");
   }
}
