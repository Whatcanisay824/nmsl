public class BubbleSort {
    public void BubbleSort(int [] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
              System.out.println("i value is"+i+"and j value is"+j);
              if(array[j]>array[j+1]){
                  int temp=array[j];

                  array[j]=array[j+1];
                  array[j+1]=temp;
              }

            }
        }
        for(int j=0;j<array.length;j++){
            System.out.println(array[j]+",");
        }
    }

}
