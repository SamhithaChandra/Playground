#include<stdio.h>
int main()
{
  int n,r,l,sum=0;
  scanf("%d",&n);
  int temp=n;
  while(n>0)
  {
    r=n%10;
    l=r*r*r;
    sum=sum+l;
    n=n/10;
  }
  n=temp;
  if(sum==temp)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  return 0;
}
    