package OOPsInterface;

public class FortisHospital implements USMedical, UKMedical, IndiaMedical {

	static final int min_fee = 50;

	// US Medical
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");

	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");

	}

	// UK Medical
//	@Override
//	public void emergencyServices() {
//		System.out.println("FH -- emergencyServices");
//		
//	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");

	}

	// India Medical
	@Override
	public void gynoServices() {
		System.out.println("FH -- gynoServices");

	}

	@Override
	public void ENTServices() {
		System.out.println("FH -- ENTServices");

	}

//	@Override
//	public void EmergencyServices() {
//		System.out.println("FH -- EmergencyServices");
//		
//	}

	// Individual
	public void medicalInsurance() {
		System.out.println("FH -- medicalInsurance");

	}

	public void medicalTraining() {
		System.out.println("FH -- medicalTraining");

	}

	// common:

	@Override
	public void EmergencyServices() {
		System.out.println("FH --EmergencyServices ");

	}

//	// Method Hiding
//	public static void billing() {
//		System.out.println("FH - billing");
//	}

	@Override
	public void RnD() {
		System.out.println("FH - R&D");
	}

	// WHO 
	@Override
	public void covidVaccination() {
		System.out.println("FH - covidVaccination");

	}

}
