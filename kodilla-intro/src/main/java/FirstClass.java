public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2015);
        System.out.println("weight: " + notebook.weight + " " + "price: " + notebook.price + " year: " + notebook.yearOfManufacture);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println("weight: " + heavyNotebook.weight + " " + "price: " + heavyNotebook.price + " year: " + heavyNotebook.yearOfManufacture);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 2010);
        System.out.println("weight: " + oldNotebook.weight + " " + "price: " + oldNotebook.price + " year: " + oldNotebook.yearOfManufacture);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearPrice();

        System.out.println("Koniec !");

    }
}
