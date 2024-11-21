package com.brainstrom.mathsproblem;

import java.util.*;

public class MathsUtillities {
    public static void main(String[] args) {
        MathsUtillities mathsUtillities = new MathsUtillities();
        for(Object obj : mathsUtillities.findPrimeNumber()){
            if(obj instanceof Integer num){
                System.out.println(num);
            }
        }

        System.out.println(mathsUtillities.findPrimeNumber());
    }

    public void isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
       // sb.reverse();
//        String rev=sb.toString();
        String rev = reverseString(str);
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    public boolean canFormPalindrom(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(Character ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int oddCount = 0 ;
        for(int count : map.values()){
            if(count % 2 != 0){
                oddCount++;
            }
        }
        if(oddCount > 1){
            return false;
        }
        return true;
    }

    public void SortAsc() {
        //Initialize array
        int [] arr = new int [] {5, 2, 8, 7, 1};
        int temp = 0;
        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void CheckEvenOdd()
    {
        int num;
        System.out.println("Enter an Integer number:");

        //The input provided by user is stored in num
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        /* If number is divisible by 2 then it's an even number
         * else odd number*/
        if ( num % 2 == 0 )
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
    }

    public void FibonacciExample1()
    {
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1
        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

    public void factorial(){
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }

    public void swap()
    {
        System.out.println("Enter the value of x and y");
        Scanner sc = new Scanner(System.in);
        /*Define variables*/
        System.out.println("input for x: ");
        int x = sc.nextInt();
        System.out.println("input for y: ");
        int y = sc.nextInt();
        int total = 0;
        System.out.println("before swapping numbers: "+x +" "+ y);
        /*Swapping One Way*/
        total = x+y;
        y = total - y;
        x = total - x;
        System.out.println("After swapping: "+x +"  " + y);
        /*Swapping Other Way*/
//        int temp = x;
//        x=y;
//        y=temp;
//        System.out.println("After swapping: "+x +"  " + y);
    }

    public String reverseString(String str){
        char ch;
        String reverseString = "";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            ch = charArray[i];

            reverseString = ch + reverseString;
        }
        return reverseString;
    }
    public boolean isPrimeNumber(){
        int input = 23;
        int m = input/2;
        int flag = 0;
        if(input == 0 || input == 1){
            return false;
        }
        for(int i=2; i <= m; i++){
            if(input % i == 0){
                flag = 1;
                return false;
            }
        }
        if(flag == 0){
            return  true;
        }
        return false;
    }

    public Object[] findPrimeNumber(){
        int number = 20;
        int MAX_SIZE = 100;
        int flag = 0;
        List<Integer> primeNumbers = new ArrayList();
        for(int count=1; count < MAX_SIZE;count++){
            for(int i=1; i < count;i++){
                if(count > 1 && count % i == 0){
                    flag++;
                }
            }
            if(flag == 0){
                primeNumbers.add(count);
            }

        }
        Object[] intArray = new Object[primeNumbers.size()];
        return primeNumbers.toArray(intArray);
    }
}
