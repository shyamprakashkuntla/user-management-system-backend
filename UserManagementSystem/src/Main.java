import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        UserController uc= new UserController();

//        uc.create();
//
//        uc.displayUser();


        Scanner sc=new Scanner(System.in);
//        int choice;

        int status;

        do
        {

        System.out.println("choose an option");
        System.out.println("1. create new user");
        System.out.println("2. view all users");
        System.out.println("3. delete an user");
        System.out.println("4.search by salary");
            System.out.println("5.update the user");

        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
            {
                uc.create();
                break;
            }
            case 2:
            {
                uc.displayUser();
                break;
            }
            case 3:
            {
                System.out.println("choose the id you want to delete");
                int id=sc.nextInt();
                uc.deleteUser(id);
                break;
            }
            case 4:
            {
                uc.searchBySalary();
            }
            case 5:
            {
                System.out.println("enter the user you want to update");
                int id=sc.nextInt();
                uc.updateUser(id);
                break;
            }
            default:
            {
                System.out.println("select a proper option");
            }
        }
        System.out.println("do you want to continue 1-yes 0-no");
        status=sc.nextInt();
        }
//        while(status!=0);
        while(status==1);

    }
}