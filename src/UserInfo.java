public class UserInfo {
    // Step 3: Declare variables with proper access modifiers
    private String name;
    private int age;
    private String email;
    private boolean isActive;

    // Step 4: Create constructor to initialize all variables
    public UserInfo(String name, int age, String email, boolean isActive) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive = isActive;
    }

    // Step 5: Create getter and setter methods for each variable
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean getIsActive() { return isActive; }
    public void setIsActive(boolean isActive) { this.isActive = isActive; }

    // Step 6: Create method to display user info nicely formatted
    public void displayInfo() {
        System.out.println("User Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Active: " + (isActive ? "Yes" : "No"));
        System.out.println("----------------------------");
    }

    // Step 7: Create main method for testing
    public static void main(String[] args) {
        // Create 3 different users
        UserInfo user1 = new UserInfo("Alice", 25, "alice@example.com", true);
        UserInfo user2 = new UserInfo("Bob", 30, "bob@example.com", false);
        UserInfo user3 = new UserInfo("Charlie", 22, "charlie@example.com", true);

        // Display their information
        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();

        // Test getters and setters
        System.out.println("Testing getters and setters:");
        System.out.println("Original age of user1: " + user1.getAge());
        user1.setAge(26);
        System.out.println("New age of user1 after setAge: " + user1.getAge());
    }
}
