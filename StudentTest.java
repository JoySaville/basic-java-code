package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("----------欢迎来到现代学生管理系统------------");
            System.out.println("1,添加学生");
            System.out.println("2,删除学生");
            System.out.println("3,修改学生");
            System.out.println("4,查看全部学生");
            System.out.println("5,退出");
            System.out.println("请输入您的选择");
            String choose = sc.next();
            switch (choose) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    selectStudent(list);
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("输入错误,没有这个选项");
                    break;
            }
        }
    }

//    添加学生
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生id");
            String id = sc.next();
            while (true) {
                if (contains(id,list)) {
                    System.out.println("输入的ID重复,请重新输入ID");
                    id = sc.next();
                } else {
                    break;
                }
            }
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生家庭住址");
            String address = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();
            Student s = new Student(id,name,address,age);
            list.add(s);
            System.out.println("录入成功");
    }
//    删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要删除学生的学号");
        String id = sc.next();
        int index = getIndex(id,list);
        if (index ==-1) {
            System.out.println("id不存在,删除失败");
            return;
        }
        list.remove(index);
        System.out.println("id为"+id+"的学生删除成功");
    }
//    修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (true) {
            System.out.println("输入需要修改学生的学号");
            String id = sc.next();
            index = getIndex(id, list);
            if (index == -1) {
                System.out.println("此id不存在,请重新输入学号");
            }else {
                break;
            }
        }
        Student student = list.get(index);
        System.out.println("输入要修改的学生姓名");
        String name = sc.next();
        student.setName(name);
        System.out.println("输入要修改的学生年龄");
        int age = sc.nextInt();
        student.setAge(age);
        System.out.println("输入要修改的学生家庭住址");
        String address = sc.next();
        student.setAddress(address);
        System.out.println("修改成功");
    }
//    显示学生信息
    public static void selectStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后在查询");
            return;
        }
//        打印表头信息
        System.out.println("id\t姓名\t\t年龄\t\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getId()+"\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getAddress());
        }
    }
//    判断id是否已经存在
    public static boolean contains(String id,ArrayList<Student> list) {
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            flag = false;
            if (id.equals(list.get(i).getId())) {
                flag = true;
                break;
            }
        }
        return flag;
    }
//    通过id获取集合索引
    public static int getIndex(String id,ArrayList<Student> list) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                index = i;
                break;
            }
        }
        return index;
    }
}
