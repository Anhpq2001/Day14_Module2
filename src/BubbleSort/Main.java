package BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] listElement = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(listElement);
        display(listElement);
    }
    public static void bubbleSort(int[] list){
        for(int i = 0; i < list.length; i++){
            for(int j = list.length - 1; j > i; j--){
                if(list[j] < list[j-1]){
                    int tmp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tmp;
                }
            }
        }
    }
    public static void display(int[] list){
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
