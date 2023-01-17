package isp;

public class TransferOperation {
    private UI ui;

    public TransferOperation(UI ui) {
        this.ui = ui;
    }

    public void execute () {
        int amount = ui.getTransferSum();
        String targetClient = ui.getTransferTarget();
        // ...
        System.out.println("Деньги переведены!");
    }
}
