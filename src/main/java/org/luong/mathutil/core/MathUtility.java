package org.luong.mathutil.core;

//class này clone lịa clas huyền thoại java.util.Math
public class MathUtility {

    public static final double PI = 3.1415;
    //class này chứa hàm static, chấm xài ngay
    //tính n giai thua n! = 1.2.3...n
    //quy ước thiết kế hàm này như sau
    //0! = 1! = 1
    //không có giai thừa số âm. Nếu đưa số âm CHỬI
    //giai thừa tăng nhanh, 20! vừa khớp full kiểu long
    //do đó 21!   ko dùng kiểu long đc. Nếu đưa > 21, CHỬI
    //CHỬI: ko trả về giá trị gì cả mà NÉM RA NGOẠI LỆ EXCEPTION

//    public static long getFactorial(int n) {
//        long factorial = 1;
//
//        if (n == 0 || n == 1) {
//            return 1;
//        } else if (n >= 2 && n <= 20) {
//            for (int i = 2; i <= n; i++) {
//                factorial = factorial * i;
//            }
//        } else {
//            throw new IllegalArgumentException("Invalid n . n must be between 0..20 pls");
//        }
//
//        return factorial;
//    }
    
    public static long getFactorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } 
        else if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n . n must be between 0..20 pls");
        } 

        return n * getFactorial(n - 1);
    }
    //5! = 1.2.3.4.5 = 4!.5 
    //4! = 4.3!
    //3! = 3.2!
    //2! = 2.1!
    //1! = 1 DỪNG LẠI HỒI NGƯỢC LÊN
    
    //N! = N * (N-1)!
    
    //TDD: Test Driven Development phát triển p/m theo phong cách
    //code dến đâu kiểm thử đến đó, viết code và viết code và viết test case/test run
    //diễn ra song song, đan xen

    //cứ có hàm là có test case
//viết ra các test case đủ bao quát các tình huống xài hàm
// test case: là bộ dữ liệu dùng để đưa vào app/hàm để mô phỏng lại 
// 1 tình huống xài app/hàm. Nó có input data, giải thích cách dùng hàm/app
// và có giá trị trả ề expected
// lát hồi run(test run/ test execution) để luận đúng sai
//DÂN DEV GIỐNG DÂN QC Ở CHỖ NÀY
// ĐỀU PHẢI VIẾT/TẠO RA TEST CASE, ĐỀU PHẢI TIẾN HÀNH RUN/CHẠY TEST
// VÀ ĐỀU PHẢI ĐỌC KẾT QUẢ ĐÚNG SAI
//DEV KHÁC TESTER LÀ PHẢI VIẾT CODE LÀM APP!!!
// Test case k viết tự do mà viết theo  template
//    viết tự do: 0! = 1; 1! = 1; .....5! = 120
//    viết chuẩn lại test case (xuất hiện trong dề thi PE, Khóa luận T/N VÀ
//    ĐI LÀM
// test case #1: (mục tiêu test) check getF() wtih n = 0
// Steps-Procedures ( cách tiến hành test) - input/output
//      1.Given n = 0 
//      2.Call the getF() (getF(0))
//Expected results: (kqua kì vọng)
//                  getF(1) must return 1
// test case #2: (mục tiêu test) check getF() wtih n = 0
// Steps-Procedures ( cách tiến hành test) - input/output
//      1.Given n = 1 
//      2.Call the getF() (getF(1))
//Expected results: (kqua kì vọng)
//                  getF(1) must return 1
}
