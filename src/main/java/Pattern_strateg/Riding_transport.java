package Pattern_strateg;

public class Riding_transport implements NavigationStrategy {

    @Override
    public void navigate() {
        System.out.println("Маршрут построен для общественного транспорта");
    }
}
