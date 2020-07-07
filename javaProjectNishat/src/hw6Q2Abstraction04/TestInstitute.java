package hw6Q2Abstraction04;

public class TestInstitute {

	public static void main(String[] args) {
		
		
		System.out.println("\n"
				+ " \t Concrete class ColumbiaUniversity\n"
				+ "------------------------------------");
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.biology();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.caring();
		columbiaUniversity.hygine();
		columbiaUniversity.statistics();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.computerLab();
		columbiaUniversity.physics();
//		columbiaUniversity.library();//static  method can't called
		columbiaUniversity.gymnesium();
		columbiaUniversity.classSize();
		columbiaUniversity.field();//declared /abstract method from interface implemented and called

		columbiaUniversity.teacher();
		columbiaUniversity.dorm();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.commonRoom();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.morgue();
		columbiaUniversity.vocationalInfo();
		
		System.out.println("\n"
				+ "\t Concrete class RockefellerUniversity \n---------------------------------------------");
		RockefellerUniversity rockefellerUniversity = new RockefellerUniversity();
		rockefellerUniversity.statistics();
		rockefellerUniversity.mechanicalLab();
		rockefellerUniversity.computerLab();
		rockefellerUniversity.physics();
		rockefellerUniversity.aeronauticalInfo();
		rockefellerUniversity.computerLab();
		rockefellerUniversity.mechanicalLab();
		rockefellerUniversity.physics();
		
		System.out.println("\n"
				+ "\tInterface University\n"
				+ "---------------------------------------------");
		University university  = new ColumbiaUniversity();
		university.cafeteria();
		university.classSize();
		university.gymnesium();
		university.field();
		university.teacher();
		university.dorm();
		university.laboratory();
		university.languageClub();
		university.commonRoom();
		university.emergencyRoom();
		university.surgeryRoom();
		university.morgue();
		
		System.out.println("\n"
				+ "\tInterface Hospital\n"
				+ "---------------------------------------------");
		Hospital hospital = new ColumbiaUniversity();
		hospital.emergencyRoom();
		hospital.cafeteria();
		hospital.surgeryRoom();
		hospital.morgue();
		
		System.out.println("\n"
				+ "\tAbstract class Medical school\n"
				+ "---------------------------------------------");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.hygine();
		medicalSchool.caring();
		medicalSchool.aeronauticalInfo();
		medicalSchool.computerLab();
		medicalSchool.mechanicalLab();
		medicalSchool.computerLab();
		medicalSchool.physics();
		
		System.out.println("\n"
				+ "\tAbstract class NursingSchool\n"
				+ "---------------------------------------------");
		NursingSchool nursingSchool = new ColumbiaUniversity();
		nursingSchool.hygine();
		nursingSchool.caring();
		nursingSchool.statistics();
		nursingSchool.aeronauticalInfo();
		nursingSchool.computerLab();
		nursingSchool.mechanicalLab();
		nursingSchool.computerLab();
		
		
		
		System.out.println("\n"
				+ "\tAbstract class EngeenieringSchool\n"
				+ "---------------------------------------------");
		EngineeringSchool engineeringSchool = new RockefellerUniversity();
		engineeringSchool.computerLab();
		engineeringSchool.mechanicalLab();
		engineeringSchool.physics();
		
		
		
		
		
		

	}

}
