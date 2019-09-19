#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n],i;
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int max;
  if(arr[0]>arr[1])
  {
    max=arr[0];
  }
  else
    max=arr[1];
  for(i=2;i<n;i++)
  {
    if(arr[i]>max)
    {
      max=arr[i];
    }
  }
  printf("%d",max);
  return 0;
}