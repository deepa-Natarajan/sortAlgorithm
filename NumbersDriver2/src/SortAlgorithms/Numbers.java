package SortAlgorithms;

public class Numbers {

    private int[] numArray;
    private int nElem;

    //constructor
    Numbers(int max) {
        numArray = new int[max];
        nElem = 0;
    }

    public void display() {
        for (int i = 0;i < nElem; i++) {
            System.out.print(numArray[i] + " ");
        }
        System.out.println("");
    }

    public void setValue(int index, int value) {

        try {
            numArray[index] = value;
            nElem++;
        } catch (ArrayIndexOutOfBoundsException x) {
            System.out.println(x);

        }

    }

    public void bubbleSort() {

        int in, out;
        for (out = nElem - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (numArray[in] > numArray[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    private void swap(int first, int next) {
        int temp = numArray[first];
        numArray[first] = numArray[next];
        numArray[next] = temp;
    }

    public int getLength() {
        return nElem;
    }

    void insertionSort() {

        int in, out;

        for (out = 1; out < nElem; out++) {
            int temp = numArray[out];
            in = out;
            while (in > 0 && numArray[in - 1] >= temp) {
                numArray[in] = numArray[in - 1];
                --in;
            }
            numArray[in] = temp;
        }
    }

    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElem - 1; out++) {
            min = out;
            for (in = out + 1; in < nElem; in++) {
                if (numArray[in] < numArray[min]) {
                    min = in;
                }
            }
            swapit(out, min);
        }
    }

    private void swapit(int out, int min) {
        int temp = numArray[out];
        numArray[out] = numArray[min];
        numArray[min] = temp;
    }

}
