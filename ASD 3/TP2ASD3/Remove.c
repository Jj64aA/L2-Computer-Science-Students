#include "mylib.h"

/*
this function Remove linked list but with the following specification (knowledge in library mylib.h) :
 1-bidirectonal linked list.
 2-remove in all posiction.
*/

struct mylist * RemoveR(struct mylist **l,int v){
    int error=0;
    if((*l)==NULL) return NULL;
    struct mylist* temp=(*l); // temp pontier in linked list l .
    struct mulist* k;
    //delt in begin linked list .
    if(temp->prv == NULL && temp->val==v){
        k=temp;
        temp=temp->next;
        temp->prv=NULL;
        free(k);
        (*l)=temp;
        return *l;
    }else{   //this else ==> temp->prv != NULL .

         while(temp->val!=v){
            temp=temp->next;
            if(temp->next==NULL) break; // cas value v n'est pas in linked list.
         }


         if(temp->next!=NULL){ // this if ==> temp->prv != NULL  and  temp->next!=NULL , delt in milieu linked list .

            k=temp;
            temp->prv->next=temp->next;
            temp->next->prv=temp->prv;
            while(temp->prv!=NULL){
                temp=temp->prv;
            }
            free(k);
            (*l)=temp;
            return *l;

         }else{  //this else ==> temp->prv != NULL and temp->next==NULL donc delt valuer v in fin linked list .

            k=temp;
            temp=temp->prv;
            temp->next=NULL;
            free(k);
            (*l)=temp;
            return *l;


         }

         }


}
