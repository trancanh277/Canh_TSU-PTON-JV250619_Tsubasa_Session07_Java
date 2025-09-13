package baitap04;

public class Student {
    private String name;
    private int age;
    private String classNmae;
    private double avgScore;

    public Student(String name, int age, String classNmae, double avgScore) {
        this.name = name;
        this.age = age;
        this.classNmae = classNmae;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public double getAvgScore() {
        return avgScore;
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Tuổi: " + age +
                ", Lớp: " + classNmae  +
                ", Điểm trung bình " + avgScore ;
    }
}
