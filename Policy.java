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
   
   public String getPolicyNumber() {
      return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
      this.policyNumber = policyNumber;
    }

    public String getProviderName() {
      return providerName;
    }

    public void setProviderName(String providerName) {
      this.providerName = providerName;
    }

    public String getFirstName() {
      return firstName;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public String getLastName() {
      return lastName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getSmokingStatus() {
      return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus) {
      this.smokingStatus = smokingStatus;
    }

    public double getHeight() {
      return height;
    }

    public void setHeight(double height) {
      this.height = height;
    }

    public double getWeight() {
      return weight;
    }

    public void setWeight(double weight) {
      this.weight = weight;
    }

    public double calculateBMI() {
      return (weight * 703) / (height * height);
    }

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
