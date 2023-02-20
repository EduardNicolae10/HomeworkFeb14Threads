import java.util.Arrays;
import java.util.Random;

public class Searching extends Thread{
    private String arrayName;

    public Searching(String arrayName) {

        this.arrayName = arrayName;
    }
    @Override
    public void run(){

        String[] array = {"Elena","Marian","Ionel","Daniel","Catalina"};
        System.out.println(arrayName + Arrays.toString(array));
        String st = "Catalina";
        System.out.println("searching in the first array for the first string: " + st);

        int searchingTime = new Random().nextInt(2000)+1000;
        for (int i=0 ; i< array.length; i++){
            if(array[i].equals(st.trim()))
                System.out.println("the position of string " + st + " in the first array is: " + i);
            try{
                Thread.sleep(searchingTime);
            }catch (InterruptedException e){

            }
        }
        System.out.println("the first search lasted: " + searchingTime);

    }
}
