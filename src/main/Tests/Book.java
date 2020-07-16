package main.Tests;

import java.util.LinkedHashSet;

public class Book {
String name,author,publisher;
int pages,quantity;

public Book(String name,String author, String publisher,int pages,int quantity)
{
    this.name = name;
    this.author = author;
    this.publisher = publisher;
    this.pages = pages;
    this.quantity = quantity;

}
public static void main(String args[])
{
    LinkedHashSet<Book> B1 = new LinkedHashSet<Book>();
    Book B2 = new Book("Jyothsna","Jyothsna","Haytanpublisher",400,100);
    Book B3 = new Book("Sahastory","Saha","MedianP",300,10);
    Book B4 = new Book("Lionking","edin","Median",200,15);
    B1.add(B2);
    B1.add(B3);
    B1.add(B4);
    for(Book B:B1)
    {
        System.out.println(B.name +" "+ B.author +" "+ B.publisher +" "+ B.pages +" "+ B.quantity );
    }
}

}
