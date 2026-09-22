public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("After swap: " + jungleDVD.getTitle()
                + " / " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("After changeTitle: " + jungleDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc first, DigitalVideoDisc second) {
        DigitalVideoDisc temporary = first;
        first = second;
        second = temporary;
    }

    public static void changeTitle(DigitalVideoDisc disc, String title) {
        disc.setTitle(title);
    }
}
