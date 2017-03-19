package com.cisc181.core;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;


//I changed the major of a student on line 84
public class Student_Test {

	@BeforeClass
	public static void setup() throws PersonException {
		Course one = new Course("Physics 207", 100, eMajor.PHYSICS);
		PhysicsClass = one;
		Course two = new Course("Chemistry 101", 100, eMajor.CHEM);
		ChemClass = two;
		Course three = new Course("Intro to Entreprenuership 101", 100, eMajor.BUSINESS);
		BusClass = three;
		ArrayList<Course> courses = new ArrayList();
		courses.add(one);
		courses.add(two);
		courses.add(three);

		Calendar cal = Calendar.getInstance();
		cal.set(2017, 8, 1);
		Date fStartDate = cal.getTime();
		cal.set(2017, 11, 18);
		Date fEndDate = cal.getTime();
		cal.set(2018, 1, 6);
		Date sStartDate = cal.getTime();
		cal.set(2018, 4, 20);
		Date sEndDate = cal.getTime();
		Semester fall = new Semester(fStartDate, fEndDate);
		Semester spring = new Semester(sStartDate, sEndDate);
		ArrayList<Semester> semesters = new ArrayList();
		semesters.add(fall);
		semesters.add(spring);

		Section fOne1 = new Section(one.getCouseID(), fall.getSemesterID(), 1);
		Section sOne1 = new Section(one.getCouseID(), spring.getSemesterID(), 1);
		Section fTwo1 = new Section(two.getCouseID(), fall.getSemesterID(), 2);
		Section sTwo1 = new Section(two.getCouseID(), spring.getSemesterID(), 2);
		Section fThree1 = new Section(three.getCouseID(), fall.getSemesterID(), 3);
		Section sThree1 = new Section(three.getCouseID(), spring.getSemesterID(), 3);
		ArrayList<Section> sections = new ArrayList();
		sections.add(fOne1);
		sections.add(sOne1);
		sections.add(fTwo1);
		sections.add(sTwo1);
		sections.add(fThree1);
		sections.add(sThree1);
		classSections = sections;

		cal.set(1984, 5, 13);
		Date date = cal.getTime();

		Student Lebron = new Student("Lebron", "A", "James", date, eMajor.CHEM, "Ohio", "(111)-222-3333",
				"LJames@udel.edu");
		Student Kevin = new Student("Kevin", "B", "Love", date, eMajor.BUSINESS, "Ohio", "(111)-242-3333",
				"KLove@udel.edu");
		Student Kyrie = new Student("Kyrie", "C", "Irving", date, eMajor.PHYSICS, "Ohio", "(111)-267-3333",
				"KIrvings@udel.edu");
		Student Iman = new Student("Iman", "D", "Shumpert", date, eMajor.CHEM, "Ohio", "(111)-291-3333",
				"IShumpert@udel.edu");
		Student JR = new Student("JR", "E", "Smith", date, eMajor.NURSING, "Ohio", "(111)-344-3333",
				"JRSmith@udel.edu");
		Student Richard = new Student("Richard", "F", "Jefferson", date, eMajor.COMPSI, "Ohio", "(111)-437-3333",
				"RJ@udel.edu");
		Student Channing = new Student("Channing", "G", "Frye", date, eMajor.PHYSICS, "Ohio", "(111)-512-3333",
				"CFrye@udel.edu");
		Student Kyle = new Student("Kyle", "H", "Korver", date, eMajor.COMPSI, "Ohio", "(111)-963-3333",
				"KKorver@udel.edu");
		Student Deron = new Student("Deron", "I", "Williams", date, eMajor.NURSING, "Ohio", "(111)-853-3333",
				"DWilliams@udel.edu");
		Student Larry = new Student("Larry", "J", "Sanders", date, eMajor.BUSINESS, "Ohio", "(111)-054-3333",
				"LSanders@udel.edu");
		Larry.setMajor(eMajor.COMPSI);
		ArrayList<Student> students = new ArrayList();
		students.add(Lebron);
		students.add(Kevin);
		students.add(Kyrie);
		students.add(Iman);
		students.add(JR);
		students.add(Richard);
		students.add(Channing);
		students.add(Kyle);
		students.add(Deron);
		students.add(Larry);

		Enrollment fc1id1 = new Enrollment(Lebron.getStudentID(), fOne1.getSectionID());
		Enrollment fc1id2 = new Enrollment(Kevin.getStudentID(), fOne1.getSectionID());
		Enrollment fc1id3 = new Enrollment(Kyrie.getStudentID(), fOne1.getSectionID());
		Enrollment fc1id4 = new Enrollment(Iman.getStudentID(), fOne1.getSectionID());
		Enrollment fc1id5 = new Enrollment(JR.getStudentID(), fOne1.getSectionID());
		Enrollment fc1id6 = new Enrollment(Richard.getStudentID(), fOne1.getSectionID());
		Enrollment fc1id7 = new Enrollment(Channing.getStudentID(), fOne1.getSectionID());
		Enrollment fc1id8 = new Enrollment(Kyle.getStudentID(), fOne1.getSectionID());
		Enrollment fc1id9 = new Enrollment(Deron.getStudentID(), fOne1.getSectionID());
		Enrollment fc1id10 = new Enrollment(Larry.getStudentID(), fOne1.getSectionID());

		Enrollment sc1id1 = new Enrollment(Lebron.getStudentID(), sOne1.getSectionID());
		Enrollment sc1id2 = new Enrollment(Kevin.getStudentID(), sOne1.getSectionID());
		Enrollment sc1id3 = new Enrollment(Kyrie.getStudentID(), sOne1.getSectionID());
		Enrollment sc1id4 = new Enrollment(Iman.getStudentID(), sOne1.getSectionID());
		Enrollment sc1id5 = new Enrollment(JR.getStudentID(), sOne1.getSectionID());
		Enrollment sc1id6 = new Enrollment(Richard.getStudentID(), sOne1.getSectionID());
		Enrollment sc1id7 = new Enrollment(Channing.getStudentID(), sOne1.getSectionID());
		Enrollment sc1id8 = new Enrollment(Kyle.getStudentID(), sOne1.getSectionID());
		Enrollment sc1id9 = new Enrollment(Deron.getStudentID(), sOne1.getSectionID());
		Enrollment sc1id10 = new Enrollment(Larry.getStudentID(), sOne1.getSectionID());

		Enrollment fc2id1 = new Enrollment(Lebron.getStudentID(), fTwo1.getSectionID());
		Enrollment fc2id2 = new Enrollment(Kevin.getStudentID(), fTwo1.getSectionID());
		Enrollment fc2id3 = new Enrollment(Kyrie.getStudentID(), fTwo1.getSectionID());
		Enrollment fc2id4 = new Enrollment(Iman.getStudentID(), fTwo1.getSectionID());
		Enrollment fc2id5 = new Enrollment(JR.getStudentID(), fTwo1.getSectionID());
		Enrollment fc2id6 = new Enrollment(Richard.getStudentID(), fTwo1.getSectionID());
		Enrollment fc2id7 = new Enrollment(Channing.getStudentID(), fTwo1.getSectionID());
		Enrollment fc2id8 = new Enrollment(Kyle.getStudentID(), fTwo1.getSectionID());
		Enrollment fc2id9 = new Enrollment(Deron.getStudentID(), fTwo1.getSectionID());
		Enrollment fc2id10 = new Enrollment(Larry.getStudentID(), fTwo1.getSectionID());

		Enrollment sc2id1 = new Enrollment(Lebron.getStudentID(), sTwo1.getSectionID());
		Enrollment sc2id2 = new Enrollment(Kevin.getStudentID(), sTwo1.getSectionID());
		Enrollment sc2id3 = new Enrollment(Kyrie.getStudentID(), sTwo1.getSectionID());
		Enrollment sc2id4 = new Enrollment(Iman.getStudentID(), sTwo1.getSectionID());
		Enrollment sc2id5 = new Enrollment(JR.getStudentID(), sTwo1.getSectionID());
		Enrollment sc2id6 = new Enrollment(Richard.getStudentID(), sTwo1.getSectionID());
		Enrollment sc2id7 = new Enrollment(Channing.getStudentID(), sTwo1.getSectionID());
		Enrollment sc2id8 = new Enrollment(Kyle.getStudentID(), sTwo1.getSectionID());
		Enrollment sc2id9 = new Enrollment(Deron.getStudentID(), sTwo1.getSectionID());
		Enrollment sc2id10 = new Enrollment(Larry.getStudentID(), sTwo1.getSectionID());

		Enrollment fc3id1 = new Enrollment(Lebron.getStudentID(), fThree1.getSectionID());
		Enrollment fc3id2 = new Enrollment(Kevin.getStudentID(), fThree1.getSectionID());
		Enrollment fc3id3 = new Enrollment(Kyrie.getStudentID(), fThree1.getSectionID());
		Enrollment fc3id4 = new Enrollment(Iman.getStudentID(), fThree1.getSectionID());
		Enrollment fc3id5 = new Enrollment(JR.getStudentID(), fThree1.getSectionID());
		Enrollment fc3id6 = new Enrollment(Richard.getStudentID(), fThree1.getSectionID());
		Enrollment fc3id7 = new Enrollment(Channing.getStudentID(), fThree1.getSectionID());
		Enrollment fc3id8 = new Enrollment(Kyle.getStudentID(), fThree1.getSectionID());
		Enrollment fc3id9 = new Enrollment(Deron.getStudentID(), fThree1.getSectionID());
		Enrollment fc3id10 = new Enrollment(Larry.getStudentID(), fThree1.getSectionID());

		Enrollment sc3id1 = new Enrollment(Lebron.getStudentID(), sThree1.getSectionID());
		Enrollment sc3id2 = new Enrollment(Kevin.getStudentID(), sThree1.getSectionID());
		Enrollment sc3id3 = new Enrollment(Kyrie.getStudentID(), sThree1.getSectionID());
		Enrollment sc3id4 = new Enrollment(Iman.getStudentID(), sThree1.getSectionID());
		Enrollment sc3id5 = new Enrollment(JR.getStudentID(), sThree1.getSectionID());
		Enrollment sc3id6 = new Enrollment(Richard.getStudentID(), sThree1.getSectionID());
		Enrollment sc3id7 = new Enrollment(Channing.getStudentID(), sThree1.getSectionID());
		Enrollment sc3id8 = new Enrollment(Kyle.getStudentID(), sThree1.getSectionID());
		Enrollment sc3id9 = new Enrollment(Deron.getStudentID(), sThree1.getSectionID());
		Enrollment sc3id10 = new Enrollment(Larry.getStudentID(), sThree1.getSectionID());

		ArrayList<Enrollment> lebronsGrades = new ArrayList();
		lebronsGrades.add(fc1id1);
		lebronsGrades.add(sc1id1);
		lebronsGrades.add(fc2id1);
		lebronsGrades.add(sc2id1);
		lebronsGrades.add(fc3id1);
		lebronsGrades.add(sc3id1);
		for (Enrollment e : lebronsGrades) {
			e.setGrade(85);
		}
		LBJ = lebronsGrades;

		ArrayList<Enrollment> KevinsGrades = new ArrayList();
		KevinsGrades.add(fc1id2);
		KevinsGrades.add(sc1id2);
		KevinsGrades.add(fc2id2);
		KevinsGrades.add(sc2id2);
		KevinsGrades.add(fc3id2);
		KevinsGrades.add(sc3id2);
		for (Enrollment e : KevinsGrades) {
			e.setGrade(96);
		}
		KL = KevinsGrades;

		ArrayList<Enrollment> KyriesGrades = new ArrayList();
		KyriesGrades.add(fc1id3);
		KyriesGrades.add(sc1id3);
		KyriesGrades.add(fc2id3);
		KyriesGrades.add(sc2id3);
		KyriesGrades.add(fc3id3);
		KyriesGrades.add(sc3id3);
		for (Enrollment e : KyriesGrades) {
			e.setGrade(95);
		}
		KR = KyriesGrades;

		ArrayList<Enrollment> ImansGrades = new ArrayList();
		ImansGrades.add(fc1id4);
		ImansGrades.add(sc1id4);
		ImansGrades.add(fc2id4);
		ImansGrades.add(sc2id4);
		ImansGrades.add(fc3id4);
		ImansGrades.add(sc3id4);
		for (Enrollment e : ImansGrades) {
			e.setGrade(75);
		}
		IS = ImansGrades;

		ArrayList<Enrollment> JRsGrades = new ArrayList();
		JRsGrades.add(fc1id5);
		JRsGrades.add(sc1id5);
		JRsGrades.add(fc2id5);
		JRsGrades.add(sc2id5);
		JRsGrades.add(fc3id5);
		JRsGrades.add(sc3id5);
		for (Enrollment e : JRsGrades) {
			e.setGrade(76);
		}
		JS = JRsGrades;

		ArrayList<Enrollment> RichardsGrades = new ArrayList();
		RichardsGrades.add(fc1id6);
		RichardsGrades.add(sc1id6);
		RichardsGrades.add(fc2id6);
		RichardsGrades.add(sc2id6);
		RichardsGrades.add(fc3id6);
		RichardsGrades.add(sc3id6);
		for (Enrollment e : RichardsGrades) {
			e.setGrade(80);
		}
		RJ = RichardsGrades;

		ArrayList<Enrollment> ChanningsGrades = new ArrayList();
		ChanningsGrades.add(fc1id7);
		ChanningsGrades.add(sc1id7);
		ChanningsGrades.add(fc2id7);
		ChanningsGrades.add(sc2id7);
		ChanningsGrades.add(fc3id7);
		ChanningsGrades.add(sc3id7);
		for (Enrollment e : ChanningsGrades) {
			e.setGrade(83);
		}
		CF = ChanningsGrades;

		ArrayList<Enrollment> KylesGrades = new ArrayList();
		KylesGrades.add(fc1id8);
		KylesGrades.add(sc1id8);
		KylesGrades.add(fc2id8);
		KylesGrades.add(sc2id8);
		KylesGrades.add(fc3id8);
		KylesGrades.add(sc3id8);
		for (Enrollment e : KylesGrades) {
			e.setGrade(93);
		}
		KK = KylesGrades;

		ArrayList<Enrollment> DeronsGrades = new ArrayList();
		DeronsGrades.add(fc1id9);
		DeronsGrades.add(sc1id9);
		DeronsGrades.add(fc2id9);
		DeronsGrades.add(sc2id9);
		DeronsGrades.add(fc3id9);
		DeronsGrades.add(sc3id9);
		for (Enrollment e : DeronsGrades) {
			e.setGrade(79);
		}
		DW = DeronsGrades;

		ArrayList<Enrollment> LarrysGrades = new ArrayList();
		LarrysGrades.add(fc1id10);
		LarrysGrades.add(sc1id10);
		LarrysGrades.add(fc2id10);
		LarrysGrades.add(sc2id10);
		LarrysGrades.add(fc3id10);
		LarrysGrades.add(sc3id10);
		for (Enrollment e : LarrysGrades) {
			e.setGrade(59);
		}
		LS = LarrysGrades;

		ArrayList<Enrollment> allEnrollments = new ArrayList();
		allEnrollments.addAll(lebronsGrades);
		allEnrollments.addAll(KevinsGrades);
		allEnrollments.addAll(KyriesGrades);
		allEnrollments.addAll(ImansGrades);
		allEnrollments.addAll(JRsGrades);
		allEnrollments.addAll(RichardsGrades);
		allEnrollments.addAll(ChanningsGrades);
		allEnrollments.addAll(KylesGrades);
		allEnrollments.addAll(DeronsGrades);
		allEnrollments.addAll(LarrysGrades);
		all = allEnrollments;

	}
	static Course PhysicsClass;
	static Course ChemClass;
	static Course BusClass;
	
