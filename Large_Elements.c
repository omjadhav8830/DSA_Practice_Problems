#include <stdio.h>
#include <stdlib.h>

// Function to check if the array is sorted
int largest(int arr[], int n) {
    // Code Here
    int lar = arr[0];
    
    for(int i=1;i<n;i++){
        if(arr[i]>lar){
            lar = arr[i];
        }
    }
    return lar;
}
