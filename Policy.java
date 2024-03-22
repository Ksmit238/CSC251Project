import java.util.Scanner;

class Policy {
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   /**
    * Default constructor that sets default values for a policy.
    */
   public Policy() {
      this.policyNumber = "P0000";
      this.providerName = "Default Provider";
      this.firstName = "John";
      this.lastName = "Doe";
      this.age = 30;
      this.smokingStatus = "non-smoker";
      this.height = 70;
      this.weight = 150;
   }
   
   /**
    * Constructor that creates a policy with specified values.
    * @param policyNumber The policy number.
    * @param providerName The provider name.
    * @param firstName The first name of the policy holder.
    * @param lastName The last name of the policy holder.
    * @param age The age of the policy holder.
    * @param smokingStatus The smoking status of the policy holder.
    * @param height The height of the policy holder in inches.
    * @param weight The weight of the policy holder in pounds.
    */
   public Policy(String policyNumber, String providerName, String firstName, String lastName, int age,
                  String smokingStatus, double height, double weight) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   /**
    * Getter for the policy number.
    * @return The policy number.
    */
   public String getPolicyNumber() {
      return policyNumber;
    }

    /**
     * Setter for the policy number.
     * @param policyNumber The new policy number.
     */
    public void setPolicyNumber(String policyNumber) {
      this.policyNumber = policyNumber;
    }

    /**
     * Getter for the provider name.
     * @return The provider name.
     */
    public String getProviderName() {
      return providerName;
    }

    /**
     * Setter for the provider name.
     * @param providerName The new provider name.
     */
    public void setProviderName(String providerName) {
      this.providerName = providerName;
    }

    /**
     * Getter for the first name of the policy holder.
     * @return The first name of the policy holder.
     */
    public String getFirstName() {
      return firstName;
    }

    /**
     * Setter for the first name of the policy holder.
     * @param firstName The new first name of the policy holder.
     */
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    /**
     * Getter for the last name of the policy holder.
     * @return The last name of the policy holder.
     */
    public String getLastName() {
      return lastName;
    }

    /**
     * Setter for the last name of the policy holder.
     * @param lastName The new last name of the policy holder.
     */
    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    /**
     * Getter for the age of the policy holder.
     * @return The age of the policy holder.
     */
    public int getAge() {
      return age;
    }

    /**
     * Setter for the age of the policy holder.
     * @param age The new age of the policy holder.
     */
    public void setAge(int age) {
      this.age = age;
    }

    /**
     * Getter for the smoking status of the policy holder.
     * @return The smoking status of the policy holder.
     */
    public String getSmokingStatus() {
      return smokingStatus;
    }

    /**
     * Setter for the smoking status of the policy holder.
     * @param smokingStatus The new smoking status of the policy holder.
     */
    public void setSmokingStatus(String smokingStatus) {
      this.smokingStatus = smokingStatus;
    }

    /**
     * Getter for the height of the policy holder.
     * @return The height of the policy holder in inches.
     */
    public double getHeight() {
      return height;
    }

    /**
     * Setter for the height of the policy holder.
     * @param height The new height of the policy holder in inches.
     */
    public void setHeight(double height) {
      this.height = height;
    }

    /**
     * Getter for the weight of the policy holder.
     * @return The weight of the policy holder in pounds.
     */
    public double getWeight() {
      return weight;
    }

    /**
     * Setter for the weight of the policy holder.
     * @param weight The new weight of the policy holder in pounds.
     */
    public void setWeight(double weight) {
      this.weight = weight;
    }

    /**
     * Calculates the BMI (Body Mass Index) of the policy holder.
     * @return The BMI of the policy holder.
     */
    public double calculateBMI() {
      return (weight * 703) / (height * height);
    }

    /**
     * Calculates the price of the policy based on various factors such as age, smoking status, and BMI.
     * @return The price of the policy.
     */
    public double calculatePrice() {
      double baseFee = 600;
      double additionalFee = 0;
         if (age > 50) {
            additionalFee += 75;
        }
         if (smokingStatus.equals("smoker")) {
            additionalFee += 100;
        }
         if (calculateBMI() > 35) {
            additionalFee += (calculateBMI() - 35) * 20;
        }
         return baseFee + additionalFee;
    }
}

public class Policy {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter policy number: ");
      String policyNumber = scanner.nextLine();

      System.out.print("Enter provider name: ");
      String providerName = scanner.nextLine();

      System.out.print("Enter policyholder's first name: ");
      String firstName = scanner.nextLine();

      System.out.print("Enter policyholder's last name: ");
      String lastName = scanner.nextLine();

      System.out.print("Enter policyholder's age: ");
      int age = scanner.nextInt();
      scanner.nextLine(); // consume newline
      
      System.out.print("Enter policyholder's smoking status (smoker or non-smoker): ");
      String smokingStatus = scanner.nextLine();

      System.out.print("Enter policyholder's height (in inches): ");
      double height = scanner.nextDouble();

      System.out.print("Enter policyholder's weight (in pounds): ");
      double weight = scanner.nextDouble();

      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

      System.out.println("\nPolicy Information:");
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's Name: " + policy.getFirstName() + " " + policy.getLastName());       System.out.println("Age: " + policy.getAge());
      System.out.println("Smoking Status: " + policy.getSmokingStatus());
      System.out.println("Height: " + policy.getHeight() + " inches");
      System.out.println("Weight: " + policy.getWeight() + " pounds");       System.out.println("BMI: " + policy.calculateBMI());
      System.out.println("Price: $" + policy.calculatePrice());

      scanner.close();
   }
}
