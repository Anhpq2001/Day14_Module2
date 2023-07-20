package InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] listElement = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        insertionSort(listElement);
        display(listElement);
    }
    public static void insertionSort(int[] list){
        int pos, x;
        for(int i = 1; i < list.length; i++){ //đoạn array[0] đã sắp xếp
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }
    }
    public static void display(int[] list){
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
