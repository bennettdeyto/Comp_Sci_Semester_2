class starter{
    public static int getMedian(int[] x){
        int split;
        if(x.length%2 == 0){
            split = x.length/2 - 1;
        }
        else{
            split = x.length/2;
        }
        return x[split];
    }
    public static int getMode(int[] x){
        int repeats = 0;
        int mode;
        for(int i = 0; i < x.length; i++){
            for(int z = 0; z < x.length; z++){
                if(x[i] == x[z]){
                    repeats = repeats + 1;
                }
            }
        }
    }
    public static void main(String[] args){
        int [ ] arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};	
	    int [ ] arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
	    int [ ] arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
        int [ ] arr4 = {1, 2, 3, 4, 5, 6, 7};
        int [ ] arr5 = {1, 2, 3, 4, 5, 6};
        System.out.println(getMedian(arr4));
        System.out.println(getMedian(arr5));
    	

    }
}