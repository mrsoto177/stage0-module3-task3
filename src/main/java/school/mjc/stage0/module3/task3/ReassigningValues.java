package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
    	 int first = 1;
         int second = 10;
         int third = 100;
         
         System.out.println(first + "\n" + second + "\n" + third);
         
        int linkToFirst = first = 15;
        int linkToSecond = second = 6;
        int linkToThird  = third = 4;
        
        System.out.println(linkToFirst + "\n" + linkToSecond + "\n" + linkToThird);
        
    }
}
