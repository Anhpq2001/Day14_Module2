package SelectionSort;

public class Main {
    public static void main(String[] args) {
        double[] listElement = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(listElement);
        display(listElement);
    }
    public static void selectionSort(double[] list){
        int min;
        for(int i = 0; i < list.length; i++){
            min = i;
            for(int j = i + 1; j < list.length; j++){
                if(list[j] < list[min]){
                    double tmp = list[min];
                    list[min] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }
    public static void display(double[] list){
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
