package command;

// Receiver 클래스 - 램프
class Lamp {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Lamp is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lamp is OFF");
    }

    public boolean isOn() {
        return isOn;
    }
}
