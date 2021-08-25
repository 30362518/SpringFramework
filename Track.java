package com.edureka.AOP;



@Aspect
public class Track {
@Pointcut("execution(* Operation.m* (..))")
public void k() {}

@Before ("k()")
public void myadvice (JoinPoint jp)
{
	System.out.println("additional concern ");
}
}
