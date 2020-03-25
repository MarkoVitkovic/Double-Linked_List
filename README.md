# Double Linked List
> Double linked list, feel free to clone or download and use it.

## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info

Double-Linked_List</br>

Stack:</br>

* peek – return next element from stack but element stays in stack</br>
* push - put new element at stack</br>
* pop – take element from stack</br>

Queue:</br>

* offer – puts element at the end of queue</br>
* poll – take element from 1st index in the queue</br>
* element – take element from 1st index in the queue but element stays in queue</br>

Other methods:</br>

* size – number of list elements</br>
* isEmpty – is list empty</br>
* contains - is list contain</br>
* toString – string with values in list </br>

## Technologies
* [JAVA](https://docs.oracle.com/en/java/) - version 7


## Setup
1.Launch IntelliJ IDEA.</br>

* If the Welcome screen opens, click Create New Project.</br>

* Otherwise, from the main menu, select File | New | Project.</br>

2.In the New Project wizard, select Java from the list on the left.</br>

3.From the Project SDK list, select the JDK that you want to use in your project.</br>

* If the list is empty, click New and specify the path to the Java home directory (for example, jdk-11.0.0.jdk).</br>

![](https://resources.jetbrains.com/help/img/idea/2019.3/java-t-create-new-project.png)</br>

4.We're not going to use any additional libraries or frameworks for this tutorial, so click Next.</br>

5.Don't create a project from the template. In this tutorial, we're going to do everything from scratch, so click Next.</br>

6.Name the project, for example: HelloWorld.</br>

7.If necessary, change the default project location and click Finish.</br>
![](https://resources.jetbrains.com/help/img/idea/2019.3/jt-project-name.png)</br>


## Code Examples
Code:</br>
` public void push(Object obj) {                                                                                                                  NODE newNode = new NODE(obj);
        NODE newNode = new NODE(obj);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }`


## Status
Project is: _finished_

## Inspiration
As a project for my study.

## Contact
Created by [Marko Vitkovic](https://github.com/MarkoVitkovic) - feel free to contact me!










