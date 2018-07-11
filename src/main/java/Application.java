import entities.EntityUsecase;
import plain.PlainUsecase;

public class Application {
    public static void main(String[] args) {
        //new PlainUsecase().main();
        new EntityUsecase().main();
    }
}
