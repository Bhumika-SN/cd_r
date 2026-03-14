public class nonrepeating {
    public static void main(String[] args) {

        int[] arr = {4,5,1,2,0,4};

        for(int i=0;i<arr.length;i++){

            boolean repeating = false;

            for(int j=0;j<arr.length;j++){

                if(i!=j && arr[i]==arr[j]){
                    repeating = true;
                    break;
                }
            }

            if(!repeating){
                System.out.println("First non repeating: "+arr[i]);
                break;
            }
        }
    }
}