package TestNormalBoundaryValue;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import sqa.main.Ranking;

class TestNormalBoundaryValue {
	
	Ranking ranking = new Ranking();

	
	@Test
	@DisplayName("TC01 Expected result = Standard,purchaseTotal = 0(min),frequency = 15(nom) ,pointCollected = 500(nom)")
	void test_01() {
		String result = ranking.CalculateMembershipRank(0, 15, 500);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("TC02 Expected result = Standard,purchaseTotal = 1(min+),frequency = 15(nom) ,pointCollected = 500(nom)")
	void test_02() {
		String result = ranking.CalculateMembershipRank(1, 15,500);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("TC03 Expected result = Gold,purchaseTotal = 50000(nom),frequency = 15(nom) ,pointCollected = 500(nom)")
	void test_03() {
		String result = ranking.CalculateMembershipRank(50000, 15,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC04 Expected result = Gold,purchaseTotal = 99999(max-),frequency = 15(nom) ,pointCollected = 500(nom)")
	void test_04() {
		String result = ranking.CalculateMembershipRank(99999, 15,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC05 Expected result = Gold,purchaseTotal = 10000(max),frequency = 15(nom) ,pointCollected = 500(nom)")
	void test_05() {
		String result = ranking.CalculateMembershipRank(10000, 15,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC06 Expected result = silver,purchaseTotal = 50000(nom),frequency = 0(min) ,pointCollected = 500(nom)")
	void test_06() {
		String result = ranking.CalculateMembershipRank(50000, 0,500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("TC07 Expected result = silver,purchaseTotal = 50000(nom),frequency = 1(min+) ,pointCollected = 500(nom)")
	void test_07() {
		String result = ranking.CalculateMembershipRank(50000, 1,500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("TC08 Expected result = Gold,purchaseTotal = 50000(nom),frequency = 30(max-) ,pointCollected = 500(nom)")
	void test_08() {
		String result = ranking.CalculateMembershipRank(50000, 30,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC09 Expected result = Gold,purchaseTotal = 50000(nom),frequency = 31(max) ,pointCollected = 500(nom)")
	void test_09() {
		String result = ranking.CalculateMembershipRank(50000, 31,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC10 Expected result = Standard,purchaseTotal = 50000(nom),frequency = 15(nom) ,pointCollected = 0(min)")
	void test_10() {
		String result = ranking.CalculateMembershipRank(50000, 15,0);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("TC11 Expected result = Standard,purchaseTotal = 50000(nom),frequency = 15(nom) ,pointCollected = 1(min+)")
	void test_11() {
		String result = ranking.CalculateMembershipRank(50000, 15,1);
		assertEquals("Standard", result);
	}
	
	@Test
	@DisplayName("TC12 Expected result = Gold,purchaseTotal = 50000(nom),frequency = 15(nom) ,pointCollected = 999(max-)")
	void test_12() {
		String result = ranking.CalculateMembershipRank(50000, 15,999);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC13 Expected result = Gold,purchaseTotal = 50000(nom),frequency = 15(nom) ,pointCollected = 1000(max)")
	void test_13() {
		String result = ranking.CalculateMembershipRank(50000, 15,1000);
		assertEquals("Gold", result);
	}

}
