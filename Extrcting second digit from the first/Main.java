#include<stdio.h>
int main()
{
  int n,last;
  scanf("%d",&n);
  while(n>100)
  {
    n=n/10;
  }
  last=n%10;
  printf("%d",last);
  return 0;
}