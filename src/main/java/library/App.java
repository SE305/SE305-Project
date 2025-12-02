package library;

import library.business.ReturnService;
import library.data.DataSeeder;
import library.data.InMemoryDataStore;
import library.presentation.ConsoleUI;

/** Entry point of the project. */
public class App {
    public static void main(String[] args) {
        // Data layer
        InMemoryDataStore store = new InMemoryDataStore();
        DataSeeder.seed(store);                 // demo data: M1/B1 ready

        // Business layer
        ReturnService service = new ReturnService(store);

        // Presentation layer
        ConsoleUI ui = new ConsoleUI(service);
        ui.runOnce();
    }
}

