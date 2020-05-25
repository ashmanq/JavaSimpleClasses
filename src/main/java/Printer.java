public class Printer {

    private int paper;
    private int toner;

    // When initialised the user states amount of paper in printer and
    // the toner value is assumed to be full (full toner cartridge can print 100 pages)
    public Printer(int paper){
        this.paper = paper;
        this.toner = 100;
    }

    public int getPaper(){
        return this.paper;
    }

    public void addPaper(int noOfPages){
        this.paper += noOfPages;
    }

    public int getToner(){
        return this.toner;
    }

    public void replaceToner(){
        this.toner = 100;
    }

    public void print(int noOfPages, int noOfCopies){
        this.paper -=(noOfPages * noOfCopies);
        this.toner -=(noOfPages * noOfCopies);
    }
}
