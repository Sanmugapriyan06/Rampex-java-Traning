package Day7;

public class Label_Break {
    public static void main(String[]args){
        for(int week=1;week<=4;week++){
            for(int day=1;day<=7;day++){
                if(day==3){
                    break;
                }
                System.out.println("week" + week +"day" +day);
            }
        }
    }

}
