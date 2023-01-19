package tests_DO_NOT_EDIT;

import org.junit.jupiter.api.*;
import labs.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class Test_Lab01 {

	public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
		String problemNumber = "Problem #1";
		
		String[][] tests = {{"happy", "There are 5 letters in happy."},
						    {"pineapple", "There are 9 letters in pineapple."},
						    {"George", "There are 6 letters in George."},
						    {"finance", "There are 7 letters in finance."},
						    {"I", "There are 1 letters in I."},
						    {"fred", "There are 4 letters in fred."}
						    };	
		
		
		int i = 0;
		String output = "";
		
		try {
			
			
			for (; i < tests.length; i ++) {
				
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(String.valueOf(tests[i][0]));
				Lab01.problem1();
				
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

		}
		catch (AssertionError e) {
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
	@DisplayName("Test Problem #2")
	void test2() {
		String problemNumber = "Problem #2";
		
		
		String[][] tests = {{"yellow submarine", "The longer word is submarine."},
							{"green blue", "The longer word is green."},
							{"grant blink", "Words are the same length"},
							{"reciepts phone", "The longer word is reciepts."},
							{"volleyball basketball", "Words are the same length"},
							{"tall short", "The longer word is short."},
							};


		int i = 0;
		String output = "";
		
		try {
		
		
		for (; i < tests.length; i ++) {
			
			inOut.resetOutputStream();
			inOut.overridePrintStatements();
			inOut.provideInput(String.valueOf(tests[i][0]));
			Lab01.problem2();
			
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
		
		}
		catch (AssertionError e) {
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
		
		

		String[][] tests = {{"The fox is red", "he fox is red\nThe fox is re\nhe fox is re"},
							{"George of the Jungle", "eorge of the Jungle\nGeorge of the Jungl\neorge of the Jungl"},
							{"Mr. Hufford", "r. Hufford\nMr. Huffor\nr. Huffor"},
							{"Blueberry Rainbow Suprise", "lueberry Rainbow Suprise\nBlueberry Rainbow Supris\nlueberry Rainbow Supris"},
							{"I hope this one works", " hope this one works\nI hope this one work\n hope this one work"},
						    };	


		int i = 0;
		String output = "";
		
		try {
		
		
		for (; i < tests.length; i ++) {
			
			inOut.resetOutputStream();
			inOut.overridePrintStatements();
			inOut.provideInput(String.valueOf(tests[i][0]));
			Lab01.problem3();
			
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
		
		}
		catch (AssertionError e) {
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
		

		String[][] tests = {{"palindromes", "The middle three characters are \"ndr\"."},
							{"yellows", "The middle three characters are \"llo\"."},
							{"supercalifragelisti", "The middle three characters are \"ifr\"."},
							{"silly", "The middle three characters are \"ill\"."},
							{"I", "The middle three characters are \"I\"."},
							{"holymoly", "The middle three characters are \"ymo\"."},
						    };	


		int i = 0;
		String output = "";
		
		try {
		
		
		for (; i < tests.length; i ++) {
			
			inOut.resetOutputStream();
			inOut.overridePrintStatements();
			inOut.provideInput(String.valueOf(tests[i][0]));
			Lab01.problem4();
			
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
		
		}
		catch (AssertionError e) {
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
	void test5() {
		
		String problemNumber = "Problem #5";
		

		String[][] tests = {{"mamma", "The first and last two letters are the same."},
							{"mammas", "The first and last two letters are not the same."},
							{"rdklsjdfrd", "The first and last two letters are the same."},
							{"jeremy", "The first and last two letters are not the same."},
							{"one", "The first and last two letters are not the same."},
						    };	


		int i = 0;
		String output = "";
		
		try {
		
		
		for (; i < tests.length; i ++) {
			
			inOut.resetOutputStream();
			inOut.overridePrintStatements();
			inOut.provideInput(String.valueOf(tests[i][0]));
			Lab01.problem5();
			
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
		
		}
		catch (AssertionError e) {
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
