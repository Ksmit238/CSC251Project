import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PolicyDemo {
   public static void main(String[] args) {
      List<Policy> policies = new ArrayList<>();
      int smokers = 0;
      int nonSmokers = 0;

      try {
         File file = new File("PolicyInformation.txt");
         Scanner scanner = new Scanner(file);

         while (scanner.hasNextLine()) {
            String policyNumber = scanner.nextLine();
            String providerName = scanner.nextLine();
            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String smokingStatus = scanner.nextLine();
            double height = Double.parseDouble(scanner.nextLine());
            double weight = Double.parseDouble(scanner.nextLine());

            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            policies.add(policy);

            if (smokingStatus.equals("smoker")) {
               smokers++;
            } else if (smokingStatus.equals("non-smoker")) {
               nonSmokers++;
            }
         }

         scanner.close();
      } catch (FileNotFoundException e) {
         System.out.println("File not found: " + e.getMessage());
      }

      for (Policy policy : policies) {
         System.out.println("\nPolicy Information:");
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's Name: " + policy.getFirstName() + " " + policy.getLastName());
         System.out.println("Age: " + policy.getAge());
         System.out.println("Smoking Status: " + policy.getSmokingStatus());
         System.out.println("Height: " + policy.getHeight() + " inches");
         System.out.println("Weight: " + policy.getWeight() + " pounds");
         System.out.println("BMI: " + policy.calculateBMI());
         System.out.println("Price: $" + policy.calculatePrice());
      }

      System.out.println("\nNumber of Smokers: " + smokers);
      System.out.println("Number of Non-Smokers: " + nonSmokers);
   }
}
