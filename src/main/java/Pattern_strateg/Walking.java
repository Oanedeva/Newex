package Pattern_strateg;

public class Walking implements NavigationStrategy {

    @Override
    public void navigate() {
        System.out.println("Маршрут построен для хождения пешком");
    }
}
