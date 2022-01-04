
Class Solution{
    public void reverse(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            arr[i]^=arr[arr.length-i-1];
            arr[arr.length-i-1]^=arr[i];
            arr[i]^=arr[arr.length-i-1];
        }
    }
}