/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.luong.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.luong.mathutil.core.MathUtility.*;

/**
 *
 * @author PC
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        
//        assertEquals(69, 69);
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
    }
    
}
//DDT À MỘT PHẦN MỞ RỘNG CỦA CÁ UNIT TEST FRAMEWORK DATA DRIVEN TESTING
//KHÔNG NHẦM VỚI TDD: TEST DRIVEN DEVELOPMENT
//                  VIẾT CODE VÀ VIẾT TEST CASE SONG HÀNH
//                  VỚI NHAU, ĐÃ HỌC XONG

//NHƯNG CODE TEST BỐC MÙI