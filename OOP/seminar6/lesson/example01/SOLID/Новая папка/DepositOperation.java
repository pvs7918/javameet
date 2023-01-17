package isp;

public class DepositOperation {
    private DepositSumUI ui;

    public DepositOperation(DepositSumUI ui) {
        this.ui = ui;
    }

    public void execute() {
        int amount = ui.getDepositSum();
        // ...
        System.out.println("Деньги зачислены на счёт");
    }
}
