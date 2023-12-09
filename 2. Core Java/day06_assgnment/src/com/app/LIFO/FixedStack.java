package com.app.LIFO;

public class FixedStack implements Stack
{
	private Employee[] stack;
	private int top;
	
	
	public FixedStack() 
	{
		this.stack = new Employee[STACK_SIZE];
		this.top = -1;
	}
	
	@Override
	 public void push(Employee e)
	{
		if(top<STACK_SIZE-1) 
			{
			 stack[++top]=e;
			}
		else
			System.out.println("The FixedStack has reached its limits. Push Failed!");
	}

	@Override 
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