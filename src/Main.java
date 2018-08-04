import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int choice;
        do{
            System.out.println("------------------");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In tam giác vuông");
            System.out.println("3. In tam giác cân");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
//            if(choice != 1 || choice !=2 || choice != 3 || choice !=0){
//                System.out.println("Nhập sai.. Vui lòng nhập lại");
//            }
            if(choice ==1){
                System.out.println("Nhập chiều rộng");
                int width = scanner.nextInt();
                System.out.println("Nhập chiều dài");
                int height = scanner.nextInt();
                for(int widthIndex = 0; widthIndex< width; widthIndex++){
                    for (int heightIndex = 0; heightIndex < height; heightIndex++) {
                        System.out.printf("*");
                    }
                    System.out.println();
                }
            }else if(choice==2){
                System.out.println("Nhập cạnh: ");
                int canh = scanner.nextInt();
               // int height = scanner.nextInt();
                for(int widthIndex = 0; widthIndex< canh; widthIndex++){
                    for (int heightIndex = 0; heightIndex < widthIndex; heightIndex++) {
                        System.out.printf("*");

                    }
                    System.out.println();
                }
            }
            else if(choice ==3){
                System.out.println("Nhập cạnh:");
                int canh = scanner.nextInt();
                //int canh2 =1;
                for (int canhIndex = 0; canhIndex < canh; canhIndex++) {
                    for(int canh1 =canh;canhIndex< canh1;canh1--){
                        System.out.printf("*");
                    }
                    System.out.println();
                }
            }
            else if(choice==0){
                System.exit(0);
            }
        }while (choice != 1 || choice !=2 || choice != 3 || choice !=0);
    }
}
