package baitap04;

import java.util.Scanner;

public class baitap04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student [] arrStudent = new Student[4];

        arrStudent[0] = new Student("Trang",18,"A1",9);
        arrStudent[1] = new Student("Khanh", 22,"B1", 5);
        arrStudent[2] = new Student("Hoa", 17,"A1",9.5);
        arrStudent[3] = new Student("Mai",17,"a2",9);

        System.out.print("Nhập điểm min: ");
        double min = scanner.nextDouble();
        System.out.print("Nhập điểm max: ");
        double max = scanner.nextDouble();

        System.out.println("Danh sách học sinh có điểm trung bình từ " + min + " đến " + max);
        for (Student student : arrStudent){
            if(student.getAvgScore() >= min && student.getAvgScore() <= max){
                System.out.println(student);
            }
        }
    }
}
