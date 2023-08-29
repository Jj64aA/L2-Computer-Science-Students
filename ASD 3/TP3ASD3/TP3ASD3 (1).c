#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//----------------------------------------data structer Graph---------------------------

struct graph{
   
   float key;
   struct s_tree *be;
   struct s_tree *g;
   struct s_tree *d;

} ;
//------------------


//--------------------------------------data structer BST-----------------------------------
struct s_tree{
  float key; // moyen (racine)
  
  struct s_tree *g; // left tree
  struct s_tree *d; // rigth tree

};
//__________________
typedef struct{
                 // structer student contins  code_s and name_s and moyen . Exmple --->  |code_s - name_s - moyen |
   int code_s;
   char name_s[50];
   float moyen;

}student;
//------------------

struct s_tree* newNode(float item)    // cret new node type tree
{
    struct s_tree* temp
        = (struct s_tree*)malloc(sizeof(struct s_tree)); // creat pointer type tree -temp-
    temp->key = item; // contin temp item 
    temp->g = temp->d = NULL;  // left and rigth in temp <=> NULL
    return temp;
}

//---------------------------------------

struct s_tree* insert(struct s_tree* node, float  key)
{
    // If the tree is empty, return a new node 
    if (node == NULL)
        return newNode(key);
 
    // Otherwise, recur down the tree 
    if (key < node->key)
        node->g = insert(node->g, key);
    else if (key > node->key)
        node->d = insert(node->d, key);
 
    // return the (unchanged) node pointer 
    return node;
}
//----------------------------------------
void print_tree(struct s_tree*  root )
{       
//      root pointer input 
      
    if (root!= NULL) { // recsuve tel que adress n'pas NULL
        print_tree(root->g); // apale recsuve 
        printf(" Node bst : %.2f \n",root->key); // affiche contins pointer
        print_tree(root->d);// apale recsuve 
    }
}
//----------------------------------------
struct s_tree *minNode(struct s_tree *bst){

   struct s_tree * temp =bst; // copie adres BST (creat pointer temp tel que temp = input tree bst )
   
   while(temp && temp->g != NULL){  // lops scerch in tree bst bucose scerch the end node in left (min node)
       temp=temp->g;     
   }

   return temp;
   
}
//----------------------------------------
struct s_tree *maxNode(struct s_tree *bst){

   struct s_tree * temp =bst;    // copie adres BST (creat pointer temp tel que temp = input tree bst )
   
   while(temp && temp->d != NULL){  // lops scerch in tree bst bucose scerch the end node in rigth (max  node)
       temp=temp->d;
   }

   return temp;
   
}
//-----------------------------------------
struct s_tree* deleteNode(struct s_tree* root, float key){
    // base case
    if (root == NULL)
        return root;
    // If the key to be deleted
    // is smaller than the root's
    // key, then it lies in left subtree
    if (key < root->key)
        root->g = deleteNode(root->g, key);
    // If the key to be deleted
    // is greater than the root's
    // key, then it lies in right subtree
    else if (key > root->key)
        root->g = deleteNode(root->g, key);
    // if key is same as root's key,
    // then This is the node
    // to be deleted
    else {
        // node with only one child or no child
        if (root->g == NULL) {
            struct s_tree* temp = root->d;
            free(root);
            return temp;
        }else if (root->d == NULL) {
            struct s_tree* temp = root->g;
            free(root);
            return temp;
        }
        // node with two children:
        // Get the inorder successor
        // (smallest in the right subtree)
        struct s_tree* temp = minNode(root->d);
 
        // Copy the inorder
        // successor's content to this node
        root->key = temp->key;
 
        // Delete the inorder successor
        root->d = deleteNode(root->d, temp->key);
    }
    return root;
}
//-----------------------------------------

//-----------------------------------------
int  iterativeSearch(struct s_tree* root, float key)
{
    // Traverse until root reaches to dead end
    while (root != NULL) {
        // pass right subtree as new tree
        if (key > root->key)
            root = root->d;
 
        // pass left subtree as new tree
        else if (key < root->key)
            root = root->g;
        else
            return 1; // if the key is found return 1
    }
    return 0;
}
//-----------------------------------------
void BinaryTree2GRAPH(struct s_tree* root, struct s_tree** head)
{
    // Base case
    if (root == NULL)
        return;
  
    // Initialize previously visited node as NULL. This is
    // static so that the same value is accessible in all
    // recursive calls
    static struct s_tree* prev = NULL;
  
    // Recursively convert left subtree
    BinaryTree2GRAPH(root->g, head);
  
    // Now convert this node
    if (prev == NULL)
        *head = root;
    else {
        root->g = prev;
        prev->d = root;
    }
    prev = root;
  
    // Finally convert right subtree
    BinaryTree2GRAPH(root->d, head);
}
//--------------
struct graph* creat_graph(float key){
     
