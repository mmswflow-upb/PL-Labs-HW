public class ConferenceProceeding extends Publication{
    

    private String volumeName;
    private Boolean indexed;

    public ConferenceProceeding(String volName,Boolean indx){

        this.indexed = indx;
        this.volumeName = volName;
    }

   
    Double computeScore() {
        
        if (indexed == false){

            return 0.25/numberOfAuthors;
        }
        return 0.2/numberOfAuthors;
    }
}