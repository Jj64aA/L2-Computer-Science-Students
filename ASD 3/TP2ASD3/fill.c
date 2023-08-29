#include "mylib.h"

struct mylist * fillR(struct mylist **head,int N){

    for(int i=1;i<=N;i++){

        srand(time(NULL));

        int r = rand();

        insert(&head,r);
    }


    return (*head);
}
