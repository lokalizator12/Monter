import javax.management.monitor.MonitorSettingException;

public class Monster {
    int howAces, howLegs, howHands;

    Monster() {
        this.howAces = 2;
        this.howHands = 2;
        this.howLegs = 2;
    }

    Monster(int howAces) {
        this.howLegs = 2;
        this.howAces = howAces;
        this.howHands = 2;
    }

    Monster(int howHands, int howLegs) {
        this.howHands = howHands;
        this.howAces = 2;
        this.howLegs = howLegs;
    }

    Monster(int howLegs, int howAces, int howHands) {
        this.howLegs = howLegs;
        this.howAces = howAces;
        this.howHands = howAces;
    }

    void whichMonster() {
        System.out.println("Монстр имеет: " + howHands + " рук(и), " + howAces + " глаз(а) и " + howLegs + " ног(и).");
    }
}
