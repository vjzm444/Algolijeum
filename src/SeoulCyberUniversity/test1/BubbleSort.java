package SeoulCyberUniversity.test1;

public class BubbleSort {
	public static void main(String[] args){
		System.out.printf("시작~~~");

		int arr_bubble[] = {69, 10, 30, 2, 16, 8, 31, 22}; //버블소트에 사용될 배열
		int arr_quick[] = {69, 10, 30, 2, 16, 8, 31, 22}; // 삽입정렬에 사용될 배열

		Sort S = new Sort();

		System.out.printf("\n버블 정렬로 정렬할 원소 : ");
		for(int i=0; i<arr_bubble.length; i++) {
			System.out.printf(" %d", arr_bubble[i]);
		}
		System.out.println();
		System.out.println();
		S.bubbleSort(arr_bubble);


		System.out.printf("\n\n\n삽입 정렬로 정렬할 원소 : ");
		for(int i=0; i<arr_quick.length; i++) {
			System.out.printf(" %d", arr_quick[i]);
		}
		System.out.println();
		System.out.println();

		S.sort(arr_quick, 0, arr_quick.length-1);

	}


}