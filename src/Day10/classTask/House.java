package Day10.classTask;

public class House {
    String colour="skyblue";
    String owner;
    int doors=3;
    int rooms=4;
    int windows=10;
    int bhk=2;



    public void openDoors(){
        System.out.print("door opend");
    }


    public static void main(String[]args){
        House shome=new House();
        House srirajhome=new House();

        System.out.println(srirajhome.bhk);
        shome.owner="satheesh";
        System.out.println(shome.owner);
        srirajhome.owner="sriraj";
        System.out.println(srirajhome.owner);
        shome.colour="green";
        srirajhome.colour="blue";
        System.out.println("shomecolour:"+" " +shome.colour);
        System.out.println("srirajhome colour:"+" "+srirajhome.colour);
    }



}
