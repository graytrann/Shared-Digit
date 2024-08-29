//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println(isPalindrome(121));
        System.out.println(hasSharedDigit(12, 13));

    }


    public static boolean hasSharedDigit(int firstNum, int secondNum) {
        // Kiểm tra xem cả hai số có phải là số hai chữ số hay không
        if (firstNum < 10 || firstNum > 99 || secondNum < 10 || secondNum > 99) {
            return false;
        }

//        // Vòng lặp ngoài để trích xuất từng chữ số của số thứ nhất
//        while (firstNum > 0) {
//            int firstNumDigit = firstNum % 10;  // Lấy chữ số cuối cùng của số thứ nhất
//            int tempSecondNum = secondNum;  // Đặt lại giá trị của số thứ hai cho mỗi chữ số của số thứ nhất
//
//            // Vòng lặp trong để trích xuất từng chữ số của số thứ hai
//            while (tempSecondNum > 0) {
//                int secondNumDigit = tempSecondNum % 10;  // Lấy chữ số cuối cùng của số thứ hai
//
//                // So sánh các chữ số
//                if (firstNumDigit == secondNumDigit) {
//                    return true;  // Nếu tìm thấy chữ số trùng nhau, trả về true
//                }
//
//                tempSecondNum /= 10;  // Bỏ chữ số cuối cùng của số thứ hai
//            }
//
//            firstNum /= 10;  // Bỏ chữ số cuối cùng của số thứ nhất
//        }

        // Vòng lặp ngoài để trích xuất từng chữ số của số thứ nhất
        for (; firstNum > 0; firstNum /= 10) {
            int firstNumDigit = firstNum % 10;  // Lấy chữ số cuối cùng của số thứ nhất

            // Vòng lặp trong để trích xuất từng chữ số của số thứ hai
            for (int tempSecondNum = secondNum; tempSecondNum > 0; tempSecondNum /= 10) {
                int secondNumDigit = tempSecondNum % 10;  // Lấy chữ số cuối cùng của số thứ hai

                // So sánh các chữ số
                if (firstNumDigit == secondNumDigit) {
                    return true;  // Nếu tìm thấy chữ số trùng nhau, trả về true
                }
            }
        }

        // Nếu không tìm thấy chữ số trùng nhau, trả về false
        return false;
    }

}