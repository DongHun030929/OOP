abstract class Printer {
    String modelName;
    int printed;
    int remain;

    public Printer(String modelName, int remain) {
        this.modelName = modelName;
        this.remain = remain;
        this.printed = 0;
    }

    abstract boolean print();
}

class InkjetPrinter extends Printer {
    public InkjetPrinter(String modelName, int remain) {
        super(modelName, remain);
    }

    boolean print() {
        if (remain == 0) {
            System.out.println(modelName + ": " + (printed + 1) + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        } else {
            printed++;
            remain--;
            return true;
        }
    }
}

class LaserPrinter extends Printer {
    public LaserPrinter(String modelName, int remain) {
        super(modelName, remain);
    }

    boolean print() {
        if (remain == 0) {
            System.out.println(modelName + ": " + (printed + 1) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        } else {
            printed++;
            remain--;
            return true;
        }
    }
}

public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);

        while (inkjet.print());
        while (laser.print());
    }
}