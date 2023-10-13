package Pattern_fabrica;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
    static void configure(){
        if (System.getProperty("os.name").equals("Wi")){
            dialog=new WindowsDialogCreate();
        }else{
            dialog=new HTMLDialogCreate();
        }
    }
    static void runBusinessLogic(){dialog.renderWindow();}
}
