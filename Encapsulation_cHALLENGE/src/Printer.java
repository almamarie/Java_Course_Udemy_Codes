public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean isDuplex){
        this.duplex = isDuplex;


        if(tonerLevel > 100 || tonerLevel < 0){
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }


    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 100 || tonerAmount < 0){
            return -1;
        }

        int tmp = this.tonerLevel + tonerAmount;
        if(tmp > 100){
            return -1;
        } else {
            this.tonerLevel = tmp;
        }
        return this.tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;

        int remainder = 0;
        if(this.duplex){
            pagesToPrint = Math.round((float) pages / 2);
        }

        // System.out.println("Printing in duplex mode");
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }

}