     struct graph* temp = (struct graph*)malloc(sizeof(struct graph)); // new node (graph)
     
     temp->key=key; // new node (graph) value graph ( one sommet == key input)
     
     temp->be=NULL; // adrre befuer NULL
     
     temp->g=NULL; // adress left NULL
      
     temp->d=NULL; // adress rigth  NULL

   return temp;
}
//--------------
struct graph *new_node_graph(float key, struct s_tree* befuer){
      
     struct graph* temp = (struct graph*)malloc(sizeof(struct graph)); // temp is new node in graph 
     
     temp->key=key; // key temp <=> key input 
     
     temp->be=befuer; // adress temp (be) <=> poniter befuer 
     
     temp->g=temp->d=NULL; // temp left and rigth == NULL
     
   return temp; // return temp 

}
//--------------
void print_graph(struct s_tree *root1,struct s_tree *root2,struct graph *graph )
{       
    if(graph->be ==NULL)    printf(" Node graph : %.2f \n",graph->key);   
      
    else{ 
            if(root1!= NULL) { // recsuve tel que adress n'pas NULL
            print_graph(root1->g,root1->g->d,graph); // apale recsuve 
            printf(" Node graph : %.2f \n",root1->key); // affiche contins pointer
            print_graph(root1->d,root1->d->d,graph);// apale recsuve 
    }
           
            if(root2!= NULL) { // recsuve tel que adress n'pas NULL
            print_graph(root2->g,root2->g->d,graph); // apale recsuve 
            printf(" Node graph : %.2f \n",root2->key); // affiche contins pointer
            print_graph(root2->d,root2->d->d,graph);// apale recsuve 
    }
    
    }
}
//--------------

