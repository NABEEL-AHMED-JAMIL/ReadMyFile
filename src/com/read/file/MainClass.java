package com.read.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Nabeel on 3/29/2017.
 */
public class MainClass {
    //
    //
    static int counter = 0;
    // count the "an"
    public void countAn(){
        //
        //
        final String FILENAME = "readfile";
        //

        BufferedReader br = null;
        FileReader fr = null;
        //
        try {
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            //
            String currentLine;
            while ((currentLine = br.readLine()) != null) {

                String[] parts = currentLine.split(" ");
                // ok
                for (String part: parts) {
                    //
                    if(part.length() == 1){
                        // kuch ni kr na
                    }
                    else if(part.equals("an")){
                        counter += 1;
                    }else{
                        int j = 2;
                        for(int i=0; i < part.length(); i++){
                            //
                            if(j > part.length()){
                                break;
                            }else{
                                if(part.substring(i,j).equals("an")){
                                    // then
                                    counter += 1;
                                }
                            }
                            j++;
                        }

                    }

                }

            }
            System.out.println("The file contian the 'an' word are:  "+counter);

        } catch (IOException e) {
            //
            e.printStackTrace();
        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }


    public static void main(String[] args) {
        //
        new MainClass().countAn();
        String msg = "Nabeel ahmed jamil Compilation completed successfully in 1s 958ms";
        System.out.println(msg);
        // count to total space
        int j = 0;
        // 0-17 run-> ok
        for (int i = 0; i < msg.length(); i++){
            //
            if(msg.charAt(i) == ' '){
                //
                j++;
            }
        }

        j = j * 3 - j;
        char[] array1 = new char[msg.length()+j];
        // marge this array with the upper string in the third array
        char[] adding = {'%','2','0'};
        //
        int k = 0;
        for (int i = 0; i < array1.length; i++){
            //
            if( msg.charAt(k) == ' '){
                //
                for (int l=0; l < adding.length; l++){
                    //
                    if(l == adding.length-1){
                        array1[i] = adding[l];
                    }else{

                        array1[i] = adding[l];
                        i++;
                    }
                }
            }else{
                //
                array1[i] = msg.charAt(k);
            }
            k++;
        }
        //

        for(int i = 0; i < array1.length; i++){
            //
            System.out.print(array1[i]);
        }

    }
    //

}
