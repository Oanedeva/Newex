package Pattern_fabrica;

public class HTMLDialogCreate extends Dialog{
    public HTMLDialogCreate() {

    }

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
    //Конкретные создатели
}
