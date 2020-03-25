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
`protected void onCreate(Bundle savedInstanceState) {`</br>
 `       super.onCreate(savedInstanceState);`</br>
  `      setContentView(R.layout.activity_main);`</br>


   `      button = findViewById(R.id.button);`</br>
    `     textView = findViewById(R.id.textViewResult);`</br>
     `    editText = findViewById(R.id.editTexts);`</br>
 `       button.setOnClickListener(new View.OnClickListener() {`</br>
       `          @Override`</br>
        `         public void onClick(View v) {`</br>
  `            Random rand = new Random();`</br>
          `           text = Integer.parseInt(editText.getText().toString());`</br>
           `          random = rand.nextInt(text) + 1;`</br>
            `         textView.setText("" + random);`</br>
             `    }`
     `});`</br>


## Features
List of features ready and TODOs for future development
* Generate random number 

To-do list:
* none

## Status
Project is: _finished_

## Inspiration
As a project for my study.

## Contact
Created by [Marko Vitkovic](https://github.com/MarkoVitkovic) - feel free to contact me!








his randomizer will generate a random number. This is app for android.

Feel free to clone and upgrade app.


![](https://github.com/MarkoVitkovic/Randomizer_java/blob/master/random.png)




Double-Linked_List

Da bi se sa podacima moglo raditi kao sa stogom potrebne su slijedeće metode:

- peek – vraća slijedeći element sa stoga ali element ostaje u stogu
- push - stavlja novi element na stog
- pop – dohvaća element sa stoga

Za rad kao sa redom:

- offer – stavlja element na kraj reda
- poll – dohvaća element sa početka reda
- element – dohvaća element sa početka reda ali element ostaje u redu

Od ostalih metoda potrebno je implementirati:

- size – broj elemenata u listi
- isEmpty – da li je lista prazna
- contains - da li lista sadržava neki element
- toString – formatira string sa vrijednostima elemenata u listi 
