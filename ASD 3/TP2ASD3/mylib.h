#ifndef MYLIB_H_INCLUDED
#define MYLIB_H_INCLUDED

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>


/*

 This is library in which we define our own function .
                 #include "mylib.h"
*/

//-------------------------------------------------------
struct mylist{  // DECLARACTION BIDIRECTIONAL LINKED LIST .
  int val;
  struct mylist *next;
  struct mylist *prv;
};

//--------------------------------------------------------

struct mylist* creatE();// This function creat bidirectonal linked list , file name :CREET_LIST.c  .

//--------------------------------------------------------

struct mylist* RemoveR(struct mylist **l,int v);//This function Remove ned  in  bidirectonal linked list , file name :Remove.c  .

//--------------------------------------------------------

struct mylist * insertR(struct mylist** head,int v); //this function adding neod in bidirectonal linked list , file name :insert.c .

//--------------------------------------------------------

void    printlist(struct mylist* head);  // this function affichage  all noeds in idirectonal linked list , file name : printlist.c .

//--------------------------------------------------------

struct mylist * fillR(struct mylist *head,int N)

//--------------------------------------------------------
#endif // MYLIB_H_INCLUDED
