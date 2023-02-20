import java.util.Arrays;
import java.util.Random;

public class Searching2 extends Thread{

    private String array2Name;

    public Searching2(String array2Name){

        this.array2Name = array2Name;
    }

    @Override
    public void run(){
        String[] array2 = {"Iulia","Voicu","Traian","Tatiana","Adela"};
        System.out.println(array2Name + Arrays.toString(array2));
        String st2 = "Iulia";
        System.out.println("searching in the second array for the second string: " + st2);

        int searchingTime2 = new Random().nextInt(2000)+1000;
        for (int i=0 ; i< array2.length; i++){
            if(array2[i].equals(st2.trim()))
                System.out.println("the position of string " + st2  + " in the second array is: " + i);

            try{
                Thread.sleep(searchingTime2);
            }catch (InterruptedException e){

            }
        }
        System.out.println("the second search lasted: " + searchingTime2);
    }

}
