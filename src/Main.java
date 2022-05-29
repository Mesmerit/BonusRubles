public class Main {
    public static void main(String[] args) {
        int startBalance = 230;
        int deposit = 1230;
        int minimalDepositForBonus = 1000;
        int bonusDivider = 100;

        int bonus = 0;
        int balance;

        if (deposit >= minimalDepositForBonus) {
            bonus = deposit / bonusDivider;
            balance = startBalance + deposit + bonus;
        } else {
            balance = startBalance + deposit;
        }
        System.out.println("Бонус: " + bonus + " руб.");
        System.out.println("Итоговый баланс: " + balance + " руб.");
    }
}