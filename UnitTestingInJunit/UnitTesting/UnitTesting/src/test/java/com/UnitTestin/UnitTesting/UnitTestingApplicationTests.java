package com.UnitTestin.UnitTesting;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import  static  org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class UnitTestingApplicationTests {

	private  Calculator c=new Calculator();
	@Test
	void contextLoads() {
	}
	@Test
	@Disabled
	void testSum(){
		int expectedresult=12;

		int actualResult= c.doSum(3,4,5);
		assertThat(actualResult).isEqualTo(expectedresult);
	}

	@Test
	void testProduct(){
		int expectedProduct=6;
		int actualProduct=c.doProduct(2,3);
		assertThat(actualProduct).isEqualTo(expectedProduct);
	}

	@Test
	void testCompereNums(){
		boolean actualResult=c.compareToNums(3,3);
		assertThat(actualResult).isTrue();
	}
}
