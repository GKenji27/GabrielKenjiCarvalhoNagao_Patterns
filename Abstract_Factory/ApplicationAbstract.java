public class ApplicationAbstract {
    private final UIComponentFactory factory;

    public ApplicationAbstract(UIComponentFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        textField.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        System.out.println("Tema Claro");
        ApplicationAbstract lightApplication = new ApplicationAbstract(new LightThemeFactory());
        lightApplication.createUI();

        System.out.println();

        System.out.println("Tema Escuro");
        ApplicationAbstract darkApplication = new ApplicationAbstract(new DarkThemeFactory());
        darkApplication.createUI();
    }
}
