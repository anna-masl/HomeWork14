package app;

import app.modules.PrintService;
import app.service.Printer;

public class MainSolutionHomeWork14 {
    public static void main(String[] args) {

        Printer printer = new PrintService();
        PrintService.Message message = new PrintService.Message("",null);
        printer.print(message);

    }

}
