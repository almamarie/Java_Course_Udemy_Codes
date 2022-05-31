public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(12345);

        timsPhone.powerOn();
        timsPhone.callPhone(12345);
        timsPhone.answer();

        timsPhone = new MobilePhone(123455);
        // timsPhone.powerOn();
        timsPhone.callPhone(123455);
        timsPhone.answer();
    }
}
