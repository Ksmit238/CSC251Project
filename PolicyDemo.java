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

            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            Policy policy = new Policy(policyNumber, providerName, policyHolder);
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
         System.out.println(policy);
         System.out.println("Price: $" + policy.calculatePrice());
      }

      System.out.println("\nNumber of Policies created: " + Policy.getPolicyCount());
      System.out.println("Number of Smokers: " + smokers);
      System.out.println("Number of Non-Smokers: " + nonSmokers);
   }
}
