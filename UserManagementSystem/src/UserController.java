
import java.util.Scanner;



public class UserController {


    Scanner sc=new Scanner(System.in);

    User[] users=new User[10];

    int index=0;

    public void create()
    {

        System.out.println("enter id, name,age, salary,city and department res");
        int id=sc.nextInt();
        String name=sc.next();
        int age=sc.nextInt();
        float salary=sc.nextFloat();
        String city=sc.next();
        String department= sc.next();



//    User u= new User (name,age,salary,city,department);
//
//    users[0]=u;
//
//    users[index]=u;

        users[index]=new User(id,name,age,salary,city,department);

        index++;


    }

    public void displayUser()
    {
        for(int i=0;i<index;i++)
        {
//            users[i].show();
//            System.out.println(users[i]);
            System.out.println(users[i].toString());

        }

    }

    public void deleteUser(int id)
    {
        for(int i=0;i<index;i++)
        {
//            if(users[i].id==id)
//            {
//
//            }

//            int oid=users[i].getId();
//            System.out.println(oid);

            if(users[i].getId()==id)
            {
                users[i]=null;
                System.out.println("user deleted");
                break;
            }


        }
    }



    public void searchBySalary()
    {
        System.out.println("enter salary");
        float salary=sc.nextFloat();

        for(int i=0;i<index;i++)
        {
            if(users[i].getSalary()==salary)
            {
                System.out.println(users[i]);
            }
        }
    }

//    public void searchBySalary()
//    {
//        System.out.println("enter salary min and max");
//        float minsalary=sc.nextFloat();
//        float maxsalary=sc.nextFloat();
//
//        for(int i=0;i<index;i++)
//        {
//            if(users[i].getSalary()>minsalary && users[i].getSalary()<maxsalary)
//            {
//                System.out.println(users[i]);
//            }
//        }
//    }

    public void updateUser(int id)
    {
            for(int i=0;i<index;i++)
            {

                if(users[i].getId()==id)
                {
                    System.out.println("choose the name that u want to change");
                    System.out.println("1.name");
                    System.out.println("2.age");
                    System.out.println("3.salry");
                    System.out.println("4.city");
                    System.out.println("5.dprt");
                    int choice = sc.nextInt();

                    switch(choice) {
                        case 1: {
                            System.out.println("enter the new name");
                            String newname = sc.next();
                            users[i].setName(newname);
                            break;
                        }

                        case 2: {
                            System.out.println("enter the new age");
                            int settAge = sc.nextInt();
                            users[i].setAge(settAge);
                            System.out.println("name updated sucessfully");
                            break;
                        }

                        case 3: {
                            System.out.println("enter the new salary");
                            float newsal = sc.nextFloat();
                            users[i].setSalary(newsal);
                            break;
                        }

                        case 4: {
                            System.out.println("enter the new city");
                            String newname = sc.next();
                            users[i].setCity(newname);
                            break;
                        }

                        case 5: {
                            System.out.println("enter the new department");
                            String newname = sc.next();
                            users[i].setDepartment(newname);
                            break;
                        }
                        default:
                        {
                            System.out.println("select a proper option");
                        }
                    }
                    break;
                }
            }
    }
























}
//write a program to search a number in a array of numbers if that number is
// present in that array print found otherwise not found.


//write a program to loop through array and print all the numbers which are on odd indexes

//write a program to have array of products name,price and cateogery,
//loop through the array and only print product names