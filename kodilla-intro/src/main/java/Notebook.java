public class Notebook {
    int weight;
    int price;
    int yearOfManufacture;
    public Notebook(int weight, int price, int yearOfManufacture) {
        this.weight = weight;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        }
        else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is very light.");
        }
        else if (this.weight > 600 && this.weight <= 1200) {
            System.out.println("This notebook is not too heavy.");
        }
        else {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkYearPrice() {
        if (this.price <= 500 && this.yearOfManufacture <= 2010) {
            System.out.println("This is a budget notebook.");
        }
        else {
            System.out.println("This is the best notebook money can buy.");
        }
    }
}
