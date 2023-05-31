package STREAMS;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriter {
    public static void main(String[] args) throws IOException {
        try(java.io.BufferedWriter b = new java.io.BufferedWriter(new OutputStreamWriter(System.out))){
            String bunga[] = {"Mawar", "Melati", "Bangkai"};
            b.write("Macam-macam flower: \n");
            for(int i=0; i<3; i++){
                b.write(bunga[i]+"\n");
                b.flush();
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
