public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final DigitalVideoDisc[] itemsOrdered =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (disc == null) {
            System.out.println("Cannot add a null disc.");
            return;
        }
        if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full.");
            return;
        }
        itemsOrdered[qtyOrdered++] = disc;
        System.out.println("The disc has been added.");
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is now full.");
        } else if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
            System.out.println("The cart is almost full.");
        }
    }

    // Final choice: varargs also accepts a DigitalVideoDisc[] argument.
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        if (dvdList == null) return;
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int foundIndex = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex == -1) {
            System.out.println("The disc was not found in the cart.");
            return;
        }
        for (int i = foundIndex; i < qtyOrdered - 1; i++) {
            itemsOrdered[i] = itemsOrdered[i + 1];
        }
        itemsOrdered[--qtyOrdered] = null;
        System.out.println("The disc has been removed.");
    }

    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.printf("%d  %s  %.2f%n",
                    i + 1, itemsOrdered[i].getTitle(), itemsOrdered[i].getCost());
        }
        System.out.printf("Total Cost: %.2f%n", totalCost());
        System.out.println("**************************************************");
    }
}
