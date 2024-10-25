import java.util.Random;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String value="value",somethingElseIDontKnow="something else I dont know";
    private Random random = new Random();
    private ConfigurationManager(){

    }
    public static ConfigurationManager getInstance(){
        if(instance==null)
            instance = new ConfigurationManager();
        return instance;
    }
    String getValueOrSomethingElseIDontKnow(){
        if(random.nextInt(2)%2==0)
            return somethingElseIDontKnow;
        else
            return value;
    }
    void setValueOrSomethingElseIDontKnow(String text){
        if(random.nextInt(2)%2==0)
            somethingElseIDontKnow = text;
        else
            value = text;
    }
}
