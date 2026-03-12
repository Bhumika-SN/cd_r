public class sort{
    public static void main(String[] args){
        int arr[]={0,2,1,2,0,1};

        int count0=0,count1=0,count2=0;

        for(int num:arr){
            if(num==0) count0++;
            else if(num==1) count1++;
            else count2++;
        }

        int i=0;

        while(count0-->0) arr[i++]=0;
        while(count1-->0) arr[i++]=1;
        while(count2-->0) arr[i++]=2;

        for(int num:arr)
            System.out.print(num+" ");
    }
}

//Sort an Array of 0s, 1s, and 2s