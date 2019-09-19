#include<stdio.h>
int main()
{
  int n,last,fist,sum;
  scanf("%d",&n);
  last=n%10;
  while(n>10)
  {
    n=n/10;
  }
  fist=n;
   sum=fist+last;
  printf("%d",sum);
  return 0;
}