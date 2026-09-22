public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;

    private final int id;
    private String title;
    private final String category;
    private final String director;
    private final int length;
    private final float cost;

    private static int nextId() {
        return ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title) {
        this(title, null, null, 0, 0.0f);
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        this(title, category, null, 0, cost);
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this(title, category, director, 0, cost);
    }

    public DigitalVideoDisc(
            String title, String category, String director, int length, float cost) {
        this.id = nextId();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public float getCost() { return cost; }

    // Chỉ giữ tạm trong task parameter passing; xóa sau khi hoàn thành thí nghiệm.
    public void setTitle(String title) { this.title = title; }

    @Override
    public String toString() {
        return String.format("DVD - %s - %s - %s - %d min: %.2f $",
                title, category, director, length, cost);
    }
}