/*/--------------
void trv(struct s_tree *tree,struct graph *ga){
  if(tree != NULL){
    trv(tree->g,ga->be);
    ga->key=tree->key;
    trv(tree->d,ga->be);
  
  }
}

//-------------------------------------------------*/
int main()
{   


printf("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    printf("                                                                                        TP ASD3 \n\n -The objective of this work :\n\n   Operations on BST and Graphe (Data structures) .\n\n -General explanation :\n\n   In this final work, we aim to use the binary trees seen in the course to store the information about our students. The information are stored firstly in a CSV file like this: \n\n   Code;L_Name;Mark\n\n   0001;Abdelhakim;14.5\n\n   0004;Farid;10.4\n\n   …… \n\n -Additional operations in a project :\n\n   creat tree BST Without reading from\n\n   insert in BST and Remove serche in max and min \n\n");
    
    printf("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    
    printf("\n\n\n");
    printf("  Do want read in CSV or cret Tree BST Dynamic \n\n   yes --> y (read CSV)\n   No  --> n (creat BST)\n   [Input] : ");    
    char increat; // this is varible increat  related to the answer to a question (read csv or creat bst ).
    scanf("%c",&increat);    // lire varible increat 
    printf("\n\n"); 
    if(increat == 'n'){
      
      struct s_tree * mytree =NULL;  // arbar bst 
      
      printf("   Gev me number nodes in tree : ");
      int ele; // this is a varible number elemant in bst  
      scanf("%d",&ele); //lire varible ele 
      printf("\n\n");
      printf("   Reding element BST ... \n");
      
      while(ele > 0){ // lops as long as ele != 0 (ele = 0 ==> read all node )
        printf("    Node   : ");
        float eleread; // this is a varible number read and insert  in bst 
        scanf("%f",&eleread);
        mytree=insert(mytree,eleread); // aple function insert in tree 
        ele--;
      }
      printf("\n\n");
      printf("operaction  completed ..!\n");
      printf("\n------------TREE BST-----------\n");
      print_tree(mytree);
      printf("-------------------------------\n");
      
      int ga = 1; // this is a varible ga related to the answer to a question (repter or no )
      do{
      printf("\n\n");
      printf("   Chose an operction  :\n         1-insert in BST\n         2-print BST \n         3-MIN NODE in BST \n         4-MAX NODE in BST\n         5-Delet item in BST\n         6-Seaech item in BST         [input] : ");
      int op;   // varible choose an option 
      scanf("%d",&op);
      if(op==1){  // op = 1  so  insert in BST
      
         printf("\n   Enter item insert in BST : ");
         float inele; // varible read item 
         scanf("%f",&inele);
         mytree=insert(mytree,inele); // call up function insert and inesrt item reading (inele) in bst 
      }
      if(op==2){  // op = 2  so print tree BST  
        
        printf("\n------------TREE BST-----------\n");
        print_tree(mytree);
        printf("-------------------------------\n");
        printf("operaction  completed ..!\n");
        
      }
      if(op==3){ // op = 3 so serch in min node in bst 
         struct s_tree *min=minNode(mytree); // call up  function minnode scerching min and return 
         printf("\nMIN Node in BST --> %.2f \n\n",min->key); // affiche min in bst 
         printf("operaction  completed ..!\n");
      }
      if(op==4){// op = 4 so serch in MAX node in bst 
         struct s_tree *max=maxNode(mytree); // call up  function minnode scerching MAX and return 
         printf("\nMAX Node in BST --> %.2f \n\n",max->key);// affiche MAX in bst
         printf("operaction  completed ..!\n");
      }
      
      if(op==5){ // op =5 so delat node in bst 
         printf("\n   Enter item Remove in BST : ");
         float REele; // this is a varible REele related
         scanf("%f",&REele);
         mytree=deleteNode(mytree,REele); // call up function deletNode in bst .
         printf("\noperaction  completed ..!\n");  
            
      }
      if(op==6){  // op = 6 so serching in node in bst 
         printf("\n   Enter item Seraching  in BST : ");
         float SEele; // this is a varible SEele related
         scanf("%f",&SEele);// read SEele
         
         
         
         if(iterativeSearch(mytree,SEele)==1){ // call up function iterativeSearch for searching and return boollen 
           printf("\n   Item exist in BST \n");
         }else{
           printf("\n   Item not exist in BST \n");
         }
           
         
           
         printf("\noperaction  completed ..!\n");
      }
      
      
      printf("\n   Do you want repeter operction : \n    Yes --> 1\n    No  --> 0\n    [input] : ");
      scanf("%d",&ga);
      if(ga != 1){
         ga =0;
         }
         
      }while( ga == 1);
      
      
      
    }// increat == n  <=> creat  tree bst dynamic 
    
    
    
    
    
    
    
    if(increat =='y'){
      
    FILE *fp;
    fp=fopen("data.csv","r");
    if(fp==NULL){
        printf("error\n");
        exit(0);
    }

    

    student stu[100];

    int read = 0;
    int recods = 0;
    do{

        read =fscanf(fp,
                     "%d;%49[^;];%f\n",
                     &stu[recods].code_s,
                     &stu[recods].name_s,
                     &stu[recods].moyen );
        if(read == 3){ recods ++ ;}
        if(read != 3 && !feof(fp)){
            printf("file format ..  \n");
            return 1;
        }
        if(ferror(fp)){
            printf("error2 \n");
            return 1;
        }
    }while(!feof(fp));

    fclose(fp);
    printf("---------------------------------------");
    printf("\nNumbers item   in file data.CSV : %d  . \n",recods);
    printf("---------------------------------------\n\n");
    printf("---------------File CSV----------------\n\n");
    printf("\ncode L_name  Mark \n"); 
    printf("-------------------------------\n");
    for(int i = 0;i<recods;i++){
    
        printf(" %d   %s  %.2f  \n",stu[i].code_s,stu[i].name_s,stu[i].moyen);
    
      }
    printf("-------------------------------\n");
    
      
    struct s_tree * bst;
       // arbar BST 
      
    for(int j=0;j<recods;j++){
    
        bst=insert(bst,stu[j].moyen);
     
     }
     struct s_tree *copiebst=bst;   // arbar BST 
     printf("\noperaction  completed ... \n");
     printf("\n------------TREE BST-----------\n");
     print_tree(bst);
     printf("-------------------------------\n");
     printf("do you want scervhing in csv gev moyen :");
     float m_csv ;
     
     scanf("%f",&m_csv);
     printf("-------------------------------\n");
     for(int q=0;q<recods;q++){
    
        if(stu[q].moyen==m_csv){
           printf(" code : %d \n name : %s\n moyen : %f\n",stu[q].code_s,stu[q].name_s,stu[q].moyen);
        }
     
     }
     printf("-------------------------------\n");
     
     // struct s_tree * creat_graph(struct s_tree *a,struct s_tree *b,float key) 
     
   //  struct s_tree *graph =creat_graph(bst->g,bst->d,bst->key);
   
   struct graph *G=creat_graph( copiebst->key);
   
     printf("test003graph\n");
     print_graph(G->g,G->d,G);
     
       
     
     
     
     
     
     
     
     
     
     
     
     
      }// fin (oprection read in csv )
      
      
      
      
      
      
      
      
      
      
      if(increat != 'n'  &&  increat != 'y'){
          printf("   Error input ");}
     
     // ||
    return 0;
}

