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
  int ele1;
  scanf("%d",&ele1);
  int ele2;
  scanf("%d",&ele2);
  int ele1_idx=-1;
  int ele2_idx=-1;
  for(i=0;i<n;i++)
  {
    if(ele1==arr[i])
    {
      ele1_idx=i;
    }
    if(ele2==arr[i])
    {
      ele2_idx=i;
    }
  }
  printf("%d\n",ele1_idx);
  printf("%d",ele2_idx);
  return 0;
}