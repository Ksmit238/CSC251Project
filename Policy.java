/**
 * The Policy class represents an insurance policy with various attributes.
 */
class Policy {
   private static int policyCount = 0;
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;

   /**
    * Constructs a default Policy object with preset values.
    */
   public Policy() {
      policyCount++;
      this.policyNumber = "P0000";
      this.providerName = "Default Provider";
      this.policyHolder = new PolicyHolder();
   }

   /**
    * Constructs a Policy object with specified values.
    *
    * @param policyNumber   the policy number
    * @param providerName   the name of the insurance provider
    * @param policyHolder   the policy holder
    */
   public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
      policyCount++;
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolder = policyHolder;
   }

   /**
    * Gets the policy number.
    *
    * @return the policy number
    */
   public String getPolicyNumber() {
      return policyNumber;
   }

   /**
    * Sets the policy number.
    *
    * @param policyNumber the policy number to set
    */
   public void setPolicyNumber(String policyNumber) {
      this.policyNumber = policyNumber;
   }

   /**
    * Gets the name of the insurance provider.
    *
    * @return the provider name
    */
   public String getProviderName() {
      return providerName;
   }

   /**
    * Sets the name of the insurance provider.
    *
    * @param providerName the provider name to set
    */
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   /**
    * Gets the policy holder.
    *
    * @return the policy holder
    */
   public PolicyHolder getPolicyHolder() {
      return policyHolder;
   }

   /**
    * Sets the policy holder.
    *
    * @param policyHolder the policy holder to set
    */
   public void setPolicyHolder(PolicyHolder policyHolder) {
      this.policyHolder = policyHolder;
   }

   /**
    * Calculates the price of the policy based on various factors.
    *
    * @return the calculated price
    */
   public double calculatePrice() {
      double baseFee = 600;
      double additionalFee = 0;
      if (policyHolder.getAge() > 50) {
         additionalFee += 75;
      }
      if (policyHolder.getSmokingStatus().equals("smoker")) {
         additionalFee += 100;
      }
      if (policyHolder.calculateBMI() > 35) {
         additionalFee += (policyHolder.calculateBMI() - 35) * 20;
      }
      return baseFee + additionalFee;
   }

   /**
    * Returns the number of Policy objects created.
    *
    * @return the number of Policy objects created
    */
   public static int getPolicyCount() {
      return policyCount;
   }
}
