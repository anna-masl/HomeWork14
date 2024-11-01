package app;

import app.modules.PrintService;
import app.service.Printer;

public class MainSolutionHomeWork14 {
    public static void main(String[] args) {

        Printer messages = new PrintService();
        PrintService.Message printService = new PrintService.Message("",null);
        messages.print(printService);

    }

}
