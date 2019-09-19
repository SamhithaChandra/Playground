#include<stdio.h>
int main()
{
  int n ,i,Quotient,Remainder;
  n=365;
  i=4;
  Quotient=n/i;
  Remainder=n%i;
  printf("Quotient: %d\nRemainder: %d",Quotient,Remainder);
  return 0;
}