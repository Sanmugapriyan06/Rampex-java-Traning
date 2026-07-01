package Day10.classTask;

public class Findsamearray {
    public static void main(String[]args){
        String [] arr={"sam","jane","sam","tom"};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]!=null && arr[i].equals(arr[j])){

                    System.out.println(arr[j]);
                }
            }
        }
    }
}
