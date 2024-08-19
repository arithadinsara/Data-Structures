
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class QuickSort {
    public static void main(String[] args) {
      
       int[] array={50,23,9,18,61,32};
    
       QuickSort(array,0,array.length-1);
       
       for(int k:array){
           System.out.print(k+" ");
       }
    }
       public static void QuickSort(int[] array,int lb,int ub){
        if(lb<ub){
            int pi=Partition(array,lb,ub);
            QuickSort(array,lb,pi-1);
            QuickSort(array,pi+1,ub);
        }
    }
    
    public static int Partition(int[] array,int lb,int ub){
        int pivot=array[lb];
        int start=lb;
        int end=ub;
        while(start<end){
             while(array[start]<=pivot){
             start++;
             
        }
        
        while(array[end]>pivot){
            end--;
                }
        if(start<end){
              int temp=array[start];
              array[start]=array[end];
              array[end]=temp;
        }       
    }
   
    array[lb]=array[end];
    array[end]=pivot;
     return end;
}
}

 
