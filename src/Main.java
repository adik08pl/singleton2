public class Main {
    public static void main(String[] args) {
        ConfigurationManager.getInstance().setValueOrSomethingElseIDontKnow("coś");
        System.out.println(ConfigurationManager.getInstance().getValueOrSomethingElseIDontKnow());
    }
}