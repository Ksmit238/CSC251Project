/**
 * The PolicyHolder class represents a person associated with an insurance policy.
 */
class PolicyHolder {
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   /**
    * Constructs a default PolicyHolder object with preset values.
    */
   public PolicyHolder() {
      this.firstName = "John";
      this.lastName = "Doe";
      this.age = 30;
      this.smokingStatus = "non-smoker";
      this.height = 70;
      this.weight = 150;
   }

   /**
    * Constructs a PolicyHolder object with specified values.
    *
    * @param firstName       the first name of the policyholder
    * @param lastName        the last name of the policyholder
    * @param age             the age of the policyholder
    * @param smokingStatus   the smoking status of the policyholder
    * @param height          the height of the policyholder
    * @param weight          the weight of the policyholder
    */
   public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }

   /**
    * Gets the first name of the policyholder.
    *
    * @return the first name
    */
   public String getFirstName() {
      return firstName;
   }

   /**
    * Sets the first name of the policyholder.
    *
    * @param firstName the first name to set
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   /**
    * Gets the last name of the policyholder.
    *
    * @return the last name
    */
   public String getLastName() {
      return lastName;
   }

   /**
    * Sets the last name of the policyholder.
    *
    * @param lastName the last name to set
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   /**
    * Gets the age of the policyholder.
    *
    * @return the age
    */
   public int getAge() {
      return age;
   }

   /**
    * Sets the age of the policyholder.
    *
    * @param age the age to set
    */
   public void setAge(int age) {
      this.age = age;
   }

   /**
    * Gets the smoking status of the policyholder.
    *
    * @return the smoking status
    */
   public String getSmokingStatus() {
      return smokingStatus;
   }

   /**
    * Sets the smoking status of the policyholder.
    *
    * @param smokingStatus the smoking status to set
    */
   public void setSmokingStatus(String smokingStatus) {
      this.smokingStatus = smokingStatus;
   }

   /**
    * Gets the height of the policyholder.
    *
    * @return the height
    */
   public double getHeight() {
      return height;
   }

   /**
    * Sets the height of the policyholder.
    *
    * @param height the height to set
    */
   public void setHeight(double height) {
      this.height = height;
   }

   /**
    * Gets the weight of the policyholder.
    *
    * @return the weight
    */
   public double getWeight() {
      return weight;
   }

   /**
    * Sets the weight of the policyholder.
    *
    * @param weight the weight to set
    */
   public void setWeight(double weight) {
      this.weight = weight;
   }

   /**
    * Calculates the Body Mass Index (BMI) of the policyholder.
    *
    * @return the calculated BMI
    */
   public double calculateBMI() {
      return (weight * 703) / (height * height);
   }

   /**
    * Returns a string representation of the PolicyHolder object.
    *
    * @return a string representation of the PolicyHolder object
    */
   @Override
   public String toString() {
      return "PolicyHolder{" +
             "firstName='" + firstName + '\'' +
             ", lastName='" + lastName + '\'' +
             ", age=" + age +
             ", smokingStatus='" + smokingStatus + '\'' +
             ", height=" + height +
             ", weight=" + weight +
             '}';
   }
}
