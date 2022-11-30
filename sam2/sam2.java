// Дана последовательность чисел. Получить список неповторяющихся элементов исходной последовательности
// Пример: [1, 2, 3, 5, 1, 5, 3, 10] => [1, 2, 3, 5, 10]


public class sam2 {
    public static void main(String[] args) {
        int k = 0;
        int j = 0;
        int[] subseq = new int[] {1, 5, 8, 9, 4, 6, 5, 1};  
        //duplicates=false;
        for (j=0; j<subseq.length; j++)
            if (subseq[k] != subseq[j])
                System.out.print(subseq[j]);
            for (k=j; k<subseq.length;k++){
                System.out.print(k);

                //if (subseq[k] != subseq[j])
                    //System.out.print(subseq[k]);
            }
                    
        
    }
    
}