	static ArrayList<Section> classSections;

	static ArrayList<Enrollment> LBJ;
	static ArrayList<Enrollment> KL;
	static ArrayList<Enrollment> KR;
	static ArrayList<Enrollment> IS;
	static ArrayList<Enrollment> JS;
	static ArrayList<Enrollment> RJ;
	static ArrayList<Enrollment> CF;
	static ArrayList<Enrollment> KK;
	static ArrayList<Enrollment> DW;
	static ArrayList<Enrollment> LS;
	static ArrayList<Enrollment> all;

	public double calculateGPA(ArrayList<Enrollment> e) {
		double gpa = 0;
		for (Enrollment e2 : e) {
			gpa += e2.getGrade();
		}
		return gpa / 6;
	}

	public double calculateCourseGPA(ArrayList<Enrollment> e, Course c, ArrayList<Section> s) {
		double courseGPA = 0;
		for (Section s2 : s) {
			if (s2.getCourseID() == c.getCouseID()) {
				for (Enrollment e2 : e) {
					if (e2.getSectionID() == s2.getSectionID()) {
						courseGPA += e2.getGrade();
					}
				}

			}
		}
		return courseGPA / 20;
	}

	@Test
	public void testGPAs() {
		assertEquals(85, calculateGPA(LBJ), 0.001);
		assertEquals(96, calculateGPA(KL), 0.001);
		assertEquals(95, calculateGPA(KR), 0.001);
		assertEquals(75, calculateGPA(IS), 0.001);
		assertEquals(76, calculateGPA(JS), 0.001);
		assertEquals(80, calculateGPA(RJ), 0.001);
		assertEquals(83, calculateGPA(CF), 0.001);
		assertEquals(93, calculateGPA(KK), 0.001);
		assertEquals(79, calculateGPA(DW), 0.001);
		assertEquals(59, calculateGPA(LS), 0.001);
		
		assertEquals(82.1, calculateCourseGPA(all, PhysicsClass, classSections), 0.001);
		assertEquals(82.1, calculateCourseGPA(all, ChemClass, classSections), 0.001);
		assertEquals(82.1, calculateCourseGPA(all, BusClass, classSections), 0.001);
	}
}