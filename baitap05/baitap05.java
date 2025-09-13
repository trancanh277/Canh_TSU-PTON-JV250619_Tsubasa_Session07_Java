package baitap05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baitap05 {
    private static List<Product> productList= new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1: Thêm mới sản phẩm");
            System.out.println("2: Hiển thị danh sách sản phẩm");
            System.out.println("3: Cập nhật sản phẩm");
            System.out.println("4: Xóa sản phẩm");
            System.out.println("5: Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Nhập ID sản phẩm: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    productList.add(new Product(id, name, price));
                    System.out.println("Sản phẩm đã được thêm.");
                    break;
                case 2:
                    if(productList.isEmpty()){
                        System.out.println("Danh sách sản phẩm trống !");
                        break;
                    }
                    System.out.println("Danh sách sản phẩm:");
                    for (Product product : productList){
                        System.out.println("ID: " + product.getId() + ", Tên: " + product.getName() + ", Giá: " + product.getPrice());
                    }
                    break;
                case 3:
                    System.out.print("Nhập ID sản phẩm cần cập nhật: ");
                    String update = scanner.nextLine();
                    boolean  found = false;
                    for( Product product : productList){
                        if(product.getId().equals(update)){
                            System.out.print("Nhập tên mới: ");
                            product.setName(scanner.nextLine());
                            System.out.print("Nhập giá mới: ");
                            product.setPrice(scanner.nextDouble());
                            found = true;
                            System.out.println("Sản phẩm đã được cập nhật.");
                            break;
                        }
                        if(!found){
                            System.out.println("Sản phẩm không tồn tại.");
                        }

                    }
                    break;
                case 4:
                    System.out.print("Nhập ID sản phẩm cần xóa: ");
                    String delete = scanner.nextLine();
                    found = false;
                    for(int i = 0; i < productList.size(); i++){
                        if(productList.get(i).getId().equals(delete)){
                            productList.remove(i);
                            found = true;
                            System.out.println("Sản phẩm đã được xóa.");
                            break;
                        }
                        if (!found){
                            System.out.println("Sản phẩm không tồn tại.");
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
        while (true);

    }
}
