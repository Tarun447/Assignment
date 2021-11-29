package com.cap.org.TestAssignment_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class AppTest 
{
	/* TestAssignmentt t1;
    @BeforeEach
     void init()
      {
   t1=new TestAssignmentt();
      } */


@Test
/* @RepeatedTest(20)*/

void testFindMin() {
 App m = new App();
 int[] array = {10, 2, 3, 10, 1, 0, 2, 3, 16, 0, 2};
 assertEquals(0, m.findMin(array));

}

void testFindMax() {
 App m1 = new App();
 int[] array = {10, 2, 3, 10, 1, 0, 2, 3, 16, 0, 2};
 assertEquals(10, m1.findMax(array));

}
}
