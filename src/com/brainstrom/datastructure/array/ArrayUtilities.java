package com.brainstrom.datastructure.array;

import com.brainstrom.data.Student;

public class ArrayUtilities {
    public void objectArray(String name1, String name2, String name3){
    Student[] studentArray = new Student[]{new Student("pushpendra"), new Student("nandita"), new Student("akshatam")};
   for (Student stu : studentArray){
       System.out.println(stu.getName());
   }

        System.out.println("############################################");
//   Another way of declaring the array and access
        Student[] students = new Student[3];
        students[0] = new Student(name1);
        students[1] = new Student(name2);
        students[2] = new Student(name3);


        for (Student stu : students){
            System.out.println(stu.getName());
        }
    }

//    2, 7, 9
//    3, 6, 1
//    7, 4, 2
    public void access2DArray(){
    int[][] dArray =  new int[][] {{2, 7, 9, 5, 8},{3, 6, 1, 4, 2},{7, 4, 2, 5, 9}};

//    Printing 2D Array
        for (int i = 0; i < dArray.length; i++){
            for (int j = 0; j < dArray[i].length; j++){
                System.out.print(dArray[i][j] + " ");
            }
            System.out.println();
        }

    }

//    Setting the value dynamically and accessing with foreach
    public void setValueFor2DArray(){
        int row = 6;
        int column = 6;
        int[][] int2DArray = new int[row][column];
        int value = 1;
        for (int i=0; i < int2DArray.length; i++){
            for (int j=0; j < int2DArray[i].length; j++){
                int2DArray[i][j] = value+j;
                value=value+j;
            }
        }
        for (int[] intRow : int2DArray){
            for (int intColumn : intRow){
                System.out.print(intColumn + " ");
            }
            System.out.println();
        }
    }



}
