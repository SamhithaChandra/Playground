#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int fact=1;
  int i;
  for(i=n;i>=1;i--)
  {
    fact=fact*i;
   
  }
   printf("%d",fact);
  
  return 0;
}
