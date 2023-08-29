#include "mylib.h"


void printlist(struct mylist* head){  //          this function affiche all noeds in mylist .

    int k=1;

    while(head != NULL){   //                     Condition for continuation head not equval NULL .

        printf("Noed %d : %d \n",k,head->val); // affiche(noed)
        k++;
        head=head->next; //                       head Step forward  .

    }

}
