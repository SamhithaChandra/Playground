#include<stdio.h>
int main()
{
  int n,r;
  scanf("%d",&n);
  int temp=n;
  int i;
  int sum=0;
  while(n>0)
  {
    r=n%10;
    int fact=1;
    for(i=r;i>=1;i--)
    {
      fact=fact*i;
    }
    sum=sum+fact;
    n=n/10;
  }
  n=temp;
  if(sum==n)
    printf("Yes");
  else
    printf("No");
  return 0;
}
      