package SeoulCyberUniversity.test1;

class Sort{
    int test = 0;
    // 버블소트에 대한 소스코드 작성
    public void bubbleSort(int a[]){
        int b;

        for(int i = 0 ; i < a.length ; i ++) {
            int test = i+1;

            if(i+1 < a.length) {
                System.out.println("버블정렬"+test+"단계 :");
            }

            for(int j = 0 ; j < a.length -i -1 ; j ++) {
                if(a[j]>a[j+1]) {
                    b = a[j];
                    a[j] = a[j+1];
                    a[j+1] = b;
                }

                for(int iiii=0; iiii<a.length; iiii++) {
                    System.out.printf(" %d", a[iiii]);
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public void sort(int[] data, int l, int r) {
        int left = l;
        int right = r;
        int pivot = data[(l + r) / 2];
        test = test + 1;

        do {
            while (data[left] < pivot)
                left++;
            while (data[right] > pivot)
                right--;

            if (left <= right) {
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        } while (left <= right);
        System.out.println("[퀵정렬 " + test + " 단계 : pivot =" + pivot + "]");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println();
        if (l < right)
            sort(data, l, right);
        if (r > left)
            sort(data, left, r);
    }

}