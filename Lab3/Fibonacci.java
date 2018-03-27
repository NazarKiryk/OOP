package com.tasks3.fibonacci;

public class Fibonacci
{
  public long getNumber(int position){
  if ( position == 1 ) return 1;
     if(position <= 0) return -1; 
      if (position == 2) return 1;
          long r = getNumber(position-2) + getNumber(position-1);
      if (r>0) return r;
      else return -1;
  }
   public Fibonacci(){
   
   }
}