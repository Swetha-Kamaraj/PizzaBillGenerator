import java.util.*;
class Pizza{
    static String PizzaName; 
    static boolean ec=false,et=false;
    Scanner sc=new Scanner(System.in);
    public void choosePizza(){
        
        System.out.print("Do you want which Pizza base or delux:");
        PizzaName=sc.nextLine();

        if(PizzaName.equalsIgnoreCase("base")) {
            System.out.println("You have Selected base pizza");
            askForExtras();
        }
        else if(PizzaName.equalsIgnoreCase("delux") ){
            System.out.println("You Have Selected Delux Pizza");
        }
        else{
            System.out.println("You Have selected wrong pizza");
            PizzaName="base";
            askForExtras();
        }
    }
    private void askForExtras(){
        System.out.print("Do you want extra cheese (true/fasle) :");
        ec=sc.nextBoolean();
        if(ec)System.out.println("Extra cheese added");

        System.out.print("Do you want extra toppings (true/false) :");
        et=sc.nextBoolean();
        if(et)System.out.println("Extra toppings added");
    }
    public String getPizzaName() {
        return PizzaName;
    }

    public boolean hasExtraCheese() {
        return ec;
    }

    public boolean hasExtraToppings() {
        return et;
    }
}
class Billamount extends Pizza{
        public void Calculatebill(){
            int baseprice=300;
            int cheeseprice=50;
            int extratop=50;
            int totalptice=0;
            if(getPizzaName().equalsIgnoreCase("base")){
                totalptice=baseprice;
                if(hasExtraCheese()){
                    totalptice+=cheeseprice;

                }
                if(hasExtraToppings()){
                    totalptice+=extratop;
                }
            }
            else if(getPizzaName().equalsIgnoreCase("delux")){
                totalptice=baseprice+cheeseprice+extratop;
            }
            System.out.println("Bill amount:"+totalptice);

        }

}


public class Mainpizza{
    public static void main(String[] args) {
        Billamount pi=new Billamount();
            pi.choosePizza();  
            pi.Calculatebill();
        
        
    }
}
