
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Manages student grades for a subject
 * Interacts with user through a menu
 * Stores student's names in an array 
 * and student grades in a bidimensional array
 * @author Jose
 */
public class GradeManager {

	public static void main(String[] args) {
		/*    DATA DEFINITION    */
		//màximum number of students
		final int maxStudents = 30;
		//actual number of students
		int numStudents = 0;
		//màximum number of grades to manage (one per UF)
		final int numGrades = 6;
		//program menu
		final String [] menuOptions = {
				"Exit",
				"List name of all students",
				"List all grades of a student (given their name)",
				"List all student's grades for a given UF",
				"List all grades of all students",
				"Set grade for a student and UF"
		};
		//array of student's names
		String [] studentNames = new String[maxStudents];
		//array of grades
		int [][] studentGrades = new int[maxStudents][numGrades];
		//exit flag
		boolean exit = false;
		//load data (student's names and grades)
		/*    PROGRAM EXECUTION    */
		numStudents = loadData(studentNames, studentGrades, numStudents);
		//control loop
		do {
			//display menu and read user's option
			int optionSelected = displayMenuAndReadUserChoice(menuOptions);
			//execute option selected by user
			switch (optionSelected) {
				case 0:  //exit program
					exit = true;
					break;
				case 1: //list name of all students
					listAllStudentNames(studentNames, numStudents);
					break;
				case 2: //list all grades of a student (given their name)
					listAllGradesOfAStudent(studentNames, studentGrades, numStudents);
					break;
				case 3: //list all student's grades for a given UF
					listUFGradeOfAStudent(studentNames, studentGrades, numStudents);
					break;
				case 4: //list all grades of all students
					listAllGradesOfAllStudents(studentNames, studentGrades, numStudents);
					break;
				case 5: //Set grade for a student and UF
					setUFGradeOfAStudent(studentNames, studentGrades, numStudents);
					break;
				default:
					System.out.println("Bad option");
					break;
			}
		} while (!exit);
		System.out.println("Closing program");
	}

	/**
	 * displays options of program menu
	 * and inputs user's choice
	 * @param options the array of options of the menu
	 * @return index of selected option
	 */
	private static int displayMenuAndReadUserChoice(String [] options) {
		System.out.println("===== Grade manager menu =====");
		for (int i = 0; i < options.length; i++) {
			System.out.format("[%d]. %s\n", i, options[i]);
		}
		Scanner scan = new Scanner(System.in);
		int choice = -1;
		while (choice < 0) {
			try {
				//ask user's choice
				System.out.print("Select an option: ");
				choice = scan.nextInt();
				//validate choice
				if ((choice<0) || (choice>=options.length)) {
					choice = -1;
				}
			} catch (InputMismatchException e) {
				choice = -1;
				scan.next();
			}

		}
		return choice;
	}

	/*    CONTROL METHODS    */

	/**
	 * lists names of all students
	 * @param names the array with the names
	 * @param numSt the actual number of students
	 */
	private static void listAllStudentNames(String [] names, int numSt) {
		System.out.println("Student's names");
		for (int i = 0; i < numSt; i++) {
			System.out.println(names[i]);
		}
	}

	/**
	 * inputs student's name and lists all grades of that student
	 * @param names the array with the names
	 * @param grades the array with de grades
	 * @param numSt the actual number of students
	 */
	private static void listAllGradesOfAStudent(String [] names, int [][] grades, int numSt) {
		Scanner scan = new Scanner(System.in);
		//input student's name
		System.out.print("Student's name: ");
		String name = scan.nextLine();
		//find student index (row)
		int studentRow = indexOfStudentName(names, name, numSt);
		if (studentRow < 0) {  //not found
			System.out.format("There is no student with name '%s'\n", name);
		} else {
			//list grades of found student
			System.out.println("Grades of student: "+name);
			for (int i = 0; i < getNumCols(grades); i++) {
				System.out.format("%d ", grades[studentRow][i]);
			}
			System.out.println("");
		}
	}

	/**
	 * inputs student's name and a UF and shows their grade
	 * @param names the array with the names
	 * @param grades the array with de grades
	 * @param numSt the actual number of students
	 */
	private static void listUFGradeOfAStudent(String [] names, int [][] grades, int numSt) {
		Scanner scan = new Scanner(System.in);
		//input student's name
		System.out.print("Student's name: ");
		String name = scan.nextLine();
		//find student index (row)
		int studentRow = indexOfStudentName(names, name, numSt);

		// input UF number
		int UF = -1;
		System.out.print("UF number: ");
		try {
			UF = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("The value couldn't be read. Make sure you input an integer");
		}

		if (studentRow < 0) {  //not found
			System.out.format("There is no student with name '%s'\n", name);
		} else if (UF < 0 || UF > getNumCols(grades)) { // UF not found
			System.out.format("There is no student with number '%d'\n", UF);
		} else {
			//list grade of found student and UF
			System.out.format("Grade of UF %d for student %s: %d\n", UF, name, grades[studentRow][UF]);
		}
	}

