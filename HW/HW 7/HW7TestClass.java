public class HW7TestClass{

    public static void main(String[] args){
        
        Portfolio p=new Portfolio();
        Company c1=new Company("Ubisoft");
        Share s1=new Share(1200.0,c1);
        Share s2=new Share(500.0,c1);
        Share s3=new Share(700.0,c1);
        Company c2=new Company("Apple");
        Share s4=new Share(800.0,c2);
        Share s5=new Share(900.0,c2);
        Share s6=new Share(100.0,c2);

        p.addShare(s1); 
        p.addShare(s2); 
        p.addShare(s3); 
        p.addShare(s4);
        p.addShare(s5); 
        p.addShare(s6);
        
        System.out.println(p.computeSum()); //4200.0
    }
}