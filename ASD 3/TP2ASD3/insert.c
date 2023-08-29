#include "mylib.h"

struct mylist * insertR(struct mylist** head,int v){

       struct mylist *temp=(struct mylist*)malloc(sizeof(struct mylist)); // this line cret new noed .

       temp->val= v;    // We put value in new noed

       temp->prv=NULL;  // .... and prvese ==>NULL because adding in bigen .

       temp->next=(*head);

       if((*head)!= NULL){  //This is a process that does in addition to bidirectonal linked list (mylist ==> head) .

          (*head)->prv = temp;
       }
       else{

       (*head)=temp;  // This is a case  ===> head==NULL

       }

       return (*head);
}
