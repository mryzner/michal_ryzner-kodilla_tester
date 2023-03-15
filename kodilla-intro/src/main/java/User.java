public class User {
    private String name;
    private double age;
    private double height;

    public User(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String getName() { return name; }
    public double getAge() { return age; }
    public double getHeight() { return height; }
    public void checkUser() {
        if (name != null) {
            if (age > 30 && height > 160) { System.out.println("User is older than 30 and taller than 160cm"); }
            else { System.out.println("User is 30 (or younger) or 160cm (or shorter)"); }
        }
    }
    public static void main(String[] args) {
        User anna = new User("Anna", 20, 0.0);
        User betty = new User("Betty", 33, 0.0);
        User carl = new User("Carl", 58, 0.0);
        User david = new User("David", 13, 0.0);
        User eva = new User("Eva", 18, 0.0);
        User frankie = new User("Frankie", 45, 0.0);

        User[] users = {anna,betty,carl,david,eva,frankie};

        double result = 0;
        for (int i=0; i<users.length; i++) {
            result = result + users[i].getAge();
        }
        double avgAge = result/users.length;
        System.out.println("Average age is: " + avgAge);
        System.out.println("Users below average age:");

        for (int i=0; i<users.length; i++) {
            if (users[i].getAge() < avgAge) {
                System.out.println(users[i].getName());
            }


        }
    }
}
