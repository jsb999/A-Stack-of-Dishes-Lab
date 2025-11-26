package org.example;


public class DishStack {
  private Dish[] stackList;
  private int last;
  
  
  public DishStack() {
    this.stackList = new Dish[10]; // default size is 10
    this.last = -1;
  }

  public DishStack(int size){
    this.stackList = new Dish[size];
    this.last = -1;
  }

  public void push(Dish dish){
    if (this.last == this.stackList.length - 1) {
      System.out.println("Stack is full");
    }
    this.stackList[++this.last] = dish;
  }

  public Dish pop(){
    if (this.last == -1) {
      System.out.println("Stack is emprty");
    }
    return this.stackList[this.last--];
  }

  public Dish peek(){
    if (this.last == -1) {
      System.out.println("Stack is emprty");
    }
    return this.stackList[this.last];
  }

  public int size(){
    return last + 1;
  }
}