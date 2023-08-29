#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct player{ //declraction structer
 char Name[20];
 char place;
 int Nb;
 struct player *next;
};
struct player *New_player(char Name[],char place , int nb){

   struct player *p=(struct player *)malloc(sizeof(struct player ));
   strcpy(p->Name,Name);
   p->Nb =nb ;
   p->place =place ;
  // p->next=NULL;
   return p;
}

// facnction add player
struct player *Add_player(char name[],int nb,char place,struct player *team0){
    struct player *p = New_player(name,place,nb);
    p->next=team0;
    return p;


}



// create teame
struct player * create_teame(char name[],char place , int nb){


    struct player *team0=(struct player* )malloc(sizeof(struct player ));

    if(place!='G'){
        printf("Please enter a goalkeeper to create a team .. !");
    }
    strcpy(team0->Name,name);
    team0->place='G';
    team0->Nb=nb;
    team0->next=NULL;

    return team0; // return team and goalkeeper in team
}
// delt player <> Exlude()

int Exlude(int nb,struct player **team){
   if ((*team)->Nb == nb) {
       struct player *temp = *team;
        *team = (*team)->next;
        free(temp);
        return 1;
        }
       else {

          struct player *temp = *team;
          struct player *p;
          while (temp->next != NULL)
            {
              if (temp->next->Nb == nb) {
                 p = temp;
                 temp->next = temp->next->next;
                 free(p);

                 return 1;
                 }

                else temp = temp->next;
                }

                 }

               return 0;


}
// change player1 by player2
int Exchange(struct player *p1,int nb,struct player **team){

if ((*team)->Nb == nb) {
struct player *p2 = *team;
p2 = *team;
p1->next = (*team)->next;
*team = p1;
free(p2);

return 1;
}
else {
struct player *temp = *team;

while (temp->next != NULL)
{
if (temp->next->Nb ==nb) {
struct player *p2 = temp->next;
p1->next = temp->next->next;
temp->next = p1;
free(p2);

return 1;
}

else temp = temp->next;
}

}

return 0;


    /*
    struct player *temp = team;
    if(temp==p1){//f begin
      p2=temp->next;
      free(p1);
      return 1;
    }
    while(temp->next != p1){
        temp=temp->next;
    }
    if(p1->next!=NULL){  //if mid
    p2=p1->next;
    temp->next=p2;
    free(p1);
    return 1;
    }else{   //if end
    temp->next=p2;
    free(p1);
    p2->next=NULL;
    return 1;
    }
    */
}
void affiche_team(struct player *team ){

        struct player *tmp=team;
        int i=1;
        while(team!=NULL){
            printf("P%d\n",i);
        //affiche_team(team->next);
            printf("name player -- %s\n",team->Name);
            printf("numb player -- %d\n",team->Nb);
            printf("plac player -- %c\n",team->place);
            printf("------------------\n");
        i++;
          team=team->next;
     }


}





int main(){
    char name[20];
    char place1='G';
    //char temp;
    int nb;
    char temp;
    char temp1;
    struct player *p=NULL;
    struct player *team;
    printf("==================== FootBall Team ====================\n");
    printf("-Football Team\n");
    printf(" Enter the name of a goalkeeper for the new team :");
    gets(name);
    //gets(name);
    printf(" Player number  : ");
    scanf("%d",&nb);
    team=create_teame(name,place1,nb);  // create new teame

     char repns='y';
    do{
          //  char repns;
     int ga;
     int bo1;
     do{
            printf("-Choose from the following goods :\n");
            printf("-add player--->1\n");
            printf("*Enter :");
            scanf("%d",&ga);
         if(ga==1){  // ADD PLAYER
            char name0[20];
            int nb0;
            char pu;
            printf("  *Gev me  name add player  : ..");
            gets(name0);
            gets(name0);
            printf("  *Gev me  number add player: ..");
            scanf("%d",&nb0);
            printf("  *Gev me  place add player : ..");
            scanf("%c",&pu);
            scanf("%c",&pu);
            team=Add_player(name0,nb0,pu,team);
            }

        printf("-Do you want add PLAYER   ---->1/yes or  0/no  ");
        scanf("%d",&bo1);
     }while(bo1==1); //add


     affiche_team(team);

     struct player* e;
     struct player*p0;
     int ga1;
     int bo2;
     do{
            printf("-Choose from the following goods :\n");
            printf("-New player--->1\n-Change player to player--->2:\n-Delete the player--->3\n");
            printf("*Enter :");
            scanf("%d",&ga1);
         if(ga1==1){  //NEW PLAYER
            char name1[20];
            int nb1;
            char pm;
            printf("  *Gev me new name player  : ..");
            gets(name1);
            gets(name1);
            printf("  *Gev me new number player: ..");
            scanf("%d",&nb1);
            //scanf("%d",&nb1);
            printf("  *Gev me new place player : ..");
            scanf("%c",&pm);
            scanf("%c",&pm);
            p0=New_player(name1,pm,nb1);
            e=p0;
          }
         if(ga1==2){ //CHANGE PLAYER
            int re; //reselte operaction in change
            struct player *c1=team;
            struct player *ch=NULL;
            printf("  *Gev me number player you want change: ..");
            int nb2;
            scanf("%d",&nb2);


             //e ---> player change
            if(Exchange(e,nb2,&team)==1){
                 printf("   -Operation completed\n");
            }else{
            printf("   -Operation non completed\n");
            }
            }

          if(ga1==3){ // DELT PLAYER

            struct player *c2=team;// c2 et c1 contor in liste sort
            //struct player *ch1;
            printf("  *Gev me number  player(delt)  : ..");
            char name3[20];
            int nb3;
            scanf("%d",&nb3);
            if(Exlude(nb3,&team)==1){
                  printf("   -Operation completed\n");
             }else{
              printf("   -Operation non completed\n");
             }
           }
        printf("-Do you want to change player to player or Do you want to delete the player---->1/yes or  0/no  ");
        scanf("%d",&bo2);
     }while(bo2==1);

    affiche_team(team);

         printf("- Do repeat operations ..! (Y/N) :");

         scanf("%c",&repns);
         scanf("%c",&repns);

         }while(repns=='y'   ||     repns=='Y');

    printf("===================Team Footboll==================\n");
    printf("------------------\n");
    affiche_team(team);


    printf("==================================================\n");
    printf("\n\n\n\n===============\nEnd of Program\n===============\n\n ");

    return 0;
}
