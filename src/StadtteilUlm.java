import javax.lang.model.element.Name;

public enum StadtteilUlm {

    ESELSBERG(17326), BOEFINGEN(13475);

    double einwohner;

    StadtteilUlm(double e){
        einwohner = e;
    }

    public double getEinwohner(){
        return einwohner;
    }

    public boolean mehrAls(StadtteilUlm stadtteilUlm){
        return this.getEinwohner() > stadtteilUlm.getEinwohner();
    }

    public static double getEinwohner(String Name) throws UnbekannterStadtteilException{
        for(StadtteilUlm s : StadtteilUlm.values()){
            if(s.name().equals(Name)){
                return s.getEinwohner();
            }
        }
        
        throw new UnbekannterStadtteilException();
    }

    

    
}

