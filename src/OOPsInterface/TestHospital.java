package OOPsInterface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.oncologyServices();
		fh.pediaServices();
		fh.dentalServices();
		fh.orthoServices();
		fh.gynoServices();
		fh.ENTServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.EmergencyServices();

		System.out.println(USMedical.min_fee);
		System.out.println(FortisHospital.min_fee);

		USMedical.billing();
		fh.covidVaccination();

		// top casting: child class object can be referred by parent interface ref
		// variable
		USMedical us = new FortisHospital();
		us.covidVaccination();
		us.EmergencyServices();
		us.oncologyServices();
		us.pediaServices();
		us.physioServices();
		us.RnD();

		UKMedical uk = new FortisHospital();
		uk.dentalServices();
		uk.EmergencyServices();
		uk.orthoServices();

		// down casting: NA
		//FortisHospital fh1 = new USMedical();

	}

}
