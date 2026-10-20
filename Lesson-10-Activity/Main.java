
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		System.out.print("Enter grade level (9-12): ");
		int gradeLevel = Input.readInt();
		System.out.print("Enter credits earned: ");
		int creditsEarned = Input.readInt();

		if (isGraduating(gradeLevel, creditsEarned)) {
			System.out.println("Student is Graduating");
		} else {
			System.out.println("Student is NOT Graduating");
		}

  }
	double gpa(double grade) {
		if (grade > 90) {
			return grade * 1.1;
		}
		return grade;
	}

	boolean isGraduating (int gradeLevel, int creditsEarned) {
		return gradeLevel == 12 && creditsEarned >= 44;
	}

	String BMI (double weightPounds, double heightInches) {
		double bmi = 703 * weightPounds / (heightInches * heightInches);
		if (bmi <= 18.4) {
			return "Underweight";
		}
		if (bmi <= 24.9) {
			return "Normal";
		}
		if (bmi <= 39.9) {
			return "Overweight";
		}
		return "Obese";
	}

	double shippingCost(double weightPounds) {
		if (weightPounds <= 10) {
			return 0.00;
		}
		if (weightPounds <= 15) {
			return 5.00;
		}
		if (weightPounds <= 25) {
			return 10.00;
		}
		return 10.00 + (weightPounds - 25) * 0.02;
	}

	boolean blueOrViolet(double frequency) {
		return (frequency >= 600 && frequency <= 670) || (frequency >= 700 && frequency <= 750);
	}
  
}