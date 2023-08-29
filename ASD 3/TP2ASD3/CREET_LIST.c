#include "mylib.h"



 struct mylist* creatE(){

    struct mylist* head=(struct mylist *)malloc(sizeof(struct mylist));   //creet new ned and val in new ned = 0
    head->next=NULL;  //      =================
    head->prv=NULL;  //       = NU =  0  = NU =   <---- new ned in function creat.
    head->val=0;    //        = LL =     = LL =
    return head;    //        =============
}
