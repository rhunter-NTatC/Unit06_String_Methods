package tests_DO_NOT_EDIT;

import org.junit.jupiter.api.*;
import labs.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

class Test_Lab02 {

	public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}

	
	@Test
	@DisplayName("Test problem #1")
	void test1() {
		String problemNumber = "Problem #1";
		
		String[][] tests = {{"parade", "There are 2 a's in the word parade."},
							{"banana", "There are 3 a's in the word banana."},
							{"supercalifragelisticexpyalidocious", "There are 3 a's in the word supercalifragelisticexpyalidocious."},
							{"mississippi", "There are no a's in the word mississippi."},
							{"hat", "There is 1 a in the word hat."},
							};


		int i = 0;
		

		try {

			for (; i < tests.length; i++) {
				
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0]);
				Lab02.problem1();
				
				assertTrue(inOut.getOutputStream().contains(tests[i][1]));

			}
			
			int count = 0;
			for (int j = 0; j < tests.length; j++) {
				if (inOut.getOutputStream().contains(tests[j][1])) {
					count++;
				}
			}
			if (count == tests.length) {
				throw new AssertionError("Cheated");
			}
			
			inOut.resetSystem();
			
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");

		} catch (Error e) {
			inOut.resetSystem();
			
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + tests.length
					+ "\n   Input tested: " +  tests[i][0]
					+ "\n   Expected output: " + tests[i][1] 
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			fail();
		}
		
	}
	
	
	@Test
	@DisplayName("Test problem #2")
	void test2() {
		String problemNumber = "Problem #2";
		
		String[][] tests = {{"happy", "There is a double letter in the word happy."},
							{"fred", "There is not a double letter in the word fred."},
							{"jello", "There is a double letter in the word jello."},
							{"table", "There is not a double letter in the word table."},
							{"floo", "There is a double letter in the word floo."},
							{"ooze", "There is a double letter in the word ooze."},
							{"a", "There is not a double letter in the word a."},
							};
		
		
		int i = 0;
		
		
		try {
		
			for (; i < tests.length; i++) {
				
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0]);
				Lab02.problem2();
				
				assertTrue(inOut.getOutputStream().contains(tests[i][1]));
			
			}
			
			int count = 0;
			for (int j = 0; j < tests.length; j++) {
				if (inOut.getOutputStream().contains(tests[j][1])) {
					count++;
				}
			}
			if (count == tests.length) {
				throw new AssertionError("Cheated");
			}
			
			inOut.resetSystem();
			
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
			
		} catch (Error e) {
			inOut.resetSystem();
			
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + tests.length
					+ "\n   Input tested: " +  tests[i][0]
					+ "\n   Expected output: " + tests[i][1] 
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			fail();
		}
		
	}
	
	
	@Test
	@DisplayName("Test problem #3")
	void test3() {
		String problemNumber = "Problem #3";
		
		String[][] tests = {{"Salisbury steak is delicious!", "S@li$bury $t#@k i$ d#liciou$!"},
							{"How's the air up there?", "How'$ th# @ir up th#r#?"},
							{"Is this sentence long enough for a good test?", "I$ thi$ $#nt#nc# long #nough for @ good t#$t?"},
							};


		int i = 0;
		
		
		try {
		
			for (; i < tests.length; i++) {
				
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0]);
				Lab02.problem3();
				
				assertTrue(inOut.getOutputStream().contains(tests[i][1]));
			
			}
			
			int count = 0;
			for (int j = 0; j < tests.length; j++) {
				if (inOut.getOutputStream().contains(tests[j][1])) {
					count++;
				}
			}
			if (count == tests.length) {
				throw new AssertionError("Cheated");
			}
			
			inOut.resetSystem();
			
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
		
		} catch (Error e) {
		inOut.resetSystem();
		
		System.out.println("Error " + problemNumber + ": "
				+ "\n   Failed test " + (i+1) + " of " + tests.length
				+ "\n   Input tested: " +  tests[i][0]
				+ "\n   Expected output: " + tests[i][1] 
				+ "\n   Your output: \n" + inOut.getOutputStream()
				+ "\n\n\n\n");
		fail();
		}
		
		
	}
	
	
	@Test
	@DisplayName("Test problem #4")
	void test4() {
		String problemNumber = "Problem #4";
		
		String[][] tests = {{"creepers\ne","\"e\" occurs at the following index(s): 2 3 5"},
							{"blanket\nl","\"l\" occurs at the following index(s): 1"},
							{"mississippi\ni","\"i\" occurs at the following index(s): 1 4 7 10"},
							{"boo\no","\"o\" occurs at the following index(s): 1 2"},
							{"supercalifragelisticexpyalidocious\ni","\"i\" occurs at the following index(s): 8 15 18 26 30"},
							};


		int i = 0;
		
		
		try {
		
			for (; i < tests.length; i++) {
				
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0]);
				Lab02.problem4();
				
				assertTrue(inOut.getOutputStream().contains(tests[i][1]));
			
			}
			
			int count = 0;
			for (int j = 0; j < tests.length; j++) {
				if (inOut.getOutputStream().contains(tests[j][1])) {
					count++;
				}
			}
			if (count == tests.length) {
				throw new AssertionError("Cheated");
			}
			
			inOut.resetSystem();
			
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
		
		} catch (Error e) {
			inOut.resetSystem();
			
			System.out.println("Error " + problemNumber + ": "
				+ "\n   Failed test " + (i+1) + " of " + tests.length
				+ "\n   Input tested: " +  tests[i][0]
				+ "\n   Expected output: " + tests[i][1] 
				+ "\n   Your output: \n" + inOut.getOutputStream()
				+ "\n\n\n\n");
			fail();
		}
		
		
	}
	
	
	@Test
	@DisplayName("Test problem #5")
	void test5() {
		String problemNumber = "Problem #5";
		
		String[][] tests = {{"jeremy smith", "Jeremy Smith", "jeremY smitH", "jErEmY sMiTh"},
							{"fred savage", "Fred Savage", "freD savagE", "fReD sAvAgE"},
							{"Joe Montana", "Joe Montana", "joE montanA", "jOe MoNtAnA"},
							{"Elliott Jacobs", "Elliott Jacobs", "elliotT jacobS", "eLlIoTt JaCoBs"},
							{"John Doe", "John Doe", "johN doE", "jOhN dOe"},
							{"Stephanie Fredriksburgh", "Stephanie Fredriksburgh", "stephaniE fredriksburgH", "sTePhAnIe FrEdRiKsBuRgH"},
							};


		int i = 0;
		
		
		try {
		
			for (; i < tests.length; i++) {
				
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0]);
				Lab02.problem5();
				
				assertTrue(inOut.getOutputStream().contains(tests[i][1]));
				assertTrue(inOut.getOutputStream().contains(tests[i][2]));
				assertTrue(inOut.getOutputStream().contains(tests[i][3]));
			
			}
			
			int count = 0;
			for (int j = 0; j < tests.length; j++) {
				if (inOut.getOutputStream().contains(tests[j][1])) {
					count++;
				}
			}
			if (count == tests.length) {
				throw new AssertionError("Cheated");
			}
			
			inOut.resetSystem();
			
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
		
		} catch (Error e) {
			inOut.resetSystem();
			
			System.out.println("Error " + problemNumber + ": "
				+ "\n   Failed test " + (i+1) + " of " + tests.length
				+ "\n   Input tested: " +  tests[i][0]
				+ "\n   Expected output: " + tests[i][1] + "\n"+ tests[i][2] + "\n" + tests[i][3] 
				+ "\n   Your output: \n" + inOut.getOutputStream()
				+ "\n\n\n\n");
			fail();
		}
		
		
	}
	
	
	
	@Test
	@DisplayName("Test problem #6")
	void test6() {
		String problemNumber = "Problem #6";
		
		String[][] tests = {{"he didn't fall? Inconceivable!", 
								"hE dIdn't fAll? IncOncEIvAblE!"},
							{"there's only 1 man who would dare give me the raspberry...", 
								"thErE's OnlY 1 mAn whO wOUld dArE gIvE mE thE rAspbErrY..."},
							{"how many licks does it take to get to the tootsie roll center of a tootsie pop?", 
								"hOw mAnY lIcks dOEs It tAkE tO gEt tO thE tOOtsIE rOll cEntEr Of A tOOtsIE pOp?"},
							{"i'm not sure this final test is really necessary, but here it is nevertheless.", 
								"I'm nOt sUrE thIs fInAl tEst Is rEAllY nEcEssArY, bUt hErE It Is nEvErthElEss."},
							};


		int i = 0;
		
		
		try {
		
			for (; i < tests.length; i++) {
				
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0]);
				Lab02.problem6();
				
				assertTrue(inOut.getOutputStream().contains(tests[i][1]));
			
			}
			
			int count = 0;
			for (int j = 0; j < tests.length; j++) {
				if (inOut.getOutputStream().contains(tests[j][1])) {
					count++;
				}
			}
			if (count == tests.length) {
				throw new AssertionError("Cheated");
			}
			
			inOut.resetSystem();
			
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
		
		} catch (Error e) {
			inOut.resetSystem();
			
			System.out.println("Error " + problemNumber + ": "
				+ "\n   Failed test " + (i+1) + " of " + tests.length
				+ "\n   Input tested: " +  tests[i][0]
				+ "\n   Expected output: " + tests[i][1] 
				+ "\n   Your output: \n" + inOut.getOutputStream()
				+ "\n\n\n\n");
			fail();
		}
		
		
	}
	
	
	
}
