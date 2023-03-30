public class NotebookApplication {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2015);
        System.out.println("weight: " + notebook.getWeight() + " " + "price: "
                + notebook.getPrice() + " year: " + notebook.getYearOfManufacture());
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println("weight: " + heavyNotebook.getWeight() + " " + "price: "
                + heavyNotebook.getPrice() + " year: " + heavyNotebook.getYearOfManufacture());
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 2010);
        System.out.println("weight: " + oldNotebook.getWeight() + " " + "price: "
                + oldNotebook.getPrice() + " year: " + oldNotebook.getYearOfManufacture());
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearPrice();

        System.out.println("Koniec !");

    }
}
