import NaiveBayes.NaiveBayes;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class train {
    public static void main(String[] args) {
        try{
            NaiveBayes naiveBayes = new NaiveBayes();
            naiveBayes.learn(new train().getClass().getResource("finaldata3.json").getPath(),new String[]{"0","1","2","3","4"});
            FileOutputStream fileOutputStream = new FileOutputStream("model");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(naiveBayes);
            System.out.println("Success");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
