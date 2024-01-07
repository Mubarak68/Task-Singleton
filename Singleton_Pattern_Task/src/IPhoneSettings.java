public class IPhoneSettings {

    private static IPhoneSettings instance;
    private boolean wifi = true;
    private int brightnes;

    private IPhoneSettings() {

    }

    public static IPhoneSettings getInstance() {
        if (instance == null) {
            instance = new IPhoneSettings();
        }
        return instance;
    }

    public void setBrightnes(int brightnes) {
        this.brightnes = brightnes;
    }

    public int getBrightnes() {
        return brightnes;
    }

    public void setWifi(boolean wifii) {
        this.wifi = wifii;

    }

    public boolean getWifi() {
        return wifi;

    }

    public static void settings() {

    }
}