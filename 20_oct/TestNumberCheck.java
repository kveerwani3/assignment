package 20_Oct;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Answer;

import Assignment_20_October.MobileCheck;
import Assignment_20_October.NumberCheck;

class TestNumberCheck {

	Answer<Boolean> answer = (invocation)->{
		Object[] args = invocation.getArguments();
		String contact = (String)args[0];
		Pattern compile = Pattern.compile("[6-9][0-9]{9}");
		Matcher matcher = compile.matcher(contact);
		if(matcher.find()) {
			return true;
		}
		return false;
	};

	@Mock
	private MobileCheck checkMobile;
	
	@InjectMocks
	private NumberCheck numberCheck;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@DisplayName("Test 01 : Check if mobile number entered is of 10 digits and must start with 6-9")
	@Test
	void testMobileNumberCheck_Positive() 
	{
		String contactNumber="8888633929";
		when(checkMobile.checkMobileNumber(contactNumber)).then(answer);
		boolean actual = numberCheck.check(contactNumber);
		assertTrue(actual);
		
	}
	
	@DisplayName("Test 02 : Check if mobile number entered is of 10 digits")
	@Test
	void testMobileNumberCheck_Negative1() 
	{
		String contactNumber="8888633929";
		when(checkMobile.checkMobileNumber(contactNumber)).then(answer);
		boolean actual = numberCheck.check(contactNumber);
		assertTrue(!actual);
	}

	@DisplayName("Test 03 : Check if mobile number is starting with with 6-9")
	@Test
	void testMobileNumberCheck_Negative2() 
	{
		String contactNumber="2337476542";
		when(checkMobile.checkMobileNumber(contactNumber)).then(answer);
		boolean actual = numberCheck.check(contactNumber);
		assertTrue(!actual);
	}
	
	@DisplayName("Test 04 : Check if mobile number contains a character or special charater the an exception needs to be thrown")
	@Test
	void testMobileNumberCheck_Exception() 
	{
		try {
			String contactNumber="pk88886339";
			when(checkMobile.checkMobileNumber(contactNumber))
			.thenThrow(new Exception("Invalid input : Special Character not allowed"));
			numberCheck.check(contactNumber);
			assertTrue(false);
		}
		catch(Exception e) {
			assertTrue(true);
		}
	}

}