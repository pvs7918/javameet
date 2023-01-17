package isp;

public class TransferOperation {
    private TransferTargetUI ui;

    public TransferOperation(TransferTargetUI ui) {
        this.ui = ui;
    }

    public void execute() {
        int amount = ui.getTransferSum();
        String targetClient = ui.getTransferTarget();
        // ...
        System.out.println("Деньги переведены!");
    }
}
