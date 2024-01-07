public class iPhoneSett {
    public static void main(String[] args) {
        IPhoneSettings phone = IPhoneSettings.getInstance();
        IPhoneSettings phone2 = IPhoneSettings.getInstance();

        phone.setWifi(true);
        phone.setBrightnes(74);

        phone2.setWifi(false);
        phone2.setBrightnes(22);

        System.out.println("phone 1");
        System.out.println("The wifi availability :" + phone.getWifi());
        System.out.println("The Brightnes %? :" + phone.getBrightnes() + "%");

        System.out.println("phone 2");
        System.out.println("The wifi availability :" + phone2.getWifi());
        System.out.println("The Brightnes %? :" + phone2.getBrightnes() + "%");

    }
}
