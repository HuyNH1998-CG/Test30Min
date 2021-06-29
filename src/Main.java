import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Human> list = new ArrayList<>();
    public static void main(String[] args) {
        readFile();
        for (Human H : list){
            System.out.println(H.display());
        }
        list.add(new Human("Zero",0,"Nam","none"));
        writeFile();
    }

    public static void readFile(){
        try{
            File Human = new File("src/List.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(Human));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] strings = line.split(",");
                if(strings.length >=4){
                    list.add(new Human(strings[0],Integer.parseInt(strings[1].trim()),strings[2],strings[3]));
                }
            }
            bufferedReader.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void writeFile(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/List.txt",false));
            for (Human H : list){
                bufferedWriter.write(H.display());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
