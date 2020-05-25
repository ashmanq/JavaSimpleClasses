import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canAddPaperToPrinter(){
        printer.print(20, 1);
        printer.addPaper(10);
        assertEquals(90, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canReplaceToner(){
        printer.print(10, 10);
        printer.replaceToner();
        assertEquals(100, printer.getToner());
    }

    @Test
    public void checkPrintingReducesPaper(){
        printer.print(2, 10);
        assertEquals(80, printer.getPaper());
    }

    @Test
    public void checkPrintingReducesToner(){
        printer.print(1, 10);
        assertEquals(90, printer.getToner());
    }
}
