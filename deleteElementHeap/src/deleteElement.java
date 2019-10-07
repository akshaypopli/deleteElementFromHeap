import java.util.ArrayList;

public class deleteElement {
    public static ArrayList<Integer> deleteElement(ArrayList<Integer> heap){

        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int i = 1;
        while(i != heap.size() && 2*i< heap.size()){
            if(heap.get(i-1) < heap.get(2*i-1)  || heap.get(i-1) < heap.get(2*i) && ((2*i-1)<heap.size() || (2*i)<heap.size())){
                if(heap.get(2*i-1) > heap.get(2*i)){
                    int temp = heap.get(2*i-1);

                    heap.set(2*i-1, heap.get(i-1));
                    heap.set(i-1, temp);
                }else {
                    int temp = heap.get(2*i);

                    heap.set(2*i, heap.get(i-1));
                    heap.set(i-1, temp);
                }
            }

            i = 2*i;
        }

        return heap;
    }

    public static void main(String[] args) {
        // write your code here

        ArrayList<Integer> heap = new ArrayList<>();
        heap.add(70); //1
        heap.add(65); //2
        heap.add(55); //3
        heap.add(50); //4
        heap.add(27); //5
        heap.add(26); //6
        heap.add(42); //7
        heap.add(35); //8
        heap.add(12); //9
        heap.add(19); //10
//
//        heap.add(10);
//        heap.add(9);
//        heap.add(8);
//        heap.add(7);
//        heap.add(6);
//        heap.add(5);

        deleteElement(heap);
        for(int number: heap){
            System.out.print(number + ", ");
        }
//        System.out.println("\n");
//        deleteElement(heap);
//        for(int number: heap){
//            System.out.print(number + ", ");
//        }
//

    }
}
