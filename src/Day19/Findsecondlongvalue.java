package Day19;
import java.util.HashMap;
import java.util.Map;
public class Findsecondlongvalue {
    public static void main(String[]args){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("vishnu",90);
        hm.put("Manoj",89);
        hm.put("vaishnavi",34);
    int min=100;
    String name="";
    for(Map.Entry<String,Integer> e:hm.entrySet()){
        if(e.getValue()<min) {
            min = e.getValue();
            name = e.getKey();

        }

    }
        System.out.println(min);
        System.out.println(name);
    }
    }