	/**
	 * lists all grades of all students
	 * @param names the array with the names
	 * @param grades the array with de grades
	 * @param numSt the actual number of students
	 */
	private static void listAllGradesOfAllStudents(String[] names, int[][] grades, int numSt) {
		for (int i = 0; i < numSt; i++) {
			System.out.println("Grades of student: "+names[i]);
			for (int j = 0; j < getNumCols(grades); j++) {
				System.out.format("%d ", grades[i][j]);
			}
			System.out.println("");
		}
	}

	/**
	 * inputs student's name and a UF and shows their grade
	 * @param names the array with the names
	 * @param grades the array with de grades
	 * @param numSt the actual number of students
	 */
	private static void setUFGradeOfAStudent(String [] names, int [][] grades, int numSt) {
		Scanner scan = new Scanner(System.in);
		//input student's name
		System.out.print("Student's name: ");
		String name = scan.nextLine();

		//find student index (row)
		int studentRow = indexOfStudentName(names, name, numSt);

		// input UF number
		int UF = -1;
		System.out.print("UF number: ");
		try {
			UF = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("The value couldn't be read. Make sure you input an integer");
		}

		// input grade
		int grade = -1;
		System.out.print("New grade: ");
		try {
			grade = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("The value couldn't be read. Make sure you input an integer");
		}
		if (studentRow < 0) {  // student not found
			System.out.format("There is no student with name '%s'\n", name);
		} else if (UF < 0 || UF > getNumCols(grades)) {  // UF not fund
			System.out.format("There is no student with number '%d'\n", UF);
		} else if (grade < 0 || grade > 10) { // invalid grade
			System.out.println("The grade must be between 0 and 10");
		} else {
			//list grades of found student
			grades[studentRow][UF] = grade;
			System.out.format("Grade of UF %d for student %s successfully updated\n", UF, name);
		}
	}

	/*     USEFUL METHODS     */

	/**
	 * searches a student by name
	 * @param names the array with the names
	 * @param name the name to search
	 * @param numSt the actual number of students
	 * @return index of student of -1 if not found
	 */
	private static int indexOfStudentName(String [] names, String name, int numSt) {
		int index = -1;
		for (int i = 0; i < numSt; i++) {
			if (names[i].equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}

	/**
	 * gets the number of rows of a bidimensional array
	 * @param data the array
	 * @return number of rows
	 */
	private static int getNumRows(int [][] data) {
		return data.length;
	}

	/**
	 * gets the number of columns of a bidimensional array
	 * assuming there is at least one row
	 * @param data the array
	 * @return number of columns
	 */
	private static int getNumCols(int [][] data) {
		return data[0].length;
	}

	/**
	 * loads initial data to test the program
	 * @param names the array with the names
	 * @param grades the array with de grades
	 * @param numSt the actual number of students
	 * @return the actual number of students after operation
	 */
	private static int loadData(String [] names, int [][] grades, int numStudents) {
		numStudents = addStudent(names, grades, numStudents, "StudName01");
		numStudents = addStudent(names, grades, numStudents, "StudName02");
		numStudents = addStudent(names, grades, numStudents, "StudName03");
		numStudents = addStudent(names, grades, numStudents, "StudName04");
		numStudents = addStudent(names, grades, numStudents, "StudName05");
		numStudents = addStudent(names, grades, numStudents, "StudName06");
		numStudents = addStudent(names, grades, numStudents, "StudName07");
		numStudents = addStudent(names, grades, numStudents, "StudName08");
		numStudents = addStudent(names, grades, numStudents, "StudName09");
		numStudents = addStudent(names, grades, numStudents, "StudName10");
		numStudents = addStudent(names, grades, numStudents, "StudName11");
		numStudents = addStudent(names, grades, numStudents, "StudName12");
		return numStudents;
	}

	/**
	 * adds a new student and set random grades (for testing)
	 * @param names the array with the names
	 * @param grades the array with de grades
	 * @param numSt the actual number of students
	 * @param name the name of the student to set
	 * @return the actual number of students after operation
	 */
	private static int addStudent(String[] names, int[][] grades, int numStudents, String name) {
		if (numStudents<names.length) {
			names[numStudents] = name;
			Random rnd = new Random();
			for (int i = 0; i < getNumCols(grades); i++) {
				grades[numStudents][i] = rnd.nextInt(1, 10);
			}
			numStudents++;
		}
		return numStudents;
	}

}
