package isp;

public class WithdrawOperation {
    private WithdrawSumUI ui;

    public WithdrawOperation(WithdrawSumUI ui) {
        this.ui = ui;
    }

    public void execute() {
        int amount = ui.getWithdrawSum();
        // ...
        System.out.println("Заберите деньги");
    }
}
