package tk.Thunder.utils;


import java.io.IOException;

public class FileData {
    public static String Typo;
    public static void main(String[] args){

    String file_name ="test.txt";

        try{
            WriteFile data = new WriteFile(file_name, true);
            data.writeToFile(Typo);
        }

        catch(IOException e){
            e.printStackTrace();
        }








    }




}

