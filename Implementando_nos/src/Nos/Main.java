package Nos;

public class Main {
	
    public static void main(String[] args){

        No <String> no1 = new No("Conte�do no1");
        No <String> no2 = new No("Conte�do no2");

        no1.setProximoNo(no2);

        No <String> no3 = new No("Conte�do no3");

        no2.setProximoNo(no3);

        No <String> no4 = new No("Conte�do no4");

        no3.setProximoNo(no4);
        
        No <String> no5 = new No("Conte�do no5");

        no4.setProximoNo(no5);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());

        System.out.println("-------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }

}
