import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Persoana {
    private String nume;
    private String prenume;
    public Persoana(String nume){
        this.nume=nume;
        this.prenume=prenume;
    }

    public static void main(String[] args) {
        String[] persoane={ "Ion Popescu", "Vasi Lupu ", "Ion Popescu ", "Luci Popa ", "Ion Popescu"};
        Map<Persoana,Integer> counter=new HashMap<>();
        for(String line:lines) {
            String[]words=line.toLowerCase().split(" ");
            Persoana pers=new Persoana(words[0], words[1]);
            if(counter.containsKey(pers)){

            }
        }


    }
}
