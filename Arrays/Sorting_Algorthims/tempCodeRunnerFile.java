
        }
        System.out.println("count i : "+count+"\ncount j : "+count2+"\nSwap : "+count3);
    }
}



class insertion_sort{
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int arr[] = {43,33,12,19,2,24,15,65,45,28};
        for(int num:arr){
            System.out.println("Ansorted arry: "+num);
        }
        sort.sort(arr, arr.length);
        for(int num:arr){
            System.out.print(" "+num);
        }
    }
}