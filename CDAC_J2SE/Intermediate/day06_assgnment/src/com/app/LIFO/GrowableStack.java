package com.app.LIFO;	
public class GrowableStack implements Stack
{
	
	private int Adaptive_size;
	private Employee[] stack ;
	private int top;
	
	public GrowableStack() 
	{
		Adaptive_size=STACK_SIZE;
		stack=new Employee[Adaptive_size] ;
		 top=-1;
	}
	
	public GrowableStack(GrowableStack old) 
	{
		this.Adaptive_size=old.Adaptive_size*2;
		this.stack=new Employee[this.Adaptive_size];
		for(int i=0;i<=old.top-1;i++) 
		{
			this.stack[i]=old.stack[i];
		}
		this.top=old.top-1;
	
	}
	
	public void push(Employee e) throws ArrayIndexOutOfBoundsException
	{
		 stack[++top]=e;
	}
	
	 
	public Employee pop() 
	{
		if(top>-1) 
		{ 
			Employee tmp=stack[top];
			stack[top--]=null;		
			return tmp;
		}
		return null;
	}



}