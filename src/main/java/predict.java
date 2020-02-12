import NaiveBayes.NaiveBayes;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class predict {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("model");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            NaiveBayes naiveBayes = (NaiveBayes) objectInputStream.readObject();
            String result = naiveBayes.predict(new String[]{"has","a","higher","resolution","?"});
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
