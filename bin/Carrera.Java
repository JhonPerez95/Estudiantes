

public class Carrera {

    String name;
    int semestre;
    String carnet;
    String carrera;

    // Get 
    public void  getName(){
        return name;
    }  
    public void  getSemestre(){
        return semestre;
    };
    public void  getCarnet(){
        return carnet;
    };
    public void  getCarrera(){
        return carrera;
    };

    // Set 
    public String setName(String name){
        this.name = name;
    };
    public int setSemestre(int semestre){
        this.semestre = semestre;
    };
    public String setCarnet(String carnet){
        this.carnet = carnet;
    };
    public String setCarrera(String carrera){
        this.carrera = carrera;
    };


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