/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.luong.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.luong.mathutil.core.MathUtility.getFactorial;

/**
 *
 * @author PC
 */
public class MathUntilityAdvancedTest {
    
    public static Object[][] initTestData(){
        Object testData[][] = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {3, 6}, 
                               {5, 1200}};
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentReturnWell(int n, long expected){
        
//        assertEquals(69, 69);
        assertEquals(expected, getFactorial(n));

    }
}
//TDD: TESTDRIVEN DEVELOPMENT LÀ KỸ THUẬT LẬP TRÌNH MÀ GẮN VỚI VIỆC VIẾT CÁC TEST CASE
// ĐỂ KIỂM THỬ NGAY NHỮNG HÀM DEV MÌNH VỪA VIẾT
//VIẾT CODE CHÍNH LÀ VIẾT CODE TEST(JUNIT, UNIT TEST) XEN KẼ VỚI NHAU
//2 MÀU XANH ĐỎ LIÊN TỤC DIỄN RA

//DTT: SỰ MỞ RỘNG THÊM CHO QUÁ TRÌNH VIWWTS CODE TEST(JUNIT)
//DATA DRIVEN TESTING 
//KĨ THUẬT TÁCH BỘ TEST DATA RA 1 CHỖ RIÊNG, TÁCH VÀO MẢNG TÁCH VÀO FILE EXCEL
//HAY TABLE; SAU ĐÓ NHỒI/FILL/MAP CÁI DATA TỪ MẢNG VÀO TRONG HÀM SO SÁNH ASSERTEQUALS()
//GIÚP CODE DỄ ĐỌC HƠN, DỄ KIỂM TRA XEM CÓ THIẾU TEST CASE NÀO HAY KHÔNG
