public class InsuranceTest{
    
    public static void main(String[] args){

        LifeInsurance life = new LifeInsurance("Mario", "Sakka", "Sector 1", 54,"");
        life.computeAmountPerPeriod();
        life.computeSum();
        System.out.println(life);
        
        AccidentInsurance acc = new AccidentInsurance("Khaled", "Hachem", "Sector 2", 1,"");
        acc.computeAmountPerPeriod();
        acc.computeSum();
        System.out.println(acc);
    }
}